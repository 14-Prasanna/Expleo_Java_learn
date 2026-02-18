/**
 * 
 */
package ConditionalStatement_hand_on;

/**
 * 		Write a program using for loop to print alphabets as follows:
		az by cx dw ev fu gt hs ir jq kp lo mn nm ol pk qj ri sh tg uf ve wd xc yb za
 */
public class AlphaPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char a = 'a';
        char z = 'z';

        for (int i = 1; i <= 13; i++) {
            System.out.print(a + "" + z + " ");
            a++;
            z--;
        }

	}

}
