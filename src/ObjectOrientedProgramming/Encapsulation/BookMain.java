package ObjectOrientedProgramming.Encapsulation;


public class BookMain {
    public static void main(String[] args) {
        System.out.println("================================");

        Book nBook = new Book("Ahmet Ümit","İstanbul Hatıraıs",567);
        nBook.printBook();
        nBook.setNumberOfPages(-568);
        nBook.printBook();

        Book nBookTwo = new Book("Ahmet Ümit","Kırlangıç Çığlığı",600);
        nBookTwo.printBook();
        nBookTwo.setNumberOfPages(-1);
        nBookTwo.printBook();


    }
}
