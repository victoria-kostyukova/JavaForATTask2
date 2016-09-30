package exercise1.objects;

/**
 * Created by Виктория on 26.09.16.
 */
public class Basket {

    private static Basket basket;
    private static double ballWeight = 0;
    private static int blueBallCount = 0;

    public Basket getBasket() {
        if (basket == null){
            basket = new Basket();
        }
        return basket;
    }

    public static double getBallWeight() {
        return ballWeight;
    }

    public static int getBlueBallCount() {
        return blueBallCount;
    }

    public static void throwBall(Ball ball){
        ballWeight = ball.getWeight();
        if (ball.getColour() == "blue"){
            blueBallCount = blueBallCount + 1;
        }
    }
}
