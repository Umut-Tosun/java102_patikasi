package Generic.GenericBoundedTypes;

public class Main {
    public static void main(String[] args) {
        //Integer,Double,Float extends Number

        Integer numberPlate=88998;
        Integer emergencyNumber=null;

        Nullable<Integer> nullable = new Nullable<>(numberPlate);
        nullable.run();

        Nullable<Integer> nullable1 = new Nullable<>(emergencyNumber);
        nullable1.run();

        /*Nullable<String> nullable2 = new Nullable<>("2021");  Bu kullanım uygun değildir; String, Number sınıfından türetilmemiştir .
        nullable2.run();
        */

        A object = null;

        Test<A> test = new Test<>(object); //Test t olarak b den extends alıyor fakat a da b den extends aldığı için hata almıyoruz.
        test.run();

    }
}
