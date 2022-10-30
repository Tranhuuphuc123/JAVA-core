import java.util.Scanner;

public class toantugang {
    public static void main(String[] args){
        //tìm hiểu về toán tử gáng dữ liệu trong java

        int a;

        Scanner intput= new Scanner(System.in);

        System.out.println("nhap vao gia tri a: ");
        a = intput.nextInt();

        a +=3;
        System.out.println(" gia tri a +=:  " + a);

        a -=2;
        System.out.println(" gia tri a -=:  " + a);

        a *=4;
        System.out.println(" gia tri a *=:  " + a);

        a /=4;
        System.out.println(" gia tri a /=:  " + a);

        a %=2;
        System.out.println(" gia tri a %=:  " + a);

    }
}
