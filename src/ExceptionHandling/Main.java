package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Starting");


        int a=9;
        int [] numbers=new int[10];

        try {
            System.out.print("Enter your code ! : ");
            int code=input.nextInt();

            System.out.println(a/code);

            numbers[0]=a/code;
            numbers[11]=a/code;
        }
        catch (ArithmeticException e){
            System.out.println("ERROR Caught : "+"ArithmeticException. .. .. . .. . ");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR Caught : "+"ArrayIndexOutOfBoundsException . .. .. . .. . ");
        }catch (InputMismatchException e) {
            System.out.println("ERROR Caught : "+"InputMismatchException . .. .. . .. . ");
        }finally {
            System.out.println("This Score : "+numbers[0]);
        }

        System.out.println("Program End");
    }
}
