package Generic.GenericClasses;

public class NullableInteger {
    private final Integer value;

    public NullableInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
    public boolean isNull(){
        return this.value==null;
    }
    public void run(){
        System.out.println(isNull()?"Bu değişkene değer atanmamıştır.":this.value);
    }
}
