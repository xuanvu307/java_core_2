package quanlysach.model;

public class User {
    private String idUser;
    private String name;
    private int numberPhone;
    private  String address;

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser() {
        this.idUser = "User" + (Book.id++);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User : " +
                "idUser = " + idUser +
                ", name = " + name  +
                ", numberPhone = " + numberPhone +
                ", address = " + address + "\n";
    }
}
