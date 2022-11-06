package Basic01;
import java.util.Scanner;
public class bt04_nhapchuoinhiphan {
    // bài tập nhập chuỗi nhị phân tính tổng hiệu...
    public static void main(String[] args){
        int str1, str2;
        String  chuyendoi1 =" ";
        String  chuyendoi2 =" ";

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the str1: ");
        str1 = sc.nextInt();
        System.out.println("enter the str2: ");
        str2= sc.nextInt();

        while(str1 >0 & str2>0){
            chuyendoi1 = str1%2 + chuyendoi1;
            chuyendoi2 = str2 + chuyendoi2;
            str1 /= 2;
            str2 /= 2;
        }

        System.out.println("--------------");
        System.out.print("chuyendoi1: " + chuyendoi1 + " " + "chuyendoi2: " + chuyendoi2);

        // chyển đổi chuyendoi1 và chuyendoi 2 sang int số nguyên
        int number1 = Integer.parseInt(chuyendoi1);
        int number2 = Integer.parseInt(chuyendoi2);

        // sau khi chuyển đổi tiến hành xây dựng hàm cộng trừ... mã nhị phân

        var sum = number1 + number2;
        var dif = number1 - number2;

        // tiến hành chuyển kết quả thành  kết quả toán học của m nhị phân với toBinaryString

        String sumBinary = Integer.toBinaryString(sum);
        String difBinary = Integer.toBinaryString(dif);


        // xuất kết quả
        System.out.println("======kết quả phép tính =====");

        System.out.print(number1 + "+" + number2 + ": " + sumBinary);
        System.out.println("");
        System.out.print(number1 + "-" + number2 + ": " + difBinary);
    }
}
