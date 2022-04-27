package ObjectOrientedProgramming.Inheritance;

public class InformationProcessing extends Officer{
    private String mission;

    public InformationProcessing(String name, String surname, String mpNo, String email, String branch, String shift, String belge) {
        super(name, surname, mpNo, email, branch, shift);
        this.mission = belge;
    }

    public String getBelge() {
        return mission;
    }

    public void setBelge(String belge) {
        this.mission = belge;
    }
    public void networkSetup()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Nöbete Başladı.");
    }
}
