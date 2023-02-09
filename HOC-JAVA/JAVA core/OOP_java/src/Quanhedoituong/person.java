package Quanhedoituong;
// trong class person o phan khuc dia chi ta dùng class Diachi làm kiểu dữ liệu trả về cho Object diachi
public class person {
    private String name;
    private  Diachi diachi;

    //contructor

    public person() {
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
