package ex5.model;

import constant.Enum;

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
}
