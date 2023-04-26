package Outer_inner_nonStatic.Outer;
/*trong class kethua này ý nghãi là để biểu thị tính kế thừa trong Outer class
* lưu ý là Outer class chỉ đc kế thừa giữa các class trong một package thui do giới hạn của phạm vi truy cập Default
* */
public class Outerclass_kethua  extends sub_non{
    public static void main(String[] args) {
        sub_non a = new sub_non();
        a.thongtin();

    }
}







