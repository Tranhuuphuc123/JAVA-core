/*tìm hiểu về toán tử 1 ngôi trong java*/
import java.util.Scanner;
public class toantu1ngoi {
    public static void main(String[] args){
        int a;
        a=100;

        boolean kH =true;

        System.out.println(" xuat ra gia tri duong +a: "+ (+a));
        System.out.println(" xuat ra gia tri am -a: "+ (-a));
        System.out.println("\n");

        System.out.println("----------phep toan tang giam-------");

        System.out.println(" xuat gia tri a ban dau: "+ a + "\n");
        System.out.println(" gia tri phep toan tang ++a: "+ (++a));
        System.out.println(" gia tri phep toan tang a++: "+ (a++));
        System.out.println(" xuat gia tri a sau a++: "+ a + "\n");

        /* o~ phep toan tang co su phan biet giua tien to va hau to
         * nhu ta thay thi khi gia tri a la 100, thi dat tien to ++a = 101, tuc la a=a+1.
         * con neu ta tiep tuc dat o hau to thi no se xuat a ra truoc roi moi thuc hien
         * toan tu tang vi du luc nay a xuat ra kqua da~ la 101 thi khi dat a++ gia tri a
         * se xuat ra kqua 101 truoc, roi no moi thuc hien phep tinh toan tu tang a=a+1
         * tuc a = 101+1=102.
         * */



        System.out.println(" gia tri phep toan giam --a: "+ --a);
        System.out.println(" gia tri phep toan giam a--: "+ (a--));
        System.out.println(" xuat gia tri a sau a--: "+ a);

        /* o~ phep toan giam cung tuong tu co su phan biet giua tien to va hau to
         * nhu ta thay thi khi gia tri a luc nay 102, thi dat tien to --a = 101, tuc la
         * a=a-1, khi ta dat o hau to thi no se xuat a ra truoc roi moi thuc hien toan tu
         * giam vi du luc nay a xuat ra kqua la 101 thi khi dat a-- gia tri a se xuat ra
         * kqua 101 truoc roi no moi thuc hien phep tinh toan tu giam a=a-1 tuc a = 101-1=100.
         * */


        /* như vậy qua bài toán ta nhận xét đc là 1 bài toán liên hoàn thì nó sẽ ghi nhận các
         * giá trị a từ trên xuống dưới, để giải thích cho các kết quả bên dưới
         * */
        System.out.println("\n");

        // phep toan phu dinh !
        System.out.println("-----phep toan phu dinh !----");

        System.out.println(" phu dinh  ket qua bien kH: "+ (!kH));
    }
}
