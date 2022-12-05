package bai_tap_quanly_sach;
import java.util.Scanner;

// class tiến hành nhp và và quản lý sách đầu vào
public class quanlysach extends tacgia{
    private String ten_sach;
    private double giaban;
    private int namxuatban;

    // khởi tạo contructor


    public quanlysach(String name, int ngay, int thang, int nam,String ten_sach, double giaban, int namxuatban) {
        super(name, ngay, thang, nam);
        this.ten_sach = ten_sach;
        this.giaban = giaban;
        this.namxuatban = namxuatban;
    }

    public quanlysach(){
        //hàm rỗng để tiến hành nhập xuất trực tiếp bên hàm text
    }

    // khởi tạo getter and setter

    public String getTen_sach() {
        return this.ten_sach;
    }

    public void setTen_sach(String ten_sach) {
        this.ten_sach = ten_sach;
    }

    public double getGiaban() {
        return this.giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamxuatban() {
        return this.namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        this.namxuatban = namxuatban;
    }


    //xây dựng method thực thi nhập và xuất sách
    public void nhap_sach(){
        Scanner sc = new Scanner(System.in);
        super.nhap();

        System.out.println("nhập tên sách: " );
        ten_sach = sc.nextLine();
        System.out.println("nhập giá bán: ");
        giaban = sc.nextDouble();
        System.out.println("nhập năm xuất bản: ");
        namxuatban = sc.nextInt();

    }

    //xuất
    public void xuat_sach(){
        System.out.println("-----------------------------------------------");
        super.xuat();
        System.out.println("tên sách: " + ten_sach);
        System.out.println("giá bán: " + giaban);
        System.out.println("năm xuất bản: " + namxuatban);
    }

    // tiến hành so sánh xem nó có cùng nằm xuất bản hay không dùng pt equals
    public boolean equals(Object p){
        if(this == p )
            return true;
        if(p==null || this.getClass() != p.getClass())
            return false;

        //ép kiểu về chunng lớp chung Object cảu class
        quanlysach b = (quanlysach) p;

         if(this.namxuatban != b.namxuatban)
           return false;

         return true;
    }


    // tiến hành giảm giá sản phẩm
    public double giaSauKhiGiam(double x) {
        return this.giaban*(1-x/100);
    }


    // toString
    @Override
    public String toString(){
        return "thông tin sách: (" + "tên sách: " + ten_sach + "gia bán: " + giaban +
                "năm xuất bản: " + namxuatban +")";
    }

}
