package interface_1;


class BaseExample1111{
	public BaseExample1111() {
		System.out.println("Base");
	}
}

public class Main extends BaseExample1111 {
	
		public Main(){
			this("Java");
			System.out.println("derived");
		}
		
		public Main(String string) {
			// TODO Auto-generated constructor stub
			
			System.out.println(string);
		}

	public static void main(String args[]) {
		
		new Main();

	}

}
