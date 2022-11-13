import java.util.Scanner;



public class kiemtrasonguyento {


    // xây dựng funtion hàm tính số nguyên tố
    public boolean songuyento(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

            return true;

        }

 // thực thi trong hàm main
      public static void main(String[] args){
            kiemtrasonguyento a = new kiemtrasonguyento();
            Scanner sc = new Scanner(System.in);
            int n;

            System.out.println("enter the n: ");
            ;
            n = sc.nextInt();

            if (a.songuyento(n) == false) {
                System.out.println("đy hông phải là số nguyen tố");
            } else {
                System.out.println("đy là số nguyên tố");
            }
        }
}
