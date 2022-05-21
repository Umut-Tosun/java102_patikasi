package NestedClasses;

public class Main {
    public static void main(String[] args) {
        //Nested classes [ iç-içe sınıflar ]

       /* Outer o = new Outer();
        Outer.Inner inObject = o.getIn();
        inObject.run();*/

        Outer o = new Outer();
        Outer.Inner.run();

        Local local = new Local();
        local.run();

        Anonymous anonymous = new Anonymous(){
            public int a=20;
            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonymous olarak yazılmış run metotu !");
                print();
            }
            public void print() {
                System.out.println("Print metotu");
            }
        };
        anonymous.run();
    }
}
