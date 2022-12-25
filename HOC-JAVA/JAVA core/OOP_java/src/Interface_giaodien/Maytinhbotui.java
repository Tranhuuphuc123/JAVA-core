package Interface_giaodien;
// xây dựng lớp interface máy tính với 4 tính nang cong tru nhan chia.
// lưu ý với phepchia nếu chhia cho 0 se gặp lôi--> hhg giải quyết dùng exception (try-catch)...

public interface Maytinhbotui {
    // các phương thức trong interface đều mặc định là public và là class abstract, dẫu hông ghi abstract thì nó cũng ngầm hiểu là abstract.

    // method cộng
    public double nhap_cong();
    public double xuatcong();

 // phương thức cộng kiểu gáng giá trị trực tiếp
    public  abstract double cong(double a, double b);

    // method trừ
    public double tru(double a, double  b); // khai báo như thế này vẫn đc hiểu là abstract.
    public double nhan(double a, double c);
    public double chia(double a, double b);


}
