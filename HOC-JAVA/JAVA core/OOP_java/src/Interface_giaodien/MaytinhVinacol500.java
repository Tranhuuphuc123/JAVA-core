package Interface_giaodien;

import java.util.Scanner;

public class MaytinhVinacol500 implements Maytinhbotui{
    private double a;
    private double b;

    //contructor

    public MaytinhVinacol500(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // get and set

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    //xây dựng method thực thi lớp interface
    @Override
    public double nhap_cong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        a=sc.nextDouble();
        System.out.println("nhap b: ");
        b=sc.nextDouble();
        return 0;
    }
    @Override
    public double xuatcong(){
        double tong = a+b;
        System.out.println("kw: " + tong);
        return tong;
    }

    // khái báo kiểu tự gáng giá trị mặc định
    @Override
    public  double cong(double a, double b){
        return a+b;
    }


    @Override
    public double tru(double a, double b){
        return a-b;
    }


    @Override
    public double nhan(double a, double b){
        return a*b;
    }


    @Override
    public double chia(double a, double b){
        return a/b;
    }
}
