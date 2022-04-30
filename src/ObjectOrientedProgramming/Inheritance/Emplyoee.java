package ObjectOrientedProgramming.Inheritance;

public class Emplyoee {
    private String name;
    private String surname;
    private String mpNo;
    private String email;

    public Emplyoee(String name, String surname, String mpNo, String email) {
        this.name = name;
        this.surname = surname;
        this.mpNo = mpNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMpNo() {
        return mpNo;
    }

    public void setMpNo(String mpNo) {
        this.mpNo = mpNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void enter()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Üniversİteye Giriş Yaptı.");
    }

    public void exit()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Üniversİteden Çıkış Yaptı.");
    }

    public void canteen()
    {
        System.out.println(this.getName()+" "+this.getSurname()+" Yemekhaneye Giriş Yaptı.");
    }
    public static void loginUser(Emplyoee[]loginUsers)
    {
        for (Emplyoee emp:loginUsers) {
            emp.enter();
        }
    }
}
