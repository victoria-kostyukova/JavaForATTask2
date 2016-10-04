package exercise1.objects;

/**
 * Created by Виктория on 26.09.16.
 */
public class Basket {

    private static double ballWeight = 0;
    private static int blueBallCount = 0;


    public Basket() {
    }

    public static double getBallWeight() {
        return ballWeight;
    }

    public static int getBlueBallCount() {
        return blueBallCount;
    }

    public static void throwBall(Ball ball){
        ballWeight = ballWeight + ball.getWeight();
        if (ball.getColour().equals("blue")){
            blueBallCount = blueBallCount + 1;
        }
    }
}
