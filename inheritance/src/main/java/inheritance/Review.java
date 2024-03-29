package inheritance;

public class Review {
    private String body;
    private String author;
    private double numberOfStars;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(double numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public Review(String body, String author, double numberOfStars){
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }

    public String toString(){
        return "Review: " + this.body + ", Author: " + this.author + ", Number Of Stars: " + String.format("%.2f", this.numberOfStars);
    }

}
