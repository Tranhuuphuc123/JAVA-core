package baitap_tinhluongnhanvien;
/*bài tập tính lương nhân viên theo quan hệ has-a and is-a kết thừa*/
import  java.util.Scanner;
public class texter {
    public static void main(String[] args) {
        nhanvien[] nvs = new nhanvien[2];
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập thông tin");

        for(int i=0; i<nvs.length;i++){
            System.out.println("Nhập tên");
            String ten = sc.nextLine();
            System.out.println("Nhập địa chỉ");
            String sonha= sc.nextLine();
            String tenduong = sc.nextLine();
            String tentp = sc.nextLine();
            System.out.println("Nhp số năm kinh nghiệm");
            int sonamkinhnghiem = sc.nextInt();

            Diachi dc = new Diachi();
            dc.setSonha(sonha);
            dc.setTenduong(tenduong);
            dc.setTentp(tentp);

            nvs[i] = new nhanvien(ten,dc,sonamkinhnghiem);

            //xóa bộ nhớ đệm
            sc.nextLine();
        }

        System.out.println("xuât thông tin");
        for(nhanvien nv: nvs){
            System.out.println(nv.getName() + " " + nv.getDiachi().getSonha() + " "
            + nv.getDiachi().getTenduong()+ " " + nv.getDiachi().getTentp() +" "
            + nv.luong() + "\n");
        }

    }
}
