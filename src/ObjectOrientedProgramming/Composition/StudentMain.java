package ObjectOrientedProgramming.Composition;

public class StudentMain {
    public static void main(String[] args) {

        Student st1 = new Student("Kemal","Ziya","1900","İstanbul/Kartal",80);
        Student st2 = new Student("Melih","Yıldırım","128","Ankara/Kızılay",710);
        Student st3 = new Student("Recep","Yavaş","128","Bursa/İnegöl",10);

        Student[] students={st1,st2,st3};


        System.out.println("======================================");
        st1.printStudent();

        Instructor teacher = new Instructor("Umut","Tosun","Math");
        Instructor teacherTwo = new Instructor("Emirhan","Kep","Art");

        Course c1 = new Course("Math","456",teacher);

        System.out.println("Ortalama Not : "+c1.calcAverage(students));

        c1.setInstructor(teacherTwo);
    }
}
