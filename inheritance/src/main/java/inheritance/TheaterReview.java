package inheritance;

public class TheaterReview extends Review {
    String movieName;

    //for reviews of the theater
    public TheaterReview(String body, String author, double numberOfStars){
        super(body, author, numberOfStars);
    }

    //for reviews of the theater and a movie
    public TheaterReview(String body, String author, double numberOfStars, String movieName){
        super(body, author, numberOfStars);
        this.movieName = movieName;
    }

    public String toString(){
        if(this.movieName != null){
            return "Movie Name: " + this.movieName + "Review: " + this.getBody() + ", Author: " + this.getAuthor() + ", Number Of Stars: " + String.format("%.2f", this.getNumberOfStars());
        }
        return "Review: " + this.getBody() + ", Author: " + this.getAuthor() + ", Number Of Stars: " + String.format("%.2f", this.getNumberOfStars());
    }

}
