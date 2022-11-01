package ex5.model;



public class Pet {
    private static int id = 1;
    private int idPet;
    private String name;
    private String species;
    private int age;
    private Enum.gender sex;
    private String description;
    private Enum.type type;
    private String images;

    public Pet(int idPet, String name, String species, int age, Enum.gender sex, String description, Enum.type type, String images) {
        this.idPet = idPet;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.type = type;
        this.images = images;
    }

    public Pet() {

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Pet.id = id;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet() {
        this.idPet = id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Enum.gender getSex() {
        return sex;
    }

    public void setSex(Enum.gender sex) {
        this.sex = sex;
    }

    public Enum.type getType() {
        return type;
    }

    public void setType(Enum.type type) {
        this.type = type;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "id = " + idPet +
                ", name = " + name +
                ", species = " + species  +
                ", age = " + age +
                ", sex = " + sex +
                ", description = " + description  +
                ", type = " + type +
                ", images = " + images +"\n";
    }
}
