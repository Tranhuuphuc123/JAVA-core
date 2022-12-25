package Overloading_java;
/*đây là nền tảng tiềm hiểu về Overloading np chồng phương thức trong java*/
public class timhieu_Overloading {
    // ví dụ về nạp chòng phương thức Overloading

    // khởi tạo method tính tổng
    public int sum (int a, int b){
        return  (a+b);
    }

    // tạo thêm một method sum trung tền nhưng khác nhau tham số truyền vào
    public int sum (int a, int b, int c){
        return  (a+b+c);
    }


    // tạo thêm  một method có trùng tên sum nhưng khác kiểu type trả về cho tham số
    public double sum(double a, double b){
        return (a+b);
    }


    public static void main(String[] args){
        // gọi class khởi tọ vào main
        timhieu_Overloading a = new timhieu_Overloading();
       System.out.println("method dau tien: " + a.sum(5,2));
        System.out.println("method thứ 2: " + a.sum(5,2, 3));
        System.out.println("method thứ 3: " + a.sum(5.0,2.3));
    }

}
