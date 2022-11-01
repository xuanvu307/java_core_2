package quanlysach.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryModel {
    public void muon(ArrayList<User> users, ArrayList<Book> books,ArrayList<Library> libraries, Scanner sc){
        Library library = new Library();

        System.out.println("id user");
        String id = sc.nextLine();
        for (User user : users) {
            if (id.equals(user.getIdUser())) {
                library.setUser(user);
            }
        }

        boolean flag;
        ArrayList<Book> books1 = new ArrayList<>();
        do {
            System.out.println("id book");
            String book = sc.nextLine();
            int check = 0;
            for (Book value : books) {
                if (book.equals(value.getIdBook())) {
                    System.out.println(value);
                    if (value.getAmount() > 0) {
                        System.out.println("add ok");
                        books1.add(value);
                        library.setBook(books1);
                        value.setAmount((value.getAmount() - 1));
                    } else {
                        System.out.println("amount = 0");
                    }
                    check++;
                }
            }
            if (check == 0){
                System.out.println("ID Wrong");
            }
            System.out.println("do you want continues y / n");
            flag = sc.nextLine().equalsIgnoreCase("y");
        } while (flag);


        System.out.println("date");
        String date = sc.nextLine();
        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        library.setDateMuon(date1);
        library.setDateTra();

        libraries.add(library);
    }


    public void tra(ArrayList<Book> books,ArrayList<Library> libraries, Scanner sc){
        System.out.println("input ID user");
        String idUser = sc.nextLine();
        int count = 0;
        for (Library library: libraries){
            if (library.getUser().getIdUser().equals(idUser)){
                System.out.println(library);
                count++;
            }
        }
        if (count == 0){
            System.out.println("No data");
        } else if (count == 1){
            System.out.println("ID Book");
            String idBook = sc.nextLine();
            for (Library library: libraries){
                if (library.getUser().getIdUser().equals(idUser)){
                    if (library.getBook().size() == 1){
                        libraries.remove(library);
                        for (Book book: books){
                            if (book.getIdBook().equals(idBook)){
                                book.setAmount(book.getAmount()+1);
                            }
                        }
                    } else {
                        for (int i = 0; i < library.getBook().size(); i++){
                            if (library.getBook().get(i).getIdBook().equals(idBook)){
                                library.getBook().remove(library.getBook().get(i));
                                for (Book book: books){
                                    if (book.getIdBook().equals(idBook)){
                                        book.setAmount(book.getAmount()+1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("exit");
        }
    }
}
