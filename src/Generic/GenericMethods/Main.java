package Generic.GenericMethods;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Umut","Ahmet","Melih","Kübra","Zeynep"};
        Integer [] numbers = {1,2,3,4,5,6,7,8,9};
        Character[] letters = {'A','N','L','A','Y','A','M','A','Z','S','I','N'};

        /*
        System.out.println("---------------------------------------------------------");
        for (String i:students){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------");
        for (Integer i:numbers){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------");
        for (Character i:letters){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------");
         */

        //D R Y ilkesi çiğnenmedi.
        Print print = new Print();
        System.out.println("---------------------------------------------------------");
        print.printArray(students);
        print.printArray(numbers);
        print.printArray(letters);

    }
}
