package Outer_inner_nonStatic.Inner;
// ta tiềm hiểu về inner class không có Modifier: Static
/*inner class là lơp nô tại là lớp khai báo bên trong một class
* cùng tiềm hiểu xem  inner class với non sattic sẽ có tính nawnh gì
* */
public class Non_static_class {

    // class Inner
    class inner{
        private String name;
        public void show(){
            System.out.println("đây là class Inner không có static");
        }
    }

    // tính kế thừa của iiner class non static chỉ duy trì trong một class cha Non_static_class
    class Inner2 extends  inner{

    }

    public static void main(String[] args) {
        // trc tiên để gọi đc pt thức của Inner class với non static inner class thi ta cần tham chiếu class cha trc
        Non_static_class a = new Non_static_class();

        // sau đó mới dùng Object a vừa khởi tạo tham chiếu đến inner class
        Non_static_class.inner b = a.new inner();

        // gọi method
        b.show();

    }

}


// hoặc có thể thông qua xây ựng class tiêng ntn
class  main{
    public static void main(String[] args) {
        Non_static_class.inner a = new Non_static_class().new Inner2();
        a.show();
    }
}
