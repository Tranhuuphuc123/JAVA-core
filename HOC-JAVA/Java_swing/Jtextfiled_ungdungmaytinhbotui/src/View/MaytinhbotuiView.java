package View;

import Model.MaytinhbotuiModel;

import javax.swing.*;
import java.awt.*;

// mô hình MVC- View tạo khung hiển thị
public class MaytinhbotuiView extends JFrame {
    private MaytinhbotuiModel maytinhbotui_model;

    private JLabel label_display01;
    private JLabel label_display02;
    private JLabel label_display03;

    private JTextField filed01;
    private JTextField filed02;
    private JTextField filed03;

    private JButton button01;
    private JButton button02;
    private JButton button03;
    private JButton button04;
    private JButton button05;
    private JButton button06;

    // xây dựng contructor lvowivowis model
    public MaytinhbotuiView(){
        this.maytinhbotui_model = new MaytinhbotuiModel();
        this.giaodienchinh();
    }

    // tiến hành xấy dựng method tạo giao diện chính
    public void giaodienchinh(){
        this.setTitle("phần mềm máy tính bỏ túi");
        this.setSize(500,400);
        // tắt hăn ctrinh
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hiển thị nội dung ở giữa desktop
        this.setLocationRelativeTo(null);


        // thiết font
        Font font = new Font("Arial", Font.BOLD, 40);

        // thiết lập panel
        JPanel panel_label_filed = new JPanel();
        JPanel panel_button = new JPanel();

        // thiết lập label và textfiled
        //label trước
        label_display01 = new JLabel("firtNum", JLabel.CENTER);
        label_display01.setFont(font);
        label_display02 = new JLabel("seccondNum", JLabel.CENTER);
        label_display02.setFont(font);
        label_display03 = new JLabel("Ketqua", JLabel.CENTER);
        label_display03.setFont(font);

        //textfiled
        filed01 = new JTextField(10);
        filed01.setFont(font);
        filed02 = new JTextField(10);
        filed02.setFont(font);
        filed03 = new JTextField(10);
        filed03.setFont(font);

        // add bố cục layout filed àn label vào JPanel
        // hgap và vgap khoảng cách theo chiều dọc và ngang đã xác định.
        panel_label_filed.setLayout(new GridLayout(3,2,10,10));
        panel_label_filed.add(label_display01);
        panel_label_filed.add(filed01);
        panel_label_filed.add(label_display02);
        panel_label_filed.add(filed02);
        panel_label_filed.add(label_display03);
        panel_label_filed.add(filed03);


        // đặt tên hiển thị button and add bố cục cho button vao Jpanel
        // đặt tên hiển thị button
        button01 = new JButton("+");
        button01.setFont(font);
        button02 = new JButton("-");
        button02.setFont(font);
        button03 = new JButton("*");
        button03.setFont(font);
        button04 = new JButton("/");
        button04.setFont(font);
        button05 = new JButton("^");
        button05.setFont(font);
        button06 = new JButton("Mod");
        button06.setFont(font);
        //add bố cục vào Jpanel
        panel_button.setLayout(new GridLayout(2,3));
        panel_button.add(button01);
        panel_button.add(button02);
        panel_button.add(button03);
        panel_button.add(button04);
        panel_button.add(button05);
        panel_button.add(button06);


        // thiết lập ố cục của JFrame
        this.setLayout(new BorderLayout(10,10));
        this.add(panel_label_filed, BorderLayout.CENTER);
        this.add(panel_button, BorderLayout.SOUTH);

        // hiển thị không ẩn JFrame
        this.setVisible(true);

    }
}
