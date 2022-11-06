package Basic01;

import java.util.Scanner;

public class bt05_hethaplucphan {
    /*
    * hệ thập lục phân nhập: nhập số chuyển đổi sang hệ thập lục phân
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        String chuyendoi =" ";
        char hex [] ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        System.out.print("enter the n:  " + "\n");
        n = sc.nextInt();

        // dùng hàm while text đk đầu vào để truy ra hệ thập lục phân

        while(n>0){
            int rem = n%16;
           chuyendoi = hex[rem] + chuyendoi;
            n /= 16;
        }

        System.out.println(" =================xuất kết quả tra về ===============");

        System.out.print("he thap luc phan cua " + n + " la : " + chuyendoi);

    }
}
