package Interface_giaodien;
// đối với interface ta sẽ kế thừa  lớp interface bằng từ Implement và Override lại method ở lớp interface.

import java.util.Scanner;
public class MaytinhCasioFX570 implements Maytinhbotui {
    private double a;
    private double b;

    public MaytinhCasioFX570(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public MaytinhCasioFX570(){

    }

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

    // tiến hành Override lại các method bên interface
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
        System.out.println("kw cộng: " + tong);
        return tong;
    }

    @Override
    public double cong(double a, double b){
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
