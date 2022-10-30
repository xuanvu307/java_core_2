package quanlysach.model;

import quanlysach.view.MenuView;

import java.util.ArrayList;
import java.util.Scanner;

public class BookModel {
    MenuView menuView = new MenuView();
    public void addBook(ArrayList<Book> books, Scanner sc){
        Book book = new Book();
        book.setIdBook();
        System.out.println("name");
        book.setName(sc.nextLine());
        System.out.println("category");
        book.setCategory(sc.nextLine());
        System.out.println("author");
        book.setAuthor(sc.nextLine());
        System.out.println("amount");
        book.setAmount(Integer.parseInt(sc.nextLine()));

        books.add(book);
    }

    public int searchBook(ArrayList<Book> books, Scanner sc){
        int count = 0;
        System.out.println("name or id");
        String key = sc.nextLine();
        for (Book book: books){
            if (key.equals(book.getIdBook()) || key.contains(book.getName())){
                System.out.println(book);
                count ++;
            }
        }
        return count;
    }

    public void editOrDeleteBook(ArrayList<Book> books, Scanner sc){
        int numberSearch = searchBook(books, sc);
        if (numberSearch == 0){
            System.out.println("no result");
        } else {
            menuView.menuEditOrDelete();
            int chooseNumber = Integer.parseInt(sc.nextLine());
            switch (chooseNumber){
                case 1:
                    System.out.println("enter id in list to delete");
                    String key =sc.nextLine();
                    int check = 0;
                    for (int i = 0; i < books.size(); i++){
                        if (key.equals(books.get(i).getIdBook())){
                            books.remove(books.get(i));
                            System.out.println("delete OK");
                            check++;
                        }
                    }
                    if (check == 0){
                        System.out.println("ID Wrong");
                    }
                    break;
                case 2:
                    System.out.println("enter id in list to edit");
                    key =sc.nextLine();
                    check = 0;
                    for (Book book : books) {
                        if (key.equals(book.getIdBook())) {
                            menuView.menuEditBook();
                            chooseNumber = Integer.parseInt(sc.nextLine());
                            if (chooseNumber == 1) {
                                System.out.println("new name");
                                String name = sc.nextLine();
                                book.setName(name);
                                check++;
                            } else if (chooseNumber == 2) {
                                System.out.println("new category");
                                String category = sc.nextLine();
                                book.setCategory(category);
                                check++;
                            } else if (chooseNumber == 3) {
                                System.out.println("new author");
                                String name = sc.nextLine();
                                book.setAuthor(name);
                                check++;
                            } else if (chooseNumber == 4) {
                                System.out.println("new amount");
                                int newAmount = Integer.parseInt(sc.nextLine());
                                book.setAmount(book.getAmount() + newAmount);
                                check++;
                            } else {
                                System.out.println("Choose number wrong");
                                check++;
                            }
                        }
                    }
                    if (check == 0 ){
                        System.out.println("ID Wrong");
                    }
                    break;
                default:
                    System.out.println("back");
                    break;
            }
        }
    }
}
