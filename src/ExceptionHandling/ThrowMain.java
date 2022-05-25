package ExceptionHandling;

import java.util.Scanner;

public class ThrowMain {

    public static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new AgeCheckException("Askerlik yaşı 18 ve üstüdür !");

        System.out.println("Askere Alındınız !");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz : ");
        int age = input.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Yaşı uymadı : " + e.getMessage());
        }

        System.out.println("Program Bitti.");

    }
}
