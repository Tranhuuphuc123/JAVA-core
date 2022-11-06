package class_oop;
/* hàm phụ tạo class myDate của riêng mình với các data member contructor và method print day,
* , month, year*/

public class hamphu {
    // khởi tạo các data member trong class hamphu
    private int day;
    private int month;
    private int year;


    // khởi tạo các data member vừa khai báo trên hay còn gọi là khởi tạo đối tượng contructor
     public hamphu(int day, int month, int year){
         // this. tên data member(object) =  giá trị contructor
         this.day = day;
         this.month = month;
         this.year = year;

     }

     // xây dựng method để thực hiện chức năng là print day, month, year

    public void printday(){
        System.out.println("day: " + this.day);
    }

    public void printmonth(){
        System.out.println("day: " + this.month);
    }

    public void printyear(){
        System.out.println("day: " + this.year);
    }

    public  void fullprint(){
         System.out.print(this.day + " / " + this.month + " / " + this.year);
    }

}
