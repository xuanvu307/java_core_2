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

        boolean check = false;
        System.out.println("input number pet");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0 ; i < number ; i++){
            System.out.println("pet: " +(i+1));
            Pet pet = petModel.inputPet(sc);
            pets.add(pet);
        }

        System.out.println("input my pet");
        Pet myPet = petModel.inputPet(sc);
        System.out.println( " My pet: " + myPet);

        do {
            int rdNumber = rd.nextInt(pets.size());
            Pet pet = pets.get(rdNumber);
            if (pet.getType().equals(myPet.getType())
                    && !(pet.getSex().equals(myPet.getSex()))){
                System.out.println("Matching: " + pet);
                System.out.println("do you want to continues y/ n");
                String checkYN = sc.nextLine();
                if (checkYN.equalsIgnoreCase("y")){
                    check = true;
                } else {
                    check = false;
                }
            }
        } while (check);
        System.out.println("Exit");
    }
}
