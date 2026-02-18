/**
 * 
 */
package arrays_learn;

import java.util.Scanner;

/**
 * 
 */
public class MovieSeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] vip = new char[5];
		char[][] per = new char[2][];
		
		per[0] = new char[5];
		per[1] = new char[5];
		
		
		char[] regular = new char[5];
		
		Scanner sc = new Scanner(System.in);
		
		int vip_a = 0, vip_book =0, pre_a = 0, pre_book = 0, re_a = 0, re_book = 0;
		
		System.out.println("5 seats available for VIP so book it for booking enter B, default A");
		for(int i=0;i<5;i++) {
			vip[i] = sc.next().charAt(0);
			if(vip[i] == 'A') {
				vip_a ++;
			}
			if(vip[i] == 'B') {
				vip_book++;
			}
		}
		
		System.out.println("5 seats and 2 rows available for Premium so book it for booking enter B, default A");
		for(int i=0;i<2;i++) {
			for(int j=0;j<per[i].length;j++) {
				per[i][j] = sc.next().charAt(0);
			}
		}
		
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < per[i].length; j++) {
		        if (per[i][j] == 'A') {
		            pre_a++;
		        }
		        if (per[i][j] == 'B') {
		            pre_book++;
		        }
		    }
		}   
		
		
		System.out.println("5 seats available for Regular so book it for booking enter B, default A");
		for(int i=0;i<5;i++) {
			regular[i] = sc.next().charAt(0);
			
			if(regular[i] == 'A') {
				re_a ++;
			}
			if(regular[i] == 'B') {
				re_book++;
			}
		}
		
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("SEAT BOOKING DETAILS");
		
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("------- The VIP seat --------------");
		
		for(int i=0;i<5;i++) {
			System.out.print(vip[i] + " ");
		}
		System.out.println("\nThe total seats in VIP: " + " 5 " + "\tBooked seat: " + (vip_a) + "\tAvailable seat: " + (vip_book));
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("----- The Premium  seat ---------- ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<per[i].length;j++) {
				System.out.print(per[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nThe total seats in VIP: " + " 10 " + "\tBooked seat: " + (vip_a) + "\tAvailable seat: " + (vip_book));
		
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("------------ The Regular seat ----------------");
		
		for(int i=0;i<5;i++) {
			System.out.print(regular[i] + " ");
		}
		System.out.println("\nThe total seats in VIP:" + " 5 " + "\tBooked seat: " + (vip_a) + "\tAvailable seat: " + (vip_book));
		

	}

}

