package Get_Set;
/*thực thi code getter and setter từ lớp phuongthuc_get_set*/
public class text {
    public static  void main(String[] args){
        // gọi lớp có setter và getter vừa khởi tạo
        phuognthuc_get_set  gs = new phuognthuc_get_set(31,1,1995);


        // in thử với pt setter, tức in bằng cách truyền tham số value từ setter


        // in lần ầu xem setDay xem nó lấy dl tử contructor ntn
        System.out.println("setDay lần 1: " + gs.getDay());

        // thử gáng giá trị khác vượt mức đk if xem in ra bao nhiêu
        // lưu ý seter là pt dùng để đặt cp nhật value cho biến
        gs.setDay(35);
        // khi in ra thì phải dùng getter vì nó trả về giá trị kiểu dữ liệu mong muốn
        System.out.println(" setDay: " + gs.getDay());

        // gáng giá trị khác hợp lệ xem setDay in ra cái gì
        gs.setDay(25);
        System.out.println(" setDay: " + gs.getDay());


        /*kww: 31: vì setter lúc này lấy value từ contructor nhập vào
        *      31: vì lúc này setter đặt giá trị 35 sai đk if, nó trả về giá trị contructor là 31
        *      25: vì setter của setDay đặt giá trị 25 thảo đk if nên nó thay thế
        * */

        //==> tg tự các month year, có thể ktra tg tự như day ở trên
        /*==> rõ ràng ta thấy pt setter và getter này tiện dụng khi
        * ta nhập giá trị tt cho biến kèm đk phát sinh*/

    }

}
