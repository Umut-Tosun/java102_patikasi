package CollectionAndMapInterface;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet(new OrderNoteComparator(){
         @Override
         public int compare(Student o1, Student o2) {
             return o1.getName().compareTo(o2.getName());
         }
        });

        students.add(new Student("Umut",30));
        students.add(new Student("Ahmet",40));
        students.add(new Student("Emirhan",15));
        students.add(new Student("Oguz",20));
        students.add(new Student("Eylül",10));

        System.out.println("-------------------------------------------------");
        for (Student su:students)
        {
            System.out.println("- Student Name : "+su.getName()+" -- Note : "+su.getNote());
            System.out.println("-------------------------------------------------");
        }
    }
}
