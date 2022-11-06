package Basic01;

import java.util.Scanner;
public class bt03_manhiphan {


    /*
    * bài tập nâng cao nhập ha số chuyển thành ẫ nhị phân thực hiện phép tính + - * / mã nhị phân
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1,n2;
        System.out.println("enter the n1: ");
        n1 = sc.nextInt();
        System.out.println("enter the n2: ");
        n2 = sc.nextInt();


        // thực hiện chuyển đổi n1,n2 thành mã nhị phân
        String chuyendoi1 = " "; //tạo một hàm rỗng đ cộng dồn giá trị remaider(giá trị còn lại khi chia %2 trong cach chuyển đổi nhị phân)
        String chuyendoi2= " ";
        while(n1>0 & n2 >0){// đặt đk n> 0 vì chuyển nhị phân không có số =0 hay <0 chia %2 đc
            chuyendoi1 = n1%2 + chuyendoi1; //khi kw %2 sẽ lấy dư  và sắp xếp nó cộng dồn phía trc chia dc 1 để 1, chia đc 0  thi cộng dồn  01
            n1 /= 2; // thục hiện chia 2 để nó lấy phần nguyên vd 10/2 = 5 -> 5/2 =2.5 nhưg chi lay 2

            chuyendoi2 = n2%2 + chuyendoi1;
            n2 /= 2;
        }

   // xem kết quả chuyển đổi
        System.out.print( "chuyendoi1: " + chuyendoi1 + " ");
        System.out.print( "chuyendoi2: " + chuyendoi2 + " ");


        // thực hiện chuyển đôi hai chuoi String chuyendoi1&2 thành số nguyên int

        int number1 = Integer.parseInt(chuyendoi1);
        int number2 = Integer.parseInt(chuyendoi2);

        // thực hiện xây dựng hàm định nghĩa tính tổng, hiệu, tích... mã nhị phân

        int sum = number1 + number2;
        int dif = number1 - number2;
        int prod = number1 * number2;

        //tiến hành chuyển hàm sum, dif, prod(nhân) thành phép tính toán của mã nhị phân.
        String  sumBinary = Integer.toBinaryString(sum);
        String  difBinary = Integer.toBinaryString(dif);
        String  prodBinary = Integer.toBinaryString(prod);

        System.out.println("--------xuất kết quả-------------");
        System.out.println( chuyendoi1 + "+" + chuyendoi2 + "=" + sumBinary);
        System.out.println( chuyendoi1 + "-" + chuyendoi2 + "=" + difBinary);
        System.out.println( chuyendoi1 + "*" + chuyendoi2 + "=" + prodBinary);


        /// còn lỗi sữa sau

        
    }
}
