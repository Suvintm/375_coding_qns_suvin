//168) Create a class representing a movie with private member variables (title, director, rating) and public methods (getters and setters).

package p375_suvin;

class Movie {
    private String title;
    private String director;
    private double rating;

    public void setTitle(String t) { title = t; }
    public String getTitle() { return title; }
    public void setDirector(String d) { director = d; }
    public String getDirector() { return director; }
    public void setRating(double r) { rating = r; }
    public double getRating() { return rating; }
}

public class p168_movie_encap {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.setTitle("Inception");
        m.setDirector("Christopher Nolan");
        m.setRating(8.8);
        System.out.println("Movie: " + m.getTitle() + ", Director: " + m.getDirector() + ", Rating: " + m.getRating());
    }
}

//output
//Movie: Inception, Director: Christopher Nolan, Rating: 8.8
