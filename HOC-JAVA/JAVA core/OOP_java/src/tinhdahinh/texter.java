package tinhdahinh;

import baitap_quanlydanhsachnhanvien.Person;

/*tiềm hiểu tính đa hình (theo method Override)qua bài tập này
* thứ tự lớp cha: Person
* lớp con: Employee
* texter kiểm định
* */
public class texter {
    public static void main(String[] args) {
     // tiến hành gọi lớp con là Employee ra
        Employee nv = new Employee();

        nv.setTen("phúc");
        nv.setLuong(15000);
      // thể hiện rõ nhất của tính đa hình là ta có thể dúng lớp cha chỏ đến và gọi lơp con
        person p = new Employee();

     // tiên hành thực thi thiết lập set nội dung truyền vào từ tính đa hình: dùng lớp cha p gọi đến lớp con và method tg ứng
        p.setTen("phúc");
        //p.setluong();--> gặp lỗi do dù lớp Person lớp cha trỏ đến lớp con Employee nhưng lớp con không có Object luong

     // giờ xét đến đa hình trong method của Override
       nv.thongtin();
       p.thongtin();
       //--> kww:đều sẽ in ra nd của method thongtin ở class con: System.out.println("đây là lớp con Employee");


    }
}
