package Generic.GenericClasses;

public class Main {
    public static void main(String[] args) {
        //undefined
        String name;
        //null
        String surname = null;
        //empty
        String address="";

        String eMail="tosun.umutt@gmail.com";
        String countryName=null;

        NullableString nullable = new NullableString(eMail);
        nullable.run();

        NullableString nullable1 = new NullableString(countryName);
        nullable1.run();

        Integer age = null;
        Integer code = 1881;

        NullableInteger nullableInteger = new NullableInteger(age);
        nullableInteger.run();

        NullableInteger nullableInteger1 = new NullableInteger(code);
        nullableInteger1.run();


        Integer damage=789;
        Boolean control=null;

        Nullable<Integer> nullable2 = new Nullable<>(damage);
        nullable2.run();

        Nullable<Boolean> nullable3 = new Nullable<>(control);
        nullable3.run();

        Integer price = 120;
        String errorMessage = "Aradığınız sayfa bulunamadı.";
        Boolean status=true;

        Test<Integer,String,Boolean> test = new Test<>(price,errorMessage,status);
        test.showInfo();

        test.setValue2(false);

        test.showInfo();
    }
}
