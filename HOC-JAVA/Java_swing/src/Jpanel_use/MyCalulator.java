package Jpanel_use;

import java.awt.*;
import javax.swing.*;
import java.nio.ByteOrder;

// sử dụng jpanel tạo máy tính cá nhân
public class MyCalulator extends JFrame {
   // khởi tạo contructor
    public MyCalulator(){
        this.setTitle("Mycalculator");
   /*hiển thị chung */
        // thiết lập hiển thị ở giữa màn hình
       this.setLocationRelativeTo(null);

        //thiết lập kic thước JFrame
        this.setSize(300,300);


        // thiết lập tắt hẳn JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



     /*phần chức năng*/
        // khởi tạo Jpanel
        JPanel jpanel_textfiled = new JPanel();
        JPanel jpanel_button = new JPanel();

        // tạo text area nhập nội dung
        jpanel_textfiled.setLayout(new BorderLayout());
        jpanel_textfiled.add(new JTextField(50), BorderLayout.CENTER);

        // khởi taọ các nút nhấn và phép toán
        jpanel_button.setLayout(new GridLayout(5,3));
        jpanel_button.add(new JButton("0"));
        jpanel_button.add(new JButton("1"));
        jpanel_button.add(new JButton("2"));
        jpanel_button.add(new JButton("3"));
        jpanel_button.add(new JButton("4"));
        jpanel_button.add(new JButton("5"));
        jpanel_button.add(new JButton("6"));
        jpanel_button.add(new JButton("7"));
        jpanel_button.add(new JButton("8"));
        jpanel_button.add(new JButton("9"));
        jpanel_button.add(new JButton("+"));
        jpanel_button.add(new JButton("-"));
        jpanel_button.add(new JButton("x"));
        jpanel_button.add(new JButton("%"));
        jpanel_button.add(new JButton("="));


        // thiết lập vị trí chung cho Jframe
        this.setLayout(new BorderLayout());
        this.add(jpanel_textfiled, BorderLayout.NORTH);
        this.add(jpanel_button, BorderLayout.CENTER);


        //thiết lập hiển thị
        this.setVisible(true);



    }
}
