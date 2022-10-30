package quanlysach.model;

import quanlysach.view.MenuView;

import java.util.ArrayList;
import java.util.Scanner;

public class UserModel {
    MenuView menuView = new MenuView();


    // thêm người đọc
    // người dùng được thêm mới thành công sẽ auto lưu vào list

    public void addUser(ArrayList<User>users,Scanner sc){
        System.out.println("input name: ");
        String name = sc.nextLine();
        System.out.println("input phone number");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.println("address");
        String address = sc.nextLine();

        User user = new User();
        user.setIdUser();
        user.setName(name);
        user.setNumberPhone(phone);
        user.setAddress(address);

        users.add(user);
    }

    // tìm kiếm người đọc theo tên hoặc id
    // tìm id phải đúng, hoặc chứa ký tự trong tên

    public int searchUser(ArrayList<User> users, Scanner sc){
        int count = 0;
        System.out.println("name or id");
        String key = sc.nextLine();
        for (User user: users){
            if (key.equals(user.getIdUser()) || key.contains(user.getName())){
                System.out.println(user);
                count ++;
            }
        }
        if (count == 0){
            System.out.println("no result");
        }
        return count;
    }

    //sửa hoặc xóa người đọc
    // tìm kiếm toàn bộ list người đọc theo tên hoặc id
    // muốn sửa hoặc xóa người đọc cần nhập id đúng theo list tìm kiếm vì id là duy nhất không trùng lặp

    public void editOrDeleteUser(ArrayList<User> users, Scanner sc){
        int count = searchUser(users,sc);
        if (count != 0){
            menuView.menuEditOrDelete();
            int chooseNumber = Integer.parseInt(sc.nextLine());
            switch (chooseNumber){
                case 1:
                    System.out.println("enter id in list to delete");
                    String key =sc.nextLine();
                    int check = 0;
                    for (int i = 0; i < users.size(); i++){
                        if (key.equals(users.get(i).getIdUser())){
                            users.remove(users.get(i));
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
                    for (User user : users) {
                        if (key.equals(user.getIdUser())) {
                            menuView.menuEditUser();
                            chooseNumber = Integer.parseInt(sc.nextLine());
                            if (chooseNumber == 1) {
                                System.out.println("new phoneNumber");
                                int phoneNumber = Integer.parseInt(sc.nextLine());
                                user.setNumberPhone(phoneNumber);
                                check++;
                            } else if (chooseNumber == 2) {
                                System.out.println("new address");
                                String address = sc.nextLine();
                                user.setAddress(address);
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
