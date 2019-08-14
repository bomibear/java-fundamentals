package inheritance;

import java.util.LinkedList;

public class Restaurant {
    private String name;
    public double numberOfStars;
    private String priceCategory;
    private LinkedList<Review> reviews = new LinkedList<>();

    public Restaurant(String name, double numberOfStars, String priceCategory){
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }

    public String toString(){
        return "Name: " + this.name + ", Number of Stars: " + String.format("%.2f", this.numberOfStars) + ", Price Category: " + this.priceCategory + ", " + this.reviews;
    }

    //adds reviews to the list of reviews associated with this restaurant
    public void addReview(Review review){
        if(!this.reviews.contains(review)){
            this.reviews.add(review);
        }
        changeStarsBasedOnReview();
    }

    //determines avg number of stars based on stars from all the reviews
    private void changeStarsBasedOnReview(){
        double total = 0;
        for(int i = 0; i < this.reviews.size(); i++ ){
            total += this.reviews.get(i).getNumberOfStars();
        }

        this.numberOfStars = total/this.reviews.size();

        //ratings cannot exceed 5 nor go below 0
        if(this.numberOfStars > 5){
            this.numberOfStars = 5;
        } else if(this.numberOfStars < 0){
            this.numberOfStars = 0;
        }
    }
}
