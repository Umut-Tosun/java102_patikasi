package Generic.GenericClasses;

public class NullableString {
    private final String value;

    public NullableString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isNull(){
        return getValue()==null;
    }
    public void run(){
        System.out.println(isNull()?"Bu değişkene değer atanmamıştır.":this.value);
    }
}
