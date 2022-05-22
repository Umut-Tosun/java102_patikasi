package Generic.GenericMethods;

public class Print {
    public static <T> void printArray(T[] arr){
        for (T i:arr) {
            System.out.println(i);
        }
        System.out.println("---------------------------------------------------------");
    }
}
