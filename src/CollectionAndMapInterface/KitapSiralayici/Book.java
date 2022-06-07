package CollectionAndMapInterface.KitapSiralayici;

public class Book implements Comparable<Book> {
    private String name;
    private int pageNumber;
    private String writer;

    public Book(String name, int pageNumber, String writer) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public int compareTo(Book b) {
        return getName().compareTo(b.getName());
    }
}
