/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 3
*/


public class Question {
    private String questionText;
    private String questionAnswer;
    private int levelDifficulty;

    Question(String questionText, String questionAnswer, int levelDifficulty) {
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
        this.levelDifficulty = levelDifficulty;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public void setLevelDifficulty(int levelDifficulty) {
        this.levelDifficulty = levelDifficulty;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }
}
