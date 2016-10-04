package exercise1.objects;

/**
 * Created by Viktoryia_Kastsiukov on 10/4/2016.
 */
public class MainBall {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Ball one = new Ball("blue", 300);
        Ball two = new Ball("red", 400);
        Ball three = new Ball("yellow", 600);
        Ball four = new Ball("blue", 200);
        Ball five = new Ball("pink", 400);
        Ball six = new Ball("green", 300);
        Ball seven = new Ball("blue", 300);

        basket.throwBall(one);
        basket.throwBall(two);
        basket.throwBall(three);
        basket.throwBall(four);
        basket.throwBall(five);
        basket.throwBall(six);
        basket.throwBall(seven);

        System.out.println("Basket ball weight = " + Basket.getBallWeight());
        System.out.println("Blue ball count = " + Basket.getBlueBallCount());

    }
}
