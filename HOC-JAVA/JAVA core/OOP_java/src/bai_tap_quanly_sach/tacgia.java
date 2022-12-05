package bai_tap_quanly_sach;
/*lớp này gồm tên tác giả và năm sinh ....*/
import java.util.Scanner;
public class tacgia {
    private String name;
    private int ngay;
    private int thang;
    private  int nam;

    public tacgia(String name, int ngay, int thang, int nam) {
        this.name = name;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public tacgia(){
        // contructor rỗng để nhập đc dữ liệu input từ hàm main
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNgay() {
        return this.ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return this.thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return this.nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    // xây dựng method nhập tên ngày tháng năm sinh
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên tác giả: ");
        name = sc.nextLine();
        System.out.println("ngày: " );
        ngay = sc.nextInt();
        System.out.println("tháng: " );
        thang=sc.nextInt();
        System.out.println("năm: " );
        nam=sc.nextInt();

    }


    //xuất
    public void xuat(){
        System.out.println("tên tác giả là: " + name);
        System.out.println("năm sinh: ngày: " + ngay + "tháng: " + thang + "nam: " + nam);
    }

    //Override TóString
    @Override
    public String toString(){
        return "thông tin sách(: " + "tên tác giả: " + name + "năm sinh: ngày: " + ngay + "tháng: "+ thang +
                "năm: " + nam + ")";
    }



}

