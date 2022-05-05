package ObjectOrientedProgramming.Inheritance;

public class Lecturer extends  Academician{
    private String doorNo;
    public Lecturer(String name, String surname, String mpNo, String email, String branch, String title,String doorNo) {
        super(name, surname, mpNo, email, branch, title);
        this.doorNo=doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
    public void senateMeet()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Senato Toplantısına Katıldı.");
    }
    public void makeTest()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Sınav yaptı.");
    }
    @Override
    public void enter()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Ögretim Görevlisi Giriş Yaptı!");
    }
    @Override
    public void attendClass(String dersSaat)
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Ögretim Görevlisi "+dersSaat+" Giriş Yaptı.");
    }
}
