package ObjectOrientedProgramming.Inheritance;

public abstract class Academician extends Emplyoee{
    private String branch;
    private String title;

    public Academician(String name, String surname, String mpNo, String email,String branch,String title)
    {
        super(name,surname,mpNo,email);
        this.title=title;
        this.branch=branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void attendClass(String dersSaat);
    @Override
    public void enter()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Akademisyeni Giriş Yaptı!");
    }
}
