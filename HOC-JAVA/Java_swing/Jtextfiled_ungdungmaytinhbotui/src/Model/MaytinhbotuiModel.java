package Model;
// mô hình mVC- Model xây dựng thuật toán cơ sở dữ liệu bàn đầu

public class MaytinhbotuiModel {
    private double first_value;
    private double seccond_value;
    private double ketqua;

    // contructor, do tiến hannh nhập từ bàn phím nên nó khai báo method khôn cn tham số
    public MaytinhbotuiModel() {
    }

    // get and set

    public double getFirst_value() {
        return first_value;
    }

    public void setFirst_value(double first_value) {
        this.first_value = first_value;
    }

    public double getSeccond_value() {
        return seccond_value;
    }

    public void setSeccond_value(double seccond_value) {
        this.seccond_value = seccond_value;
    }

    public double getKetqua() {
        return ketqua;
    }

    public void setKetqua(double ketqua) {
        this.ketqua = ketqua;
    }


    // xây dựng method + - * /...
    public void cong(){
        this.ketqua = this.first_value + this.seccond_value;
    }

    public void tru(){
        this.ketqua = this.first_value - this.seccond_value;
    }
    public void nhan(){
        this.ketqua = this.first_value * this.seccond_value;
    }
    public void chia(){
        this.ketqua = this.first_value / this.seccond_value;
    }

    // method mũ
    public void pow(){
        this.ketqua = Math.pow(this.first_value, this.seccond_value);
    }
    // method chia lấy dư mod
    public void mod(){
        this.ketqua= this.first_value%this.seccond_value;
    }
}
