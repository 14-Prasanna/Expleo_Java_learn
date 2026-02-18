/**
 * 		Arun and Naveen are playing a dice game. Each one will get one chance to roll the
		dice. Dice values are recorded in two different tables. After 10 turns, the winner has
		to be decided by calculating each value recorded in each table.
 */
package array_hand_on;

import java.util.Scanner;

/**
 * 
 */
public class DiceGameWinner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);

        int[] arun = new int[10];
        int[] naveen = new int[10];

        int arunTotal = 0;
        int naveenTotal = 0;

       
        System.out.println("Enter 10 dice values for Arun:");
        for(int i = 0; i < 10; i++){
            arun[i] = sc.nextInt();
            arunTotal += arun[i];
        }

        
        System.out.println("Enter 10 dice values for Naveen:");
        for(int i = 0; i < 10; i++){
            naveen[i] = sc.nextInt();
            naveenTotal += naveen[i];
        }

       
        if(arunTotal > naveenTotal){
            System.out.println("Arun Wins!!!");
        }
        else if(naveenTotal > arunTotal){
            System.out.println("Naveen Wins!!!");
        }
        else{
            System.out.println("Match Draw!!!");
        }


	}

}
