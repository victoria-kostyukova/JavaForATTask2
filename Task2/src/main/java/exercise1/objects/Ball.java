package exercise1.objects;

/**
 * Created by Виктория on 26.09.16.
 */
public class Ball {
    private double weight = 0;
    private String colour = "colour";

    public Ball(double weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }
}
