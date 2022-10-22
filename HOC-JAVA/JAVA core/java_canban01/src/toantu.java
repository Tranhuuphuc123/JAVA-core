
import java.util.Scanner;
public class toantu {

    // tìm hiểu về toán tử trong java

    public static void main(String[] args) {
        // khai báo lớp scanner

        Scanner scan = new Scanner(System.in);

        System.out.println(" nhap vao toan hang a: ");
        int a=scan.nextInt();
        System.out.println(" nhap vao toan hang b: ");
        int b=scan.nextInt();


        int tong = a +b;
        int hieu = a - b;
        float thuong =a/b;
        int tich = a*b;
        float phepchialaydu = a%b;


        System.out.println("----------------------");

        System.out.println("tong: " + a + "+" + b + "=" + tong );
        System.out.println("hieu: " + a + "-" + b + "=" + hieu );
        System.out.println("tich: " + a + "*" + b + "=" + tich );
        System.out.println("thuong: " + a + "/" + b + "=" + thuong );
        System.out.println("phepchialaydu: " + a + "%" + b + "=" + phepchialaydu );


    }
}
