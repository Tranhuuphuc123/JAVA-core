package View;

import Controller.UserService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class giaodienhienthi extends JFrame {
    UserService userService;
    private JButton button_themmoi;
    private JPanel panel_main;

    public giaodienhienthi(){
        this.userService = new UserService();
        this.init();
        this.setSize(400,200);


        // xử lý sự kiến khi nhấn nút sẽ thêm mới giao diện con và ẩn đi giao diện chính hiện tại
        button_themmoi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // gọi hàm sub khi nhấn button_themmoi
                new subgiaodien().setVisible(true);
                // gọi hà dispose để ẩn giao diện hiện tại đi
                dispose();
            }
        });

    }




    public void init() {
        this.setTitle("phần mềm quản lý sach");
        // tắt hẳn khi đóng ưnng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //chạyứng dụng không ẩn
        this.setVisible(true);

        // chạy giữa màn hình
        this.setLocationRelativeTo(null);

        // thiết lập chạy JFRAME trên GUI form của java Swing
        this.setContentPane(panel_main);
        this.pack();
    }
}
