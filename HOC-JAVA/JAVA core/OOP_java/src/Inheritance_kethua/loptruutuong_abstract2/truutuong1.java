package Inheritance_kethua.loptruutuong_abstract2;
// tiềm hiểu về trừu tượng thông qua bài tập ví dụ 01
// tao lớp trừu tượng xử ls trong một file thui nhá
abstract class shape {
    private String mausac;
    // contructor

    public shape(String mausac) {
        this.mausac = mausac;
    }
    // get and set

    public String getMausac() {
        return mausac;
    }

    // xây dung method astarct
    public abstract double tinhdientich();

    public abstract String toString(); // xây dựng thêm method toStirng để xuất chuỗi như ý muốn

}

class circle extends shape {
    private double r;

    //

    public circle(String mausac, double r) {
        super(mausac);
        this.r = r;
    }

    //thực thi Override chi tiết với abstract ở lớp cha

    @Override
    public double tinhdientich() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public String toString() {
        return "màu sắc của hình: " + super.getMausac() + "diện tích circle : " + this.tinhdientich();
    }

}

class rectangle extends shape {
    private double length;
    private double width;

    /// contructor

    public rectangle(String mausac, double length, double width) {
        super(mausac);
        this.length = length;
        this.width = width;
    }

    //định nghĩa override chi tiết lớp abstract ở lóp cha
    @Override
    public double tinhdientich() {
        return this.length * this.width;
    }

    // định nghĩa cchi tiết chuỗi xuất với abstract
    @Override
    public String toString() {
        return " màu sắc của hình Rectangle: " + super.getMausac() + " diện tích rectangle: " + this.tinhdientich();
    }
}

public class truutuong1 {
    public static void main(String[] args){
        shape  h1 = new circle("red", 5);
        h1.tinhdientich();
        System.out.println("kw: " + h1.toString());

        shape h2 = new rectangle("yellow", 2,6);
        h2.tinhdientich();
        System.out.println("kw: " + h2.toString());
    }
}
