package com.exceptionhandling;

import java.util.Scanner;

//user defined exception for username
class InvalidUsernameException extends Exception{
 InvalidUsernameException(String s){
     super(s);
 }
}

//user defined exception for password
class InvalidPasswordException extends Exception{
 InvalidPasswordException(String s){
     super(s);
 }
}



public class Password_management {
	
	public static void checkUser(String c) throws InvalidUsernameException
    {

        if(c.length() < 6 || c.length() > 30){
            throw new InvalidUsernameException("InvalidUsernameException");
        }

        if(!Character.isLetter(c.charAt(0))){
            throw new InvalidUsernameException("InvalidUsernameException");
        }

        for(int i=0;i<c.length();i++){
            char x = c.charAt(i);
            if(!(Character.isLetterOrDigit(x) || x=='_')){
                throw new InvalidUsernameException("InvalidUsernameException");
            }
        }
    }
	
	public static void checkPass(String d) throws InvalidPasswordException{

        if(d.length() < 8){
            throw new InvalidPasswordException("InvalidPasswordException");
        }

        boolean l=false,u=false,s=false,n=false;

        for(int i=0;i<d.length();i++){
            char x = d.charAt(i);

            if(Character.isLowerCase(x)) l=true;
            else if(Character.isUpperCase(x)) u=true;
            else if(Character.isDigit(x)) n=true;
            else if("!@#$%^&*()-+".indexOf(x) >= 0) s=true;
        }

        if(!(l && u && s && n)){
            throw new InvalidPasswordException("InvalidPasswordException");
        }
    }



	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        String a = "Prasanna_14";
        String b = "Prasanna@098";

        System.out.println("Enter username:");
        String c = sc.nextLine();

        System.out.println("Enter password:");
        String d = sc.nextLine();

        try{
            checkUser(c);
            checkPass(d);

            if(c.equals(a) && d.equals(b)){
                System.out.println("Welcome " + c);
            }else{
                System.out.println("Invalid username or password");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

 
}


