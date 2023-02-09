package baitap_quanlydanhsachnhanvien;
// bài tập quản lý danh sách nhân viên
// class diachi làm pt Has-A: pt dùng class diachi làm kiểu dữ liệu tự định nghĩa

public class Diachi {
    private String sonha;
    private String tenduong;
    private String tentp;
    //contructor

    public Diachi() {
    }

    public Diachi(String tenDuong, String sonha, String tentp) {
        this.tenduong = tenduong;
        this.sonha = sonha;
        this.tentp = tentp;
    }

    // get and set

    public String getTenduong() {
        return tenduong;
    }

    public void setTenDuong(String tenduong) {
        this.tenduong = tenduong;
    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    public String getTentp() {
        return tentp;
    }

    public void setTentp(String tentp) {
        this.tentp = tentp;
    }
}
