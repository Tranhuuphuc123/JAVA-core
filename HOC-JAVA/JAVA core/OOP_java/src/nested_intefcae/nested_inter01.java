package nested_intefcae;
/*thực thi đoạn code mô tả về nested interfcae trong mọt class của java*/
import java.util.*;
 class C_name{
    protected interface i_name{
        //method khai báo interface
        public void show();
    }
}

class C_name02 implements C_name.i_name{
    // ghi đè lại method bên interface
    @Override
    public void show(){
        System.out.println("text thành công nested interface");
    }
}




// tiến hành thực thi code nested interface
 public class nested_inter01 {
    public static void main(String[] args) {
        C_name.i_name a;
        C_name02 b = new C_name02();
        a = b;
        a.show();
    }
}
