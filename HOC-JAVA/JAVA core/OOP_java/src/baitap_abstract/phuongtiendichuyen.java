package baitap_abstract;
// lop cha phuongtiendichuyen với lop abstract

import java.util.Scanner;
public  abstract  class phuongtiendichuyen {
    private String tenphuogntien;
    private String tenhangsanxuat;
    private String quocgiasx;

    //contrutor

    public phuongtiendichuyen(String tenphuogntien, String tenhangsanxuat, String quocgiasx) {
        this.tenphuogntien = tenphuogntien;
        this.tenhangsanxuat = tenhangsanxuat;
        this.quocgiasx = quocgiasx;
    }
    public phuongtiendichuyen(){

    }

    //get and set


    public String getTenphuogntien() {
        return tenphuogntien;
    }

    public void setTenphuogntien(String tenphuogntien) {
        this.tenphuogntien = tenphuogntien;
    }

    public String getTenhangsanxuat() {
        return tenhangsanxuat;
    }

    public void setTenhangsanxuat(String tenhangsanxuat) {
        this.tenhangsanxuat = tenhangsanxuat;
    }

    public String getQuocgiasx() {
        return quocgiasx;
    }

    public void setQuocgiasx(String quocgiasx) {
        this.quocgiasx = quocgiasx;
    }

    // method nhập
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên hãng sx: " );
        tenhangsanxuat = sc.nextLine();
        System.out.println("nhập tên quốc gia sx: " );
        quocgiasx = sc.nextLine();
    }

    // method lấy tên hãng sản xuất.
    public String laytenhangsanxuat(){
        return this.getTenhangsanxuat();
    }

    // lớp trừu tượng abstarct
    public abstract double layvantoc();
    public abstract String toString();
}
