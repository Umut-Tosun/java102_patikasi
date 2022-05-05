package ObjectOrientedProgramming.Inheritance;

public abstract class LabAssistant extends Assistant{
    public LabAssistant(String name, String surname, String mpNo, String email, String branch, String title, String meetNumber) {
        super(name, surname, mpNo, email, branch, title, meetNumber);
    }
    public void enterLabs()
    {
        System.out.println("Lablara Girildi .");
    }
}
