package list_keyword;
/*đoạn code ví dụ về tính kes thùa super với hàm khởi tạo contructor khi xây dựng class với hàm khởi tạo contructor*/


// xây dựng class lopcha với hàm khởi tạo contructor kèm theo
class lop_cha{
   private String value1;

    public lop_cha(String value1) {
        this.value1 = value1;
    }

    // xây dựng mthod hiển thị lớp cha
    public void display(){
        System.out.println("hàm cha: "+ value1);
    }
}





// xây dựng lớp con kế thừa lớp cha và giá trị contructor từ lớp cha
class lop_con extends lop_cha{
    private String value2;

    // khởi tạo contrcutor lớp con với super
    public lop_con(String value1,String value2) {
        super(value1);
        this.value2 = value2;
    }

    //method hiển thị
    public void display(){
        //xuất kết quả ở lớp cha
        super.display();
        System.out.println("hàm con: " + value2);
    }

}




// hàm text với super trong contructor
public class Super_Contructor {
    public static void main(String[] args){
        lop_con a = new lop_con("giá trị cha", "giá trị con");
        a.display();
        /*--> kww: nó sẽ hiển thị cả  kw ngay trong lop_con, vì lopcon đ thừ kế từ lop_cha
        *đây là cách dùng super() với contructor
        *  */
    }
}
