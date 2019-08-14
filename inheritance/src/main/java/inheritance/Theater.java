package inheritance;

import java.util.LinkedList;

public class Theater {
    public String name;
    public LinkedList<String> currentMovies;

    public Theater(String name, LinkedList<String> currentMovies){
        this.name = name;
        this.currentMovies = currentMovies;
    }

    public String toString(){
        return "Theater Name: " + this.name + ", Currently Showing: " + this.currentMovies;
    }

}
