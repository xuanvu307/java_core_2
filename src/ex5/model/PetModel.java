package ex5.model;

import constant.Enum;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PetModel {
    public Pet inputPet(Scanner sc){
        Pet pet = new Pet();
        System.out.println("name");
        String name = sc.nextLine();
        pet.setName(name);
        System.out.println("species");
        String species = sc.nextLine();
        pet.setSpecies(species);
        System.out.println("age");
        int age = Integer.parseInt(sc.nextLine());
        pet.setAge(age);
        System.out.println("sex \n 1. male\n 2. female");
        int chooseNumber = Integer.parseInt(sc.nextLine());
        switch (chooseNumber){
            case 1:
                pet.setSex(Enum.gender.MALE);
                break;
            case 2:
                pet.setSex(Enum.gender.FEMALE);
                break;
        }
        System.out.println("description");
        String description = sc.nextLine();
        pet.setDescription(description);
        System.out.println("type: \n 1.Cat\n 2.Dog");
        chooseNumber = Integer.parseInt(sc.nextLine());
        switch (chooseNumber){
            case 1:
                pet.setType(Enum.type.CAT);
                break;
            case 2:
                pet.setType(Enum.type.DOG);
                break;
        }
        System.out.println("image: ");
        String image = sc.nextLine();
        pet.setImages(image);
        pet.setIdPet();
        return pet;
    }


    // tạo ngẫu nhiên số pet ban đầu mà mình muốn

    public void inputPetRandom(Scanner sc, int number , ArrayList<Pet> pets){
        for (int i = 0 ; i < number ; i++) {

            Pet pet = new Pet();
            String name = Integer.toString(i);
            pet.setName(name);
            String species = Integer.toString(i);
            pet.setSpecies(species);
            int rdNumber = (int)(Math.random()*100)%5 +1;  // set tuổi cho pet random từ 1- 5 tuổi
            int age = rdNumber;
            pet.setAge(age);
            rdNumber = (int)(Math.random()*100)%2;
            int chooseNumber = rdNumber;            // sét ngẫu nhiên giới tính cho pet
            switch (chooseNumber){
                case 0:
                    pet.setSex(Enum.gender.MALE);
                    break;
                case 1:
                    pet.setSex(Enum.gender.FEMALE);
                    break;
            }
            String description = Integer.toString(i);
            pet.setDescription(description);
            rdNumber = (int)(Math.random()*100)%2;
            chooseNumber = rdNumber;                // set ngẫu nhiên thể loại cho pet
            switch (chooseNumber){
                case 0:
                    pet.setType(Enum.type.CAT);
                    break;
                case 1:
                    pet.setType(Enum.type.DOG);
                    break;
            }
            String image = Integer.toString(i);
            pet.setImages(image);
            pet.setIdPet();

            pets.add(pet);              // thêm pet vào list
        }
    }
}
