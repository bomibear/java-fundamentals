package inheritance;

public class Review {
    private String body;
    private String author;
    private double numberOfStars;
    private Restaurant restaurant;

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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Review(String body, String author, double numberOfStars){
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
        this.restaurant = restaurant;
    }

    public String toString(){
        return "Review: " + this.body + ", Author: " + this.author + ", Number Of Stars: " + String.format("%.2f", this.numberOfStars);
    }

}
