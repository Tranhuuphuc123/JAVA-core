package class_oop;
// bài tập làm quen với khởi tạo lớp class, object, contructor.. trong java OOP
/* đặt tình huống bài tập xây dựng một lớp mydate chứa các đói tượng date, month, year
* khởi tạo nó và tạo các method print day, month year đó.. sau đó gọi và thực thi trong hàm main
* */
public class hamchinh {

    // contructor khởi tạo Object với kiểu type void và pt non acess modifier static
    public  static  void main(String[] args){
        // gọi lớp hamphu ra và đặt tên cho nó dderr lk với class hamphu vừa khởi tạo
        hamphu hp = new hamphu(22,9,1995);

        //thực thi mehtod để in day, month , year bằng cách dùng tên class.method print
        hp.printday();
        hp.printmonth();
        hp.printyear();
        hp.fullprint();
    }
}
