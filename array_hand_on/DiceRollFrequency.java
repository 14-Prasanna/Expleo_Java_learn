/**
 * 	Roll the dice 100 times and display the frequency of each number rolled using
	arrays.
 */
package array_hand_on;

import java.util.Random;

/**
 * 
 */
public class DiceRollFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Random random = new Random();

       
        int[] frequency = new int[7];


        for(int i = 0; i < 100; i++) {
            int diceValue = random.nextInt(6) + 1;  
            frequency[diceValue]++;
        }

      
        System.out.println("Dice Roll Frequency after 100 rolls:");

        for(int i = 1; i <= 6; i++) {
            System.out.println("Number " + i + " appeared " + frequency[i] + " times");
        }


	}

}
