package Overriding_java.tinhdahinh_02;
/* một bài tập ứng dụng về sự hữu ích của tính đa hình, ở đây ta dùng kdl cha đại diện cho các kdl con
* nói rõ hơn là ứng dụng tính chất đa hình để xây dụng một hàm dùng chung cho tất cả các class con từ class cha person
* */

/*thứ tự:
* class cha : person
* class con: Hocsinh và Giaovien
* kiểm thử: Texter
* */

import java.util.Scanner;

public class texter {

    // hàm chính main xử lý tác vụ
    public static void main(String[] args) {
           Hocsinh hs = new Hocsinh();
           Giaovien gv = new Giaovien();

           nhapthongtin(hs);
           xuatthongtin(hs);

           nhapthongtin(gv);
           xuatthongtin(gv);
    }


    // xây dunbgj hàm nhapthongtin (đưa dl vào) xd hàm dùng chung cho tất cả class con từ class cha Person
    public static void nhapthongtin(Person p){
        System.out.println("nhập tên: ");
        p.setName(new Scanner(System.in).nextLine());

        System.out.println("nhập tuổi: ");
        p.setAge(new Scanner(System.in).nextInt());

        // ktra xem p có đại diện cho hocsinh va giaodien không nếu có tiến hành ép kiểu về class hocsinh va giaovien mới tiến hành nhập tt đc
        if(p instanceof Hocsinh){
            // tiến hành ép kiểu cho về đồng dạng một class
            Hocsinh hs = (Hocsinh) p;
            System.out.println("nhập lớp: ");
            hs.setClazz(new Scanner(System.in).nextLine());
        }

        if(p instanceof Giaovien){
            // tiến hành ép kiểu cho về đồng dạng một class
            Giaovien gv = (Giaovien) p;
            System.out.println("nhập Bộ môn của giáo viên: ");
            gv.setBomon(new Scanner(System.in).nextLine());
        }
    }




    // xây dunbgj hàm xuatthongtin (đưa dl vào) xd hàm dùng chung cho tất cả class con từ class cha Person
    public static void xuatthongtin(Person p){
        System.out.println(p.getName());
        System.out.println(p.getAge());

        // tiến hành ktra xem p Person có đại diện cho class hocsinh và giaovien
        if(p instanceof Hocsinh){
            System.out.println(((Hocsinh) p).getClazz());
        }
        if(p instanceof  Giaovien){
            System.out.println(((Giaovien) p).getBomon());
        }
    }
}
