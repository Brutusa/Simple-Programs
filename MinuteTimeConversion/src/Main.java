class minutesHours {
    static int minutes;
    static int hours;
    static String sep = " : ";
    static String newTime = null;

    public static String convert (int minutes){
            hours = minutes / 60;
            minutes = minutes % 60;
            newTime = hours + " hours and "  + minutes + " minutes.";

        return hours + sep + minutes;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println(minutesHours.convert(63));
    }
}
