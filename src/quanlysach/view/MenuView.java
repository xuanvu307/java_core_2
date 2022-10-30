package quanlysach.view;

import java.util.Scanner;

public class MenuView {
    public void homeMenu(){
        System.out.println("===== MENU =====");
        System.out.println("1. User");
        System.out.println("2. Book");
        System.out.println("3. library");
        System.out.println("0. Exit");

    }

    public void menuUser(){
        System.out.println("===== MENU =====");
        System.out.println("1. ADD");
        System.out.println("2. SEARCH");
        System.out.println("3. EDIT");
        System.out.println("4. PRINT LIST");
    }

    public void menuBook(){
        System.out.println("===== MENU =====");
        System.out.println("1. ADD");
        System.out.println("2. EDIT");
        System.out.println("3. PRINT LIST");
    }

    public void menuEditOrDelete(){
        System.out.println("===== MENU =====");
        System.out.println("1. DELETE");
        System.out.println("2. EDIT");
    }
    public void menuEditUser(){
        System.out.println("===== MENU =====");
        System.out.println("1. Phone Number");
        System.out.println("2. Address ");
    }
    public void menuEditBook(){
        System.out.println("===== MENU =====");
        System.out.println("1. name");
        System.out.println("2. category");
        System.out.println("3. author");
        System.out.println("4. amount");
    }

    public void menuLibrary(){
        System.out.println("===== MENU =====");
        System.out.println("1. muonwj sach");
        System.out.println("2. tra sasch");
        System.out.println("3. Print");
    }

}
