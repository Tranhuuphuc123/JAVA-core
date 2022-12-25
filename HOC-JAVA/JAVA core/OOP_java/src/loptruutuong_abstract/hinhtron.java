package loptruutuong_abstract;
// thự hiện thự thi lớp abstarct với hình tròn

public class hinhtron extends hinh{
    private double r;

    // contructor

    public hinhtron(toado toa_do, double r) {
        super(toa_do);
        this.r = r;
    }
    //get and det


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double tinhdientich() {
        return Math.PI*Math.pow(this.r,2);
    }
}
