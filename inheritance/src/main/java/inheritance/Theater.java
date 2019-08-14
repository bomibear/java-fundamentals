package inheritance;

import java.util.LinkedList;

public class Theater {
    public String name;
    public LinkedList<String> currentMovies;
    public LinkedList<TheaterReview> reviews;

    public Theater(String name, LinkedList<String> currentMovies){
        this.name = name;
        this.currentMovies = currentMovies;
    }

    public String toString(){
        if(this.reviews == null){
            return "Theater Name: " + this.name + ", Currently Showing: " + this.currentMovies;
        }
        return "Theater Name: " + this.name + ", Currently Showing: " + this.currentMovies + ", " + this.reviews;
    }

    public void addReview(TheaterReview review){
        if(!this.reviews.contains(review)){
            this.reviews.add(review);
        }
    }
}
