package ObjectOrientedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        //Üst sınıflar alt sınıfların özelliklerine erişemez - alt sınıflar üst sınıflara erişebilir

        Emplyoee emp1 = new Emplyoee("Umut","Tosun","5539898071","tosun.umutt@gmail.com");
       // Academician acdm1 = new Academician("Emirhan","Kep","5549875643","emirhankep@hotmail.com","Matematik","Doçent");

        emp1.enter();
       // acdm1.canteen();
        //acdm1.attendClass("13:00");

      //  Emplyoee emp2 = new Officer("Tahsin","Kara","56787698767","tahsinkar23@gmail.com","Bilgi İşlem","09:00-18:00");

        //emp2.canteen();

        Lecturer l1 = new Lecturer("Hasan","Fetvacı","55696786745","hasanfetvaci@yandex.com","Yazılım","Dekan","7");

        l1.exit();
        l1.makeTest();
        l1.senateMeet();

    //    Academician ast1  = new Assistant("Eren","Güner","5677889898","erengnr@gmail.com","Personel Assistant","Chief Assistant","7");

      //  ast1.enter();

    //    Assistant ast2 = new Assistant("Demir","Yekta","5677887898","demirykt@gmail.com","Personel Assistant","Chief Assistant","6");

      //  ast2.makeQuiz();

        InformationProcessing ip1 = new InformationProcessing("Bektaş","Demir","5678978987","bektastosun@gmail.com","Bilgi İşlem","09:00-18:00","x");

        ip1.networkSetup();

        SecurityGuard sc1 = new SecurityGuard("Barış","Uzun","5664567876","baris.uzun201@gmail.com","Yazılım","09:00-18:00","X");

        sc1.ensureSecurity();

      //  LabAssistant la1 = new LabAssistant("Gamze","Koş","5545678789","gamzep@gmail.com","Psikoloji","Lab Asistanı","4");

      //  la1.attendClass("15:00");
       // la1.enterLabs();

        l1.enter();

       // Officer o1 = new Officer("Tahir","Usta","5678789898","tahiusta@gmail.com","Polis","09:00-18:00");

       // o1.enter();

        //int [] loginUser=new int[5];
        System.out.println("**************** Polymorphism ****************");
        Emplyoee[] loginUser = {sc1,l1};
        emp1.loginUser(loginUser);

        l1.attendClass("15:00");




    }
}
