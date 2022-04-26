package ObjectOrientedProgramming.Encapsulation;

public class Book {
    private String author,bookName;
    private int numberOfPages;

    public Book(String author, String bookName, int numberOfPages) {
        this.author = author;
        this.bookName = bookName;
        if (numberOfPages<0)
            this.numberOfPages=0;
        else this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages<0)
            this.numberOfPages=0;
        else this.numberOfPages = numberOfPages;
    }
    public void printBook()
    {
        System.out.println("Kitap İsmi : "+bookName);
        System.out.println("Yazar : "+author);
        System.out.println("Sayfa Sayısı : "+numberOfPages);
        System.out.println("================================");
    }
}
