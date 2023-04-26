package Outer_inner_nonStatic.Inner;
// tiềm hiểu về static Inner class trong java
public class Static_Inner_class {

    // xây dựng class iiner với từ khóa static
    public static class Person{
        private String name;
        public void show(){
            System.out.println("hello tôi la Person của class Inner có từ khóa Static");
        }
    }

    // tính kế thừa trong cùng một class, có thể kế thừa ngoài package hay class khác cũng đc
    public class Person2 extends  Person{

    }

    // thực thi
    public static void main(String[] args) {
        // gọi và khởi tạo Object tham chiếu
        // việc gọi khơi tạo class Inner dễ dàng hơn không ần pahir khởi tạo class cha trc như Non static class
        Static_Inner_class.Person a = new Static_Inner_class.Person();
    }
}


// cóa thể gọi theo cách này
class Main{
    public static void main(String[] args) {
        Static_Inner_class.Person a = new Static_Inner_class.Person();
    }
}