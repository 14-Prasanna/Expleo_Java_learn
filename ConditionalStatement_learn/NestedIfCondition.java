/**
 * 
 */
package ConditionalStatement_learn;

/**
 * 
 */
public class NestedIfCondition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 15;
		int weight = 50;
		
		if(age > 18) {
			if(weight > 50) {
				System.out.print("You are eligible to denote blood");
			}
			else {
				System.out.println("Not eligible because you are under weight");
			}
		} else {
			System.out.println("Not eligible because you are under age");
		}

	}

}
