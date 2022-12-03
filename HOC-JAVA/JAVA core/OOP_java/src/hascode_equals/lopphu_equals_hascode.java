package hascode_equals;
/*xấy dựng class riêng triển khai phương thưức equals and hascode thông qua
* bài tập về mydate( date, month, year)*/
import java.io.*;
import java.lang.annotation.Documented;
import java.util.Objects;

public class lopphu_equals_hascode {
    private int day;
    private int month;
    private int year;

    //khởi tạo contructor

    public lopphu_equals_hascode(int day, int month, int year) {
        if(day>=1 && day<=31){
            this.day = day;
        }else{
            this.day = 1;
        }

        if(month>=1 && month<=12){
            this.month = month;
        }else{
            this.month = 1;
        }

        if(year>=1){
            this.year = year;
        }else{
            this.year =1;
        }

    }


    // xấy dựng getter and setter kèm đk tg đương ở contructor


    public int getDay() {
        return this.day;
    }

    public void setDay(int d) {
        if(d>=1 && d<=31){
            this.day = d;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int m) {
        if(m>=1 && m<=12){
            this.month = m;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if(y>=1){
            this.year = y;
        }
    }


    //--------------------------------------------------------------------------
    // xây dựng method só sánh các object trong java với method equals

    @Override
    /* khởi tạo pt method equals:
         + trong đó:
            ++ Object là tên đại diện chung cho pt equals
            ++ p là tên gọi mình đặt cho Object đại diện pt equals
    * */
    public boolean equals(Object p) {
        //xây dựng  các khái niệm cơ bản của equals đầu tiên trước nha

        /* this là đại diện lớp hiện hữu, cụ thể chính là nói đến các Object của class
        * mình đang xây dựng  đây là class lopphu_equals_hascode
        * */
        if(this == p)
            return true;


        /*đoan code dưới có 2 vế
        * vế 1: nếu p đại diện Object của pt equals nó rổng (null) thì xem là false
        * vế 2: this đại diện các Object của lớp hiện hữu (là lớp lopphu_equasl_hascode
        * đag xây dựng ấy .getclass là phương thúc trả về class đang sử dụng, ý là this.getclass
        * và p.getclass để ktra xem class hiện hữu và p là Object của lớp đại diện
        * equals nó có cùng một lớp hay không nếu khác thì false)
        * */
        if(p == null || this.getClass() != p.getClass())
            return false;

        /*có thể dùng cách trên với cách viết khác là dùng hàm instanceof
        * -instanceof: Toán tử instanceof trong java được sử dụng để kiểm tra
        * một đối tượng có phải là thể hiển của cùng một kiểu dữ liệu, lớp, inerface cụ thể không.
        * cách viết như sau: cơ bản thì dùng instanceof nó giống với cách viết this.getclass
        * !p.getclass
        * */

//        if(p==null || !(p instanceof  lopphu_equals_hascode))
//            return false




        /* tiến hành ép kiểu: ép p tức các Object của equals về chung kiểu của các Oject
         của class hiện hữu lopphu_equals_hascode đag xây dựng:
          -note: phuc là tên dại diện ép kiểu
          */
        lopphu_equals_hascode phuc =(lopphu_equals_hascode) p;


        // tiến hành chi đi chi tiết các xây dựng trong equals
        /*bước này mình tiến hành liệt kê các trg hợp chi tiết của các Object cụ thể
         giữa 2 lớp khi đã ép kiểu chúng thành một thể thống nhất và lk các th cụ thể đó
         giữa các đối tưởng 2 bên nhằm so sánh chuẩn xác nhất có thể
        * */
        if(this.day != phuc.day)
            return false;
        //--> nếu day của lớp hiện hữ # ngày của  day của pt Object chung khi ép kiểu thì false

        if(this.month != phuc.month)
            return true;
        if(this.year !=phuc.year)
            return false;


        // ngoài những th trên thì sẽ true
         return true;
    }
//------------------------------------------------------------------------------


    // toString in ra chuỗi thông tin cho contructor
    @Override
    public String toString(){
        return "kết quả: " + "day: " + day + " Month: " + month + " year: " + year;
    }



}
