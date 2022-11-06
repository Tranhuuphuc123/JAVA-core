package Basic01;
// tiềm hiểu bài tập chuyển từ nhị phân sang thập phân ngc lại bat03


import java.util.Scanner;
public class bt07_chuyennhiphan_thaphan {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        //c01 chuyển đổi thèo hàm Interger.ParseInt();
        System.out.println("enter the String binary: ");
        String nhiphan = sc.nextLine();


        int chuyendoi = Integer.parseInt(nhiphan,2);
        // phần radix: 2 trong ParseInt() là chuyển cơ số nhị phân cơ số 2
        System.out.println("----------------");
        System.out.println(nhiphan + " dc chuyen thành: " + chuyendoi);



        System.out.println("-----------------------------------------");

        ///cách 02 phương thức hàm main

        long n, thapphan = 0; // pt cộng dồn các giá trị
        int p=0;
        System.out.print("Input a binary number n: ");
        n = sc.nextLong();

        while (n != 0)
        {
            long temp = n%10; // khai báo biến temp để lưu giá trị n%10
            thapphan += temp*Math.pow(2, p);// triển khai pt cộng dồn
            n /=10; // chia 10 để lâ phần nguyên không lấy sau dấu phẩy.
            p++;

            /**
             *
             * vd bài toán đây nhâp vào mảng nhị phân 101
             * 101%10 = 10.1 lay dư 1
             * 101/10 =10.1 láy phan nguyên 10
             * thapphan = 1*2^0 = 1 (lúc này p =0 giá trị khởi tạo)
             *
             * --> tt thực hiện p++ lên một gí trị p=1
             * 10%10 = 1 chia hết  lấy du 0 (luu ý phép chia lấy dư nha)
             * 10/10 =1 hông gì thay đổi vẫn lấy 1
             * thaphan = 0*2^0 =0
             *
             * --> tt thực hiện p++ lên nữa p = 2
             * 1%10 = không chia đc dư 1 kt xét n%10
             * thapphan = 1*2^2=4
             *
             * ==> kết quả thapphan = 1+0+4=5, vậy nhập 1010 sẽ có gias trị dicemal là 5
             * làm tg tự chocacacs mã khác
             */

        }
        System.out.println("Decimal Number: " + thapphan);
    }
}
