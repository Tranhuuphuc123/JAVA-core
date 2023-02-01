package menu_lenh;
// thuc hien tao menu lenh de thuc thi tinh toan dien tich hinh tron va hinh vuong
// dang menu don gian 01

import javax.security.sasl.SaslClient;
import java.util.Scanner;
public class Menu_01 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        // thuc thi menu lenh
        do {
            System.out.println("------------Menu------------");
            System.out.println("vui long chon cac phim chuc nang");
            System.out.println("0./ exit chuwog trinh");
            System.out.println("1./ thuc thi tinh dien tich, chuvi hinh vuong");
            System.out.println("2./ thuc thi tinh chu vi, dien tich hinh tron");

            n= sc.nextInt();

            switch (n){
                case 1:
                    Dientich_hinhvuong dthv = new Dientich_hinhvuong();
                    System.out.println("yeu cau nhap chieudaicanh: ");
                    float chieudaicanh =  sc.nextFloat();
                    System.out.println("dientich hinh vuong la: " + dthv.dientichhinhvuong(chieudaicanh));
                    System.out.println("chuvi hinh vuong la: " + dthv.chuvihinhvuong(chieudaicanh));
                    break;

                case 2:
                     Dientich_hinhtron dtht = new Dientich_hinhtron();
                     System.out.println("yeu cau nhap ban kinh: ");
                     float bankinh = sc.nextFloat();
                     System.out.println("dientichhinhtron: " + dtht.dientichhinhtron(bankinh));
                     System.out.println("chuvi hinhtron: " + dtht.chuvihinhtron(bankinh));
                     break;

                default:
                     System.out.println("vui long chon menu lenh");

            }

        }while (n!=0);
    }
}
