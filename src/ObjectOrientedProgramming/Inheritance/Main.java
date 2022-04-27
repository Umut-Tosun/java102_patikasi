package ObjectOrientedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        //Üst sınıflar alt sınıfların özelliklerine erişemez - alt sınıflar üst sınıflara erişebilir

        Emplyoee emp1 = new Emplyoee("Umut","Tosun","5539898071","tosun.umutt@gmail.com");
        Academician acdm1 = new Academician("Emirhan","Kep","5549875643","emirhankep@hotmail.com","Matematik","Doçent");

        emp1.giris();
        acdm1.canteen();
        acdm1.attendClass();

        Emplyoee emp2 = new Officer("Tahsin","Kara","56787698767","tahsinkar23@gmail.com","Bilgi İşlem","09:00-18:00");

        emp2.canteen();

        Lecturer l1 = new Lecturer("Hasan","Fetvacı","55696786745","hasanfetvaci@yandex.com","Yazılım","Dekan","7");

        l1.exit();
        l1.makeTest();
        l1.senateMeet();

        Academician ast1  = new Assistant("Eren","Güner","5677889898","erengnr@gmail.com","Personel Assistant","Chief Assistant","7");

        ast1.giris();

        Assistant ast2 = new Assistant("Demir","Yekta","5677887898","demirykt@gmail.com","Personel Assistant","Chief Assistant","6");

        ast2.makeQuiz();

        InformationProcessing ip1 = new InformationProcessing("Bektaş","Demir","5678978987","bektastosun@gmail.com","Bilgi İşlem","09:00-18:00","x");

        ip1.networkSetup();



    }
}
