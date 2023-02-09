package baitap_quanlydanhsachnhanvien;

public class nhanVien extends Person {
    private double luong;

    // contructor
    public nhanVien(String name,Diachi diachi,double luong){
        super(name, diachi);
        this.luong = luong;
    }

    public nhanVien(){

    }



    // get and set


    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
