package inheritance;

public class Review {
    public String body;
    public String author;
    public double numberOfStars;

    public Review(String body, String author, double numberOfStars){
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public String toString(){
        return "Review: " + this.body + ", Author: " + this.author + ", Number Of Stars: " + String.format("%.2f", this.numberOfStars);
    }

}
