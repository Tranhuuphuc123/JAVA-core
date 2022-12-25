package Interface_giaodien;

import java.util.Scanner;

// phương thức kế thừa 2 lớp interface maytinhbotui và sapxep
public class phanmemmaytinh implements Maytinhbotui, sapxep {
    private double a;
    private double b;

    public phanmemmaytinh(double a, double b) {
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

    public phanmemmaytinh(){

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



    // săp xếp
    @Override
    public void sapxeptang(double [] arr){
        double temp = arr[0];
        int i,j;
        for( i =0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void sapxepgiam(double [] arr){
        double temp = arr[0];
        int i,j;
        for( i =0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
