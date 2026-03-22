package handon;


import java.util.*;


public class Problem1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<String> l1 = new ArrayList<>();
		System.out.println("How many names do you want to input? ");
		int a = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<a;i++) {
			System.out.print("Enter the name #" + i + " ");
			String s1 = sc.nextLine();
			l1.add(s1);
		}
		
		System.out.println("Names longer than 5 characters");
		for(String l2 : l1) {
			String s2 = l2;
			if(s2.length() > 5) {
				System.out.println(s2);
			}
			
		}
		
		
		
		sc.close();

	}

}
