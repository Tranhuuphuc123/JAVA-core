package tinhdahinh;

import baitap_quanlydanhsachnhanvien.Person;

public class Employee extends person {
    private double luong;

    // contructor

    public Employee() {

    }

    // get and set

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    // Override lại lớp cha
    @Override
    public void thongtin(){
        System.out.println("đây là lớp con Employee");
    }
}
