package ObjectOrientedProgramming.Inheritance;

public class SecurityGuard extends Officer{
    private String document;
    public SecurityGuard(String name, String surname, String mpNo, String email, String branch, String shift,String document) {
        super(name, surname, mpNo, email, branch, shift);
        this.document=document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    public void ensureSecurity()
    {
        System.out.println("Güvenlik Saglanıyor");
    }
}
