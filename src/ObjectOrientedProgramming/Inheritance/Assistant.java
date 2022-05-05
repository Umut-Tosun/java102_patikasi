package ObjectOrientedProgramming.Inheritance;

public abstract class Assistant extends Academician{
    private String meetNumber;
    public Assistant(String name, String surname, String mpNo, String email, String branch, String title,String meetNumber) {
        super(name, surname, mpNo, email, branch, title);
        this.meetNumber=meetNumber;
    }

    public String getMeetNumber() {
        return meetNumber;
    }

    public void setMeetNumber(String meetNumber) {
        this.meetNumber = meetNumber;
    }
    public void makeQuiz()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Quiz yaptı.");
    }
}
