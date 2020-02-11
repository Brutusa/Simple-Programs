import java.util.*;

public class Main {

    public static void main(String[] args){
        Dice d = new Dice();
        Scanner diceRoll = new Scanner(System.in);

        System.out.println("Roll dice? yes or no?");
        String decision = diceRoll.nextLine().toUpperCase();
        if (decision.equals("YES")) {
            d.roll();
            System.out.println("You rolled the dice! One die landed on " + d.getFaceUp() + " while the other landed on " + d.getFaceUp2() + " !");
        } else if (decision.equals("NO")){
        System.out.println("No? That's fine! Try your luck another time!");}
        else {
            System.out.println("Uhh.. what? A simple yes or no would've been fine! ");

        }

    }

}
