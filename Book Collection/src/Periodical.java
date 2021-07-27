/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 5
*/

public class Periodical extends Item {
    private int issueNum;

    Periodical(){

    }

    Periodical(String title, int issueNum){
        super(title);
        this.issueNum = issueNum;
    }

    @Override
    public void getListing() {
        System.out.println("Periodical Title - " + getTitle());
        System.out.println("Issue # - " + getIssueNum());
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

}
