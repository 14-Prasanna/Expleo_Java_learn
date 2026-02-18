/**
 * 
 */
package methods_learn;

/**
 * 
 */
public class FirstMethod {
	
	public static void movieDetails(int id, String name, String decription, String genre, String duration, String language, String releasedate, String country) {
		System.out.println("The movie ID: " + id);
		System.out.println("The Movie Name: " + name);
		System.out.println("The description: "+ decription);
		System.out.println("The genre: " + genre);
		System.out.println("The duration: " + duration);
		System.out.println("The languages: " + language);
		System.out.println("The release Date: " + releasedate);
		System.out.println("The country: " + country);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id = 101;
		String name = "END GAME";
		String description = "NICE MOVIE";
		String genre = "ACTION";
		String duration = "1.00.25";
		String language = "English";
		String releasedate = "12.12.2025";
		String country = "INDIA";
		
		movieDetails(id, name, description, genre, duration, language, releasedate, country);

	}

}
