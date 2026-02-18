/**
 * 
 */
package ConditionalStatement_learn;

/**
 * 
 */
public class ConversionExplicit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 10.04;
		long l = (int)d;
		int i = (int)l;
		
		
		byte a = 10;
		double c = (double) (a * 2.0);
		
		System.out.println(((Object)(a * 9)).getClass().getSimpleName());
		
		System.out.println("byte value " + a);
		System.out.println(" value " + c);
		
		System.out.println("double value " + d);
		System.out.println("long value " + l);
		System.out.println("int value " + i);

	}

}
