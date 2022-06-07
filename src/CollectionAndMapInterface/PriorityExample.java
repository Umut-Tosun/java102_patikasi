package CollectionAndMapInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityExample {
    public static void main(String[] args) {
        // Comparator çift sayılara öncelik veriyor
        Comparator<Integer> compareForEven = new Comparator<>() {
            public int compare(Integer i, Integer j) {
                int result = i % 2 - j % 2;
                if (result == 0)
                    result = i - j;
                return result;
            }
        };

        PriorityQueue<Integer> pq = new PriorityQueue<>(20, compareForEven);

        // ters sırada sayıları kuyruğa ekle
        for (int i = 0; i < 20; i++) {
            pq.offer(20 - i);
        }
        // öğeleri Comparator'un sırayla yazdır
        for (int i = 0; i < 20; i++) {
            System.out.print("\t" + pq.poll());
        }
    }
}
