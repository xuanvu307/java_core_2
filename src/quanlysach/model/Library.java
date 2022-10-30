package quanlysach.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private User user;
    private LocalDate dateMuon;
    private LocalDate dateTra;


    public ArrayList<Book> getBook() {
        return books;
    }

    public void setBook(ArrayList<Book> book) {
        this.books = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDateMuon() {
        return dateMuon;
    }

    public void setDateMuon(LocalDate dateMuon) {
        this.dateMuon = dateMuon;
    }

    public LocalDate getDateTra() {
        return dateTra;
    }

    public void setDateTra() {
        this.dateTra = dateMuon.plusDays(30);
    }


    @Override
    public String toString() {
        return "Library : " +
                "id = "+ user.getIdUser() +
                ", name = "+ user.getName() +
                ",\n " + books +
                ", dateMuon=" + dateMuon +
                ", dateTra=" + dateTra +"\n";
    }
}
