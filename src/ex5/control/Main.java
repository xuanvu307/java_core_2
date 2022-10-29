package ex5.control;

import ex5.model.Pet;
import ex5.model.PetModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetModel petModel = new PetModel();
        ArrayList<Pet> pets = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        boolean check = true;

        //thêm pet ban đầu

        System.out.println("input number pet");
        int number = Integer.parseInt(sc.nextLine());
        petModel.inputPetRandom(sc,number,pets);

        System.out.println(pets);

        //Nhập thông tin pet của bạn:

        System.out.println("input my pet");
        Pet myPet = petModel.inputPet(sc);
        System.out.println( " My pet: " + myPet);

        int checkMatch = 0;
        int count = 0;
        do {
            int rdNumber = rd.nextInt(pets.size());
            Pet pet = pets.get(rdNumber);
            count++ ;
            if (pet.getType().equals(myPet.getType())
                    && !(pet.getSex().equals(myPet.getSex()))){
                System.out.println("Matching: " + pet);
                checkMatch++;
                System.out.println("do you want to continues y/ n");
                String checkYN = sc.nextLine();
                if (checkYN.equalsIgnoreCase("y")){
                    check = true;
                } else {
                    check = false;
                }
            }

            // nếu tìm quá nhiều không ra kết quả thì thoát chương trình

            if (count == 100 && checkMatch == 0){
                System.out.println("No match");
                check = false;
            }
        } while (check);
        System.out.println("Exit");
    }
}
