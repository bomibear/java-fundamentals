package inheritance;

public class Restaurant {
    public String name;
    public int numberOfStars;
    public String priceCategory;

    public Restaurant(String name, int numberOfStars, String priceCategory){
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }

    public String toString(){
        return "Name: " + this.name + ", Number of Stars: " + this.numberOfStars + ", Price Category " + this.priceCategory;
    }
}
