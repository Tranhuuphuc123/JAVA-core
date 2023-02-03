package Mang_Object;
// thực hiện tạo mảng của đối tượng trong lập trình OOP
import java.util.Scanner;
public class text {
    public static void main(String[] args) {
        // tạo manng cho đối tượng bằng cách dùng tên class thay thế kiểu dl trả về
        sub_thongtin [] thongtin = new sub_thongtin[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin");;

        // tiến hành nhập thong tin và ép vào mảng đối tượng
        for(int i =0; i<thongtin.length;i++){
            String ten = sc.nextLine();
            String diachi = sc.nextLine();
            int tuoi = sc.nextInt();

            // gán tt vào từng mảng đối tương
            thongtin[i] = new sub_thongtin(ten, diachi, tuoi);

            // xóa bộ nhớ đệm của bàn phím đi
            sc.nextLine();
        }

        // tiến hành xuất thông tin mảng đối tượng
        for(sub_thongtin tt: thongtin){
            System.out.println(tt.getName() + " " + tt.getDiachi() + " " + tt.getTuoi());
        }
    }
}
