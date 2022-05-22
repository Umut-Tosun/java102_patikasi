package WrapperClasses;

public class Boxing {
    public static void main(String[] args) {
        int a=10;

        //AutoBoxing
        Integer b = a;

        //UnBoxing
        Integer c = Integer.valueOf(a);

        System.out.println(b);
        System.out.println(c);
    }
}
