package quanlysach.control;

import quanlysach.model.*;
import quanlysach.view.MenuView;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Library> libraries = new ArrayList<>();
        UserModel userModel = new UserModel();
        BookModel bookModel = new BookModel();
        LibraryModel libraryModel = new LibraryModel();
        MenuView menuView = new MenuView();

        boolean check =true;
        while (check){
            menuView.homeMenu();
            int chooseNumber = Integer.parseInt(sc.nextLine());
            switch (chooseNumber){
                case 1:
                    menuView.menuUser();
                    chooseNumber = Integer.parseInt(sc.nextLine());
                    if (chooseNumber == 1){
                        userModel.addUser(users,sc);        // thêm user
                    } else if (chooseNumber == 2){
                        userModel.searchUser(users,sc);     //tìm user
                    } else if (chooseNumber == 3){
                        userModel.editOrDeleteUser(users,sc); // sửa hoặc xóa user
                    } else if (chooseNumber == 4){
                        System.out.println(users);          // in danh sách user
                    }
                    break;
                case 2:
                    menuView.menuBook();
                    chooseNumber = Integer.parseInt(sc.nextLine());
                    if (chooseNumber == 1){
                        bookModel.addBook(books,sc);            // thêm sách
                    } else if (chooseNumber == 2){
                        bookModel.editOrDeleteBook(books,sc);   // sửa hoặc xóa sách
                    } else if (chooseNumber == 3){
                        System.out.println(books);              // in danh sách
                    }
                    break;
                case 3:
                    menuView.menuLibrary();
                    chooseNumber = Integer.parseInt(sc.nextLine());
                    if (chooseNumber == 1){
                        libraryModel.muon(users,books,libraries,sc);    // mươn sách
                    } else if (chooseNumber == 2){
                        libraryModel.tra(books,libraries,sc);     // trả sách
                    } else {
                        System.out.println(libraries);                  // danh sách người mượn sách
                    }
                    break;
                case 0:
                    check =false;
                    System.out.println("Exit");
            }
        }
    }
}
