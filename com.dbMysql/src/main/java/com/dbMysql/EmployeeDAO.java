package com.dbMysql;

import java.sql.*;

public class EmployeeDAO {

    public void insertEmp(Employee emp) {
        try (Connection conn = DBconnection.getConnection();
             CallableStatement cs = conn.prepareCall("{call insert_employee(?,?,?)}")) {

            cs.setInt(1, emp.getId());
            cs.setString(2, emp.getName());
            cs.setString(3, emp.getDept());

            cs.execute();
            System.out.println("Inserted!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void display() {
        try (Connection conn = DBconnection.getConnection();
             CallableStatement cs = conn.prepareCall("{call get_employee()}");
             ResultSet rs = cs.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("empid") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("dept")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getEmployeesByDept(String dept) {
        try (Connection conn = DBconnection.getConnection();
             CallableStatement cs = conn.prepareCall("{call return_table(?)}")) {

            cs.setString(1, dept);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("empid") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("dept")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void getOneEmployeeNameByDept(String dept) {
        try (Connection conn = DBconnection.getConnection();
             CallableStatement cs = conn.prepareCall("{call get_one_employee_by_dept(?, ?)}")) {

            
            cs.setString(1, dept);

            
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);

            cs.execute();

            
            String name = cs.getString(2);

            System.out.println("Employee Name: " + name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteEmployeeById(int id) {
        try (Connection conn = DBconnection.getConnection();
             CallableStatement cs = conn.prepareCall("{call delete_employee(?)}")) {

            cs.setInt(1, id);

            int rows = cs.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("No employee found with given ID.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}