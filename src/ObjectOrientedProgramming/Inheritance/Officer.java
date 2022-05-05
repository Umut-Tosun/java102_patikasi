package ObjectOrientedProgramming.Inheritance;

public abstract class Officer extends Emplyoee{
    private String branch;
    private String shift;

    public Officer(String name, String surname, String mpNo, String email, String branch, String shift) {
        super(name, surname, mpNo, email);
        this.branch = branch;
        this.shift = shift;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public String getShift()
    {
        return shift;
    }
    public void setShift(String shift)
    {
        this.shift=shift;
    }
    public void work()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Görevine Başladı.");
    }
    @Override
    public void enter()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Memuru Giriş Yaptı");
    }
}
