package inheritance;

public class Shop {
    public String name;
    public String description;
    public String numberOfDollarSigns;

    public Shop(String name, String description, String numberOfDollarSigns){
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public String toString(){
        return "Store Name: " + this.name + ", Description: " + this.description + ", Price Category: " + this.numberOfDollarSigns;
    }
}
