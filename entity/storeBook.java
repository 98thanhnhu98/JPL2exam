package JP2.entity;

public class storeBook {
    private String bookID;
    private String name;
    private String author;
    private int price;

    public storeBook(){};
    public storeBook(String bookID, String name, String author, int price) {
        this.bookID = bookID;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "storeBook{" +
                "bookID='" + bookID + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
