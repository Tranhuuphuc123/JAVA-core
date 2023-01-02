package Jframe;

import javax.swing.*;

public class jframe01 {
    public static void main(String[] args) {
        // khởi tạo jframe
        JFrame jf = new JFrame();
        //setVisible ẩn hiện jframe
        jf.setVisible(true);
        // thiết lập kích cỡ cho jframe
        jf.setSize(600,400);
        // truyền nội dung tiêu đè
        jf.setTitle("nội dung jframe");

        // khi code chạy jframe và tắt thì chtrinh vẫn chạy ngầm
        // khắc phúc bằng cách quy định kiểu đk khi đóng
        // exit_on_close: đóng ctrinh tắt hẳn
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //gắn vị trí hiển thị
        jf.setLocation(300,300);
    }
}
