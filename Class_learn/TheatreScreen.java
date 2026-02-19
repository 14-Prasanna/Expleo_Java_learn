/**
 * 
 */
package Class_learn;

/**
 * 
 */
public class TheatreScreen {
	
	private static int totalseat = 20;
	
	TheatreScreen(){
		System.out.println("Current Seat Availability: " + totalseat + "\n");
	}
	
	public void DisplayThreatreScreen() {
		System.out.println("Current seat Availability: " + totalseat);
	}
	
	public static void BookTicket(int noo)
	{
		System.out.println("No. of seat Booked: " + noo + "\n");
		totalseat -= noo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------ Screen Ticket Availability Status ------- \n");
		TheatreScreen TS1 = new TheatreScreen();
		TS1.BookTicket(4);
		
		
		
		TheatreScreen TS2 = new TheatreScreen();
		TS2.BookTicket(5);
		
		TS2.DisplayThreatreScreen();
		
		

	}

}
