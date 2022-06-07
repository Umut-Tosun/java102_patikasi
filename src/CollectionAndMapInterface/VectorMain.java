package CollectionAndMapInterface;

import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Zonguldak");
        v.add("Sinop");
        v.add("Trabzon");
        v.add("Rize");
        v.add("Đzmit");

        // indisi 3 olan konuma bir öğe ekle (insetion)
        v.add(3, "Bafra");

        // v.size() vektörün bileşen sayısını verir
        System.out.println("Vektörün uzunluğu :" + v.size());

        // v.get(i) vektörün i-inci indisli terimini verir
        for (int i = 0; i < v.size(); i++) {
            System.out.println("Vektör öğesi : " + i + " :" +
                    v.get(i));
        }
    }
}
