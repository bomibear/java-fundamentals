package inheritance;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public double numberOfStars;
    public String priceCategory;
    public ArrayList<Review> review;

    public Restaurant(String name, double numberOfStars, String priceCategory){
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
        this.review = new ArrayList<>();
    }

    public String toString(){
        return "Name: " + this.name + ", Number of Stars: " + String.format("%.2f", this.numberOfStars) + ", Price Category: " + this.priceCategory + ", " + this.review;
    }

    //adds reviews to the list of reviews associated with this restaurant
    public ArrayList<Review> addReview(Review review){
        if(!this.review.contains(review)){
            this.review.add(review);
        }
        changeStarsBasedOnReview();
        return this.review;
    }

    //determines avg number of stars based on stars from all the reviews
    public double changeStarsBasedOnReview(){
        double total = 0;
        for(int i = 0; i < this.review.size(); i++ ){
            total += this.review.get(i).numberOfStars;
        }

        this.numberOfStars = total/this.review.size();

        //ratings cannot exceed 5 nor go below 0
        if(this.numberOfStars > 5){
            this.numberOfStars = 5;
        } else if(this.numberOfStars < 0){
            this.numberOfStars = 0;
        }
        return this.numberOfStars;
    }
}
