package ConditionalStatement_learn;

public class TypePromotion {
	public static void main(String[] args) {
		byte b = 42;
		char c = 'c';
		short s = 1024;
		int i = 5000;
		
		float f = 5.56f;
		double d = .70087;
		
		double result = (f*b)+(i/c)+(d*s);
		System.out.print("result = " + result);
		
		
	}
}
