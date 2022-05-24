package Generic;

public class MyList<T> {
    private int capacity;
    private int size;
    private T[] arr;

    //region Constructors and getSetMethods

    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[this.capacity];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    //endregion


    public void add(T data) {
        if (capacity == size) enlargeCapacity();
        this.arr[size++] = data;
    }
    public int size() {
        return getSize();
    }
    public void enlargeCapacity() {
        Object[] temp = new Object[capacity * 2];
        System.arraycopy(this.arr, 0, temp, 0, this.capacity);
        this.capacity *= 2;
        this.arr = (T[]) temp;
    }
    public T get(int index) {
        if (invalidIndex(index)) return null;
        return this.arr[index];
    }
    public T set(int index,T value) {
        if (invalidIndex(index)) return null;
        this.arr[index]=value;
        return value;
    }
    public boolean invalidIndex(int index) {
        return index > this.size;
    }
    public T remove(int index) {
        if (invalidIndex(index)) return null;
        T deleted = this.arr[index];
        this.arr[index] = null;
        afterDelete(index);
        this.size--;
        return deleted;
    }
    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuilder test = new StringBuilder();
        test.append("[");
        for (T value:arr) {
            if (value==null) break;
            test.append(value).append(", ");
        }
        test.replace(test.length() - 2, test.length() - 1, "]");
        return test.toString();
    }
    public void afterDelete(int startVal) {
        for (int i = startVal; i < size - 1; i++) {
            this.arr[startVal] = this.arr[startVal + 1];
        }
    }
    public int indexOf(T data) {
        int number=0;
        for (T value:arr) {
            if (value==data) return number;
            number++;
        }
        return -1;
    }
    public int lastIndexOf(T data) {
        int number=0;
        for (T value:arr) {
            if (value==data) return number;
            number++;
        }
        return -1;
    }
    public boolean isEmpty() {
        if (invalidIndex(0)==false) return true;
        return false;
    }
    public void clear() {
        for (T value:arr) {
            if (value!=null) {
                value = null;
                this.size--;
            }
        }
    }
    public boolean contains(T data) {
        for (T value:arr) {
            if (value==data) return true;
        }
        return false;
    }
    public MyList<T> subList(int start,int finish) {
        MyList<T> list = new MyList<>();
        for (Integer i=start;i<finish;i++)
        {
            if (i==null) break;
            list.add(this.arr[start]);
        }
        return list;
    }
    public T[] toArray() {
        return this.arr;
    }
}
