package baitap_tinhluongnhanvien;
// tạo lớp diachi de làm kiểu dl tự đinh nghĩa cua pp Has-A
public class Diachi {
    private String sonha;
    private String tenduong;
    private String tentp;

    // contructor

    public Diachi() {
    }

    public Diachi(String sonha, String tenduong, String tentp) {
        this.sonha = sonha;
        this.tenduong = tenduong;
        this.tentp = tentp;
    }

    // get and set

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getTenduong() {
        return tenduong;
    }

    public void setTenduong(String tenduong) {
        this.tenduong = tenduong;
    }

    public String getTentp() {
        return tentp;
    }

    public void setTentp(String tentp) {
        this.tentp = tentp;
    }
}
