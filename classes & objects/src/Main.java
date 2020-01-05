import java.awt.*;

public class Main {
    public static void main(String[] args){

        Dog spike = new Dog(4,
                Color.black,
                true);
        System.out.println(spike.dogColor);
        spike.dogBark();
        spike.dogRuns();
        spike.changeDogColor(Color.yellow);
        System.out.println(spike.dogColor);

        System.out.println("                            ");

        Dog fido = new Dog (3,
                Color.red,
                false);

        System.out.println(fido.dogColor);
        fido.dogRuns();
        fido.dogBark();
        fido.changeDogColor(Color.white);
        System.out.println(fido.dogColor);

    }

}
