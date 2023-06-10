package baitap_tinhluongnhanvien;
// tạo lớp con người tạo liên kết is-A kế thừa
public class connguoi {
    private final double luongcoban = 4450000;// lg cơ bản 2 triêu
    private String name;
    private Diachi diachi;

    // contructor

    public connguoi() {
    }

    public connguoi(String name, Diachi diachi) {
        this.name = name;
        this.diachi = diachi;
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


    //method tinh luong co ban
    public double luong(){
        return luongcoban;
    }


}
