package baitap_abstract;

import java.util.Scanner;
public class oto extends phuongtiendichuyen {
    private String loainhieulieu;

    //contructor

    public oto(String tenphuogntien, String tenhangsanxuat, String quocgiasx, String loainhieulieu) {
        super("ô tô", tenhangsanxuat, quocgiasx);
        this.loainhieulieu = loainhieulieu;
    }

    //contructor rỗng
    public oto()
    {

    }


    // get and set

    public String getLoainhieulieu() {
        return loainhieulieu;
    }

    public void setLoainhieulieu(String loainhieulieu) {
        this.loainhieulieu = loainhieulieu;
    }


    //method nhập
    public void nhap_oto()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhập nhiên liệu xe ô tô: ");
        loainhieulieu = sc.nextLine();
    }

    //method tực thi abstract
    @Override
    public double layvantoc(){
        return 500;
    }

    @Override
    public String toString()
    {
        return "phương tiện xe ô tô:( " + "tên hãng sx: " + this.getTenhangsanxuat() + "\n" + "quốc gia sx: " + this.getQuocgiasx() + "\n"
                + "vận tốc: " + this.layvantoc();
    }
}
