package interface_1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

interface SearchByGenre{
    void searchbygenre(String genre);
}

interface SearchbyTitle{
    void searchbyTitle(String title);
}

class Movie{

    String name, desc, genre, lan;
    Date date;
    double rating;

    Movie(String name, String desc, String genre, Date date, String lan, double rat){
        this.name = name;
        this.desc = desc;
        this.genre = genre;
        this.date = date;
        this.lan = lan;
        rating = rat;
    }

	public String getTitle() {
        return name;
    }

    public void getMovieDetails() {
        System.out.println(name + " - " + desc + " - " + genre + " - " + date + " - " + lan + " - " + rating + "\n");
    }

    public String getGenre() {
        return genre;
    }
}

class Catalog implements SearchByGenre, SearchbyTitle{

    private static List<Movie> movie = new ArrayList<Movie>();

    public void addMovie(Movie m){
        movie.add(m);
    }

    public void searchbyTitle(String tit){

        for(Movie mov: movie){
            if(mov.getTitle().equalsIgnoreCase(tit)){
                mov.getMovieDetails();
            }
        }
    }

    public void searchbygenre(String gen){

        for(Movie mov: movie){
            if(mov.getGenre().equalsIgnoreCase(gen)){
                mov.getMovieDetails();
            }
        }
    }
}

public class GenreCat {

    public static void main(String[] args) {

        Catalog c = new Catalog();
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();

        Movie m1 = new Movie("AAA","Nice Movie","Action",date,"English",3.5);
        Movie m2 = new Movie("BBB","Super Movie","Comedy",date,"English",6.6);

        c.addMovie(m1);
        c.addMovie(m2);

        System.out.println("---------------------- Search by Title -------------------------");
        c.searchbyTitle("AAA");

        System.out.println("---------------------- Search by Genre -------------------------");
        c.searchbygenre("Comedy");
    }
}