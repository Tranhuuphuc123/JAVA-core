package baitap_quanlydanhsachnhanvien;

public class Person {
    private String name;
    private Diachi diachi;

    // contructor

    public Person() {

    }

    public Person(String name, Diachi diachi) {
        this.diachi = diachi;
        this.name = name;
    }

    // get and set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Diachi getDiachi() {
        return diachi;
    }

    public void setDiachi(Diachi diachi) {
        this.diachi = diachi;
    }

}
