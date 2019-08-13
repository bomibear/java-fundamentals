package inheritance;

public class Review {
    public String body;
    public String author;
    public int numberOfStars;

    public Review(String body, String author, int numberOfStars){
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public String toString(){
        return "Review: " + this.body + ", Author: " + this.author + ", Number Of Stars: " + this.numberOfStars;
    }

}
