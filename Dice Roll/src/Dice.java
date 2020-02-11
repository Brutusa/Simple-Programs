import java.util.*;

public class Dice {

    public int[] diceFaces = {1,2,3,4,5,6};

    private int faceUp;
    private int faceUp2;

    public void roll() {
        faceUp = diceFaces[(int) Math.floor(Math.random() * diceFaces.length)];
        faceUp2 = diceFaces[(int) Math.floor(Math.random() * diceFaces.length)];
    }

    public int getFaceUp() {
        return faceUp;
    }

    public int getFaceUp2() {
        return faceUp2;
    }


}
