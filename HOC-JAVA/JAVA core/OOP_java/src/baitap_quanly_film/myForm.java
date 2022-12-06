package baitap_quanly_film;

/* thông tin về tên hãng sản xuất, qốc gia, ngày tháng năm  tức lịch chiếu phim*/
import java.util.Scanner;

public class myForm {
    private String tenhangsanxuat;
    private String quocgia;
    private int day;
    private int month;
    private int year;

      // contructor


    public  myForm(){
   // ruột rổng để tiến hành nhập tự do bên hàm main
    }
    public myForm(String tenhangsanxuat, String quocgia, int day, int month, int year) {
        this.tenhangsanxuat = tenhangsanxuat;
        this.quocgia = quocgia;
        this.day = day;
        this.month = month;
        this.year = year;
    }


    //getter and setter
    public String getTenhangsanxuat() {
        return this.tenhangsanxuat;
    }

    public void setTenhangsanxuat(String tenhangsanxuat) {
        this.tenhangsanxuat = tenhangsanxuat;
    }

    public String getQuocgia() {
        return this.quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // xây dựng method nhập thông tin
    public void nhap_form(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhạp tên hãng sản xuất: ");
        tenhangsanxuat = sc.nextLine();
        System.out.println("nhập tên quốc gia sx: ");
        quocgia = sc.nextLine();

        System.out.println("nhập ngày:");
        day = sc.nextInt();
        System.out.println("nhập tháng: ");
        month = sc.nextInt();
        System.out.println("nhập năm: ");
        year = sc.nextInt();
    }

    // method xuất_form
    public void xuat_form(){
        System.out.println("tên hãng sx: " + tenhangsanxuat);
        System.out.println("quốc gia sx: " + quocgia);
        System.out.println("ngày chiếu: ( ngày: " + day + " /tháng: " +month + " /năm: " + year);
    }

    //toString
    @Override
    public String toString(){
        return  "Thông tin: (" + "tên hãng sx: " + tenhangsanxuat + "quocgia sx: " +quocgia +
                "ngày chiếu :( ngày: " + day + "tháng: " + month + "năm: " + year +")";
    }
}

