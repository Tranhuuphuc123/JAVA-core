package tinhdahinh;
/*hình thưc có tính chất đa hình với overloding(quá tải phương thức)*/
public class dahinh_overloading {
    public int tichso(int a, int b){
        return  a*b;
    }

    // overloading là quá tải phg thức nghĩa là dùng lại method cùng tên nhưng khác đối sô, sl đối số truyền vào cũng đc xem là tính đa hình
    public double tichso(double a, double b){
        return  a*b;
    }

    public static void main(String[] args) {
        dahinh_overloading dh = new dahinh_overloading();

        // đa hình gọi method số nguyên--> kw: sẽ là tích số nguyên
        System.out.println("tich so nguyen: " + dh.tichso(5,7));
        // đa hình gọi method số thực--> kw: sẽ là tích số thực
        System.out.println("tích sô thực: " + dh.tichso(5.5,9.3));


    }
}
