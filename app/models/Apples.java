package models;

/**
 * Created by rashmin.gadhvi on 6/27/2016.
 */
public class Apples {
    private int weight;
    private String color;

    public Apples(){

    }

    public Apples(int weight, String color){
        this.weight=weight;
        this.color=color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
