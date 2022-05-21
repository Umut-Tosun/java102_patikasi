package NestedClasses;

public class Local {
    public void run() {
        class Yerel {
            private int number;
            public Yerel(int number) {
                this.number=number;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }
        }

        Yerel yerel = new Yerel(5);
        System.out.println("Local Sınıfı Çalıştı");
        System.out.println(yerel.getNumber());

    }
    public void print()
    {
        // Yerel yerel = new Yerel(6); Tanımlanamaz
    }
}
