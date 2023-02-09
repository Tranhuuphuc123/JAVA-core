package baitap_quanlydanhsachnhanvien;
// hàm kiểm định chạy ctrinh
import  java.util.Scanner;
public class texter {
    public static void main(String[] args) {
        nhanVien[] nvs = new nhanVien[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên và thông tin nhân viên: ");

        for (int i=0; i<nvs.length;i++){
            System.out.println("nhập số tên nhân viên: ");
            String name = sc.nextLine();
            System.out.println("nhập địa chỉ: ");
            String sonha = sc.nextLine();
            String tenduong = sc.nextLine();
            String tentp = sc.nextLine();
            System.out.println("nhập mức lương: ");
            double luong = sc.nextDouble();

            Diachi dc = new Diachi();
            dc.setTenDuong(tenduong);
            dc.setSonha(sonha);
            dc.setTentp(tentp);

            nhanVien nv = new nhanVien(name, dc, luong);
//            nhanVien nv = new nhanVien();
//            nv.setName(name);
//            nv.setDiachi(dc);
//            nv.setLuong(luong);

            // tiến hành ép các tp trên vào từng pt mảng Object
            nvs[i] = nv;
        }

        System.out.println("thông tin của nhận viên trên là: " +
                "");
        // xuất thông tin
        for(nhanVien tt: nvs){
            System.out.println(tt.getName()+" " + tt.getDiachi().getSonha() +" "
                    +tt.getDiachi().getTenduong()+" "+tt.getDiachi().getTentp()+" " + tt.getLuong());
        }


    }
}
