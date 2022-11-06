package Basic01;

import java.util.Scanner;
public class bt02_inbangcuuchuong {
    public static  void main(String[] args){
        //03 thực hiện  in bảng cửu chương
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("enter the n: ");;
        n = sc.nextInt();

        System.out.println("==============================");
        for(int i = 0; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }

        System.out.println("---------------------------------------");



        //04 viết chuơng trình tráo đổi biến hay conf gọi là ép kiểu
        // ép kiểu ngầm định
        int a = 5;
        double b = 6.0;

        double epkieu = a;
        System.out.println("gia tri ep kieu ngam dinh: " + epkieu);

        // ép kiểu tường minh
        int c = (int) b;
        System.out.println("gia tri ep kieu tong minh: " + c);


    }
}
