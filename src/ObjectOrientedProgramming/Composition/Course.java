package ObjectOrientedProgramming.Composition;

public class Course {
    private String  name,code;
    private Instructor instructor;

    public Course(String name, String code,Instructor instructor) {
        this.name = name;
        this.code = code;

        if (this.name.equals(instructor.getDepartment()))this.instructor=instructor;
        else System.out.println("Ögretmen ve Kurs branşı uyuşmuyor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public double calcAverage(Student[] students)
    {
        double average=0.0;
        for (Student student:students) {
            average+=student.getNote();
        }
        average/=students.length;
        return average;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        if (this.name.equals(instructor.getDepartment()))this.instructor=instructor;
        else System.out.println("Ögretmen ve Kurs branşı uyuşmuyor.");
    }
}
