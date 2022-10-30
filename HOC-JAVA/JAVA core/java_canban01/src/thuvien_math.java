
 import java.util.Scanner;
public class thuvien_math {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("nhap vào gia tri a: ");
        a = sc.nextInt();
        System.out.println("nhap vào gia tri b: ");
        b = sc.nextInt();

        // trị tuyệt đối
        System.out.println("|a|: " + Math.abs(a));

        //^2
        System.out.println("a^2: " + Math.pow(a,2));

        //hàm ceil
        System.out.println("ceil a: " + Math.ceil(b));
        //...
    }
}
