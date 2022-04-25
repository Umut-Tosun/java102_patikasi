package AccessModifiers;

public class CarMain {
    public static void main(String[] args) {
        Car bmw = new Car(); //Car class`ı public olarak tanımlandıgı için farklı bir sınıftan erişebiliriz.
        bmw.colorCode=00000000; //Car classından colorcode degişkenine farklı bir sınıftan ulaşabiliyoruz çünkü public.
        /* bmw.km; */ //Car classından km degişkenine ulaşamıyoruz çünkü private - get set ögrenme vakti !

    }
}
