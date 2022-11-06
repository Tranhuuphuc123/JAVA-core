package Basic01;
import java.util.Scanner;

public class bt01 {
    public static void main(String[] args){

        // bai01 viết chương trình in ra hello world
        System.out.println("hello world");

        //02 viết chtrinh nhap vo hai so tinh toán cong tru nhan chia..

        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the a: ");
        a = sc.nextInt();
        System.out.println("enter the b: ");
        b = sc.nextInt();


        int tong = a + b;
        int kq = (a+b)%9 ;
        // thực hiện tương tự các phép toán khác
        System.out.println("----------------------");
        System.out.println("tong la: " + tong);
        System.out.println("kq la: " + kq);

    }
}
