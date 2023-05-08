package to_String;
/*thực thi class toString()*/
public class text {
    public static void main(String[] args){
        // gọi lớp vừa khởi tạo to_String()
        to_String tt = new to_String(22,9,1995);

        // thực thi pt
        System.out.print("myDay: " + tt.getDay() + "\n");

        // thay đổi ngày với cah đặt value từ setter
        tt.setDay(31);
        System.out.print("myDay sau (sau thay đổi với setter): " + tt.getDay() + "\n");


        /* thay vì dùng setter để đặt gi trị mới ghi đề ta có thể thiết lập toString()
        * để ta in tt value day, month, year thừ tên class tt mà không cần xd method riêng
        * */

        // in với pt to String không cần dùng setter and method riêng bên class to_String()


        System.out.println("in với toString: " + tt);


        //===>
        /*
        * pt thức toString() xét trong bài tập ví dụ về myDate ở bên mục Java core/oop, thì toString() giúp ta có thể xuất chuỗi value
    khi gán vào tên class khi đc gọi bên hàm main mà không cần xậy dựng pt method riêng hay là gọi setter và truyền tham số cho nó mà vẫn
    đầy đủ thồn tin day, month, year như khởi tạo ở contructor
        * */

    }
}
