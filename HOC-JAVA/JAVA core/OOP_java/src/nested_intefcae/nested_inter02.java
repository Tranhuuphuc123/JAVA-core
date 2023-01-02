package nested_intefcae;
// ta tiềm hiểu về giao diện interface nested(lồng) trong một giao diện interface khác của java
import java.util.*;

interface i_name01{
    interface i_name02{
        public void show();
    }
}

// class khác thừa kế 2 interface nested với nhau
class A implements i_name01.i_name02{
    // ghi đè lại method
    @Override
    public void show(){
        System.out.println("thành cong với  nested interface in interface");
    }
}


// tiến hành thực thi với nested interface in interface
public class nested_inter02 {
    public static void main(String[] args) {
        i_name01.i_name02 a;
        A b = new A();
        a=b;
        a.show();
    }
}
