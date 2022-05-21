package NestedClasses;

public class Outer {
    public static int number=5;

    public static class Inner {
        public static int number=10;

        public static void run() {
            System.out.println("Inner sınıfına ait run metotu çalıştı !");
            int number=1;
            System.out.println(number);
            System.out.println(Inner.number);
            System.out.println(Outer.number);
           // System.out.println(Outer.this.number);
        }
    }
    public void run() {
        System.out.println("Outer sınıfına ait run metotu çalıştı !");
        Inner.run();
    }
}
