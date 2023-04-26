package market_interface_giaodiendanhdau;
// tiềm hểu về giao diện đánh dấu mareket interface trong java

// gói thư viện ỗ trợ market interface
import java.lang.Cloneable;


 class A implements  Cloneable{
     int i ;
     String s;

     // contructor

     public A(int i, String s) {
         this.i = i;
         this.s = s;
     }

     // ghi đè metthod của clone(), đơn giản bằng cách gọi class Object va method clone
     @Override
    protected Object clone()
         throws CloneNotSupportedException{
         return super.clone();
     }


     // hàm thực thi
 }
public class market_inter01 {
    public static void main(String[] args)
    throws CloneNotSupportedException{
        A a = new A(20,"market interface 01");

        //nhân bản 'a' và giữ
        // tham chiếu đối tượng nhân bản mới trong b
        //down-casting như clone() kiểu trả về là Object

        A b = (A)a.clone();

        System.out.println(b.i);
        System.out.println(b.s);
    }

}
