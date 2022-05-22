package Generic.GenericInterface;

public class Student<T> implements IDatabase<T>{
    @Override
    public boolean add(T data) {
        System.out.println("Öğrenci eklendi.");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Öğrenci silindi.");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Öğrenci bilgisi güncellendi.");
        return true;
    }

    @Override
    public T getListAll() {
        System.out.println("Öğrenci bilgileri listelendi.");
        return null;
    }
}
