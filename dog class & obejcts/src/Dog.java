import java.awt.*;

public class Dog {

    int numberOfLegs;
    Color dogColor;
    boolean isDogPlayful;

    public Dog (int inputNumberOfLegs, Color inputDogColor, boolean inputIsDogPlayful) {
        this.numberOfLegs = inputNumberOfLegs;
        this.dogColor = inputDogColor;
        this.isDogPlayful = inputIsDogPlayful;

    }

    public void changeDogColor(Color inputNewDogColor){
        this.dogColor = inputNewDogColor;
    }

    public void dogBark(){
        System.out.println("Bark!");
    }

    public void dogRuns(){
        if (this.isDogPlayful == true) {
            System.out.println("The playful dog runs with " + this.numberOfLegs + " legs");
        }
        else {System.out.println("The boring dog runs with " + this.numberOfLegs + " legs");
        }

    }

}
