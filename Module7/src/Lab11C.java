/*
Class: CSE 1321L
Section: J52
Term: Spring 2021
Instructor: Imad El Ddine Ghandour
Name: Andujar Brutus
Lab#: 11
*/

public class Lab11C {
    public static void main(String[] args) {
        KoalaBear koko = new KoalaBear(100);
        koko.eat(400);
        koko.showWeight();
        koko.eat(300);
        koko.showWeight();
        koko.eat(650);
        koko.showWeight();
    }
}

class KoalaBear{
    float weight;

    KoalaBear(float initWeight){
        weight = initWeight;
    }

    public void eat(float leaves){
        weight = weight + (leaves/1000);
    }

    public void showWeight(){
        System.out.println("This koala weighs " +  weight + " kilos");
    }
}