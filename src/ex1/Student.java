package ex1;

public class Student {
    private static int id = 1001;
    private int idStudent;
    private String name;
    private String address;


    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent() {
        this.idStudent = id++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
