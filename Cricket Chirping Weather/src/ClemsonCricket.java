/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#:
*/

public class ClemsonCricket extends Cricket {

    @Override
    public int getChirpCount(Environment env) {
        return (int)(super.getChirpCount(env) * .8);
    }
}
