package baitap_quanly_film;
/*thông tin các bộ phim kèm chi tiết liên quan*/

import java.util.Scanner;
public class Quanly_film extends myForm{
    private String tenphim;
    private int namsanxuat;
    private int giave;

    // contructor


    public Quanly_film(String tenhangsanxuat, String quocgia, int day, int month,
                       int year, String tenphim, int namsanxuat, int giave) {
        super(tenhangsanxuat, quocgia, day, month, year);
        this.tenphim = tenphim;
        this.namsanxuat = namsanxuat;
        this.giave = giave;
    }

    public Quanly_film(){
        // phần rổng để tiến hành nhập code tự do bên hàm main
    }

    //geter and setter

    public String getTenphim() {
        return this.tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public int getNamsanxuat() {
        return this.namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public int getGiave() {
        return this.giave;
    }

    public void setGiave(int giave) {
        this.giave = giave;
    }


    //method nhập quanly_film
    public void nhap_film(){
        Scanner sc = new Scanner(System.in);
        super.nhap_form();
        System.out.println("Nhập tên film: ");
        tenphim = sc.nextLine();
        System.out.println("nhập năm sản xuất: ");
        namsanxuat = sc.nextInt();
        System.out.println("nhập giá vé: ");
        giave = sc.nextInt();
    }

    //method xuất film
    public void xuat_film(){
        System.out.println("-----------------------------");
        super.xuat_form();
        System.out.println("tên film: " + tenphim);
        System.out.println("năm sx của phim: " + namsanxuat);
        System.out.println("giá vé: " + giave);
    }



    //so sánh giá vé nào rẻ hơn
    // sử dụng kieur cách gống pt equals, tuy nhiên equals thì để ss =
    public boolean sosanhgiave(Quanly_film kiemthu){
        return this.giave < kiemthu.giave;
    }



    // giảm giá giá vé xem phim
    public double giamgiavephim(double x){
        return this.giave*(1-x/100);
    }



    //toString
    @Override
    public String toString(){
        return  "Thông tin: (" + "tn film: " + tenphim + "năm sx: " + namsanxuat + "giá vé: "
                + giave +")";
    }


}
