package Outer_inner_nonStatic.Outer;
/*tiềm hiểu kiến thức về Outer class*/
public class Outerclass {
    public void Info(){
        sub_non a = new sub_non();
        a.thongtin();

    }

}

// đay là Outer class-nghĩa là một class trong cùng một package nhưng nằm ngoài class chinh với class Public
// lưu ý với Outer class trong cùng một package thì Access Modified(Quản lý truy cap) nó mặc định là Default
class sub_non{
     private int tuoi;
     public void thongtin(){
         System.out.println("tuổi là 18");
    }
}
