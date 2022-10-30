package quanlysach.model;

public class Book {
    public static int id;
    private String idBook;
    private String Name;
    private String category;
    private String author;
    private int amount;


    public String getIdBook() {
        return idBook;
    }

    public void setIdBook() {
        this.idBook = "Book"+(id++);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Book : " +
                "idBook = " + idBook  +
                ", Name = " + Name  +
                ", category = " + category +
                ", author = " + author  +
                ", amount = " + amount + "\n";
    }
}
