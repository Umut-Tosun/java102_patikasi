package WrapperClasses;

public class Main {
    public static void main(String[] args) {
        int age = 17;
        Integer number = 9;

        System.out.println(age);
        System.out.println(number);

        System.out.println(age+number);

        String name = "Franklin";
        Short kg = 5;

        System.out.println(number.toString()+name);

        String code = "77";

        int actCode = Integer.parseInt(code);
        System.out.println(actCode+2);

        System.out.println(Integer.sum(7,8));
    }
}
