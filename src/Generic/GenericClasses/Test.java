package Generic.GenericClasses;

public class Test<T,T1,T2> {

   private  T  value;
   private  T1 value1;
   private  T2 value2;

    public Test(T value, T1 value1, T2 value2) {
        this.value = value;
        this.value1 = value1;
        this.value2 = value2;
    }

    //region setGetMethods
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T1 getValue1() {
        return value1;
    }

    public void setValue1(T1 value1) {
        this.value1 = value1;
    }

    public T2 getValue2() {
        return value2;
    }

    public void setValue2(T2 value2) {
        this.value2 = value2;
    }
    //endregion

    public void showInfo(){
        System.out.println("T : "+value+" "+value.getClass().getSimpleName());
        System.out.println("T1 : "+value1+" "+value1.getClass().getSimpleName());
        System.out.println("T2 : "+value2+" "+value2.getClass().getSimpleName());
    }
}
