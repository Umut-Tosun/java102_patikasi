package Generic.GenericBoundedTypes;

public class Test <T extends B>{
    private final T value;

    public Test(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.value==null;
    }
    public void run(){
        System.out.println(isNull()?"Bu değişkene değer atanmamıştır.":this.getValue());
    }
}
