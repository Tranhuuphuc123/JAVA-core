package Basic01;

import java.util.Scanner;
public class bt06_hebatphan {
    // bài tập chuyển cơ số  thập phân sáng bát phân?????(xem lại)
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, i=1;

        int batphan [] = new int[100];

        System.out.println("enter the n: ");
        n = sc.nextInt();

        while(n>0){
            batphan[i++] = n%8;
            n /= 8;
        }

        System.out.println("------xuất giá trị-----");

        for(int j =i-1; j>0;j--){
            System.out.println(batphan[j]);
        }
        System.out.println("");

    }
}
