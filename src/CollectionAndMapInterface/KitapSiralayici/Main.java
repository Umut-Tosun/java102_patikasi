package CollectionAndMapInterface.KitapSiralayici;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<Book>();

        Book b1=new Book("Yüzüklerin Efendisi",1011,"Tomas Müller");
        Book b2=new Book("Anna Karanna",690,"Franklin Maria");
        Book b3=new Book("Nutuk",789,"Mustafa Kemal Atatürk");
        Book b4=new Book("Yalanlar ve Düşünceler",561,"Umut Tosun");
        Book b5=new Book("İstanbul Hatırası",789,"Tomas Müller");

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("Ada göre sıralama : ");
        for(Book book:books){

            System.out.println("Kitap Adı : "+book.getName()+
                    ",\t Sayfa Sayısı : "+book.getPageNumber()+
                    ",\t Yazarın İsmi : "+book.getWriter());
        }

        TreeSet<Book> books2=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);
        System.out.println("----------------------------------");
        System.out.println("Sayfa sayısına göre sıralama :");
        for (Book book:books2) {
            System.out.println("Kitap adı : " + book.getName() +
                    ",\t Sayfa Sayısı : "+book.getPageNumber()+
                    ",\t Yazarın İsmi : "+book.getWriter());
        }

    }
}
