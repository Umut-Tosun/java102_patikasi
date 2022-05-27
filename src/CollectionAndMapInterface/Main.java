package CollectionAndMapInterface;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(null);
        hashSet.add(30);
        hashSet.add(null);

        for (Integer value:hashSet) {
            System.out.println(value);
        }

        System.out.println(hashSet.isEmpty()?"BOŞ":"DOLU");
        System.out.println(hashSet.contains(null));

        hashSet.clear();

        System.out.println(hashSet.isEmpty()?"BOŞ":"DOLU");

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(null);

        // Itertor kullanarak gezinmek
        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
