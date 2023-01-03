package View;

import Controller.MaytinhbotuiController;
import Model.MaytinhbotuiModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

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


        // gọi ActionListener truy abwts sự kiện
        ActionListener al = new MaytinhbotuiController(this);

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
        filed01.addActionListener(al);

        filed02 = new JTextField(10);
        filed02.setFont(font);
        filed02.addActionListener(al);

        filed03 = new JTextField(10);
        filed03.setFont(font);
        filed01.addActionListener(al);

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
        button01.addActionListener(al);

        button02 = new JButton("-");
        button02.setFont(font);
        button02.addActionListener(al);

        button03 = new JButton("*");
        button03.setFont(font);
        button03.addActionListener(al);

        button04 = new JButton("/");
        button04.setFont(font);
        button04.addActionListener(al);

        button05 = new JButton("^");
        button05.setFont(font);
        button05.addActionListener(al);

        button06 = new JButton("%");
        button06.setFont(font);
        button06.addActionListener(al);

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


    // tái định nghĩa lại các method bên hàm Model
     public void cong(){
        // ở 2 field text nhập nội dugn ta định nghĩa lại giá trị nhận vào của 2 số first and seccond value
         /*nghĩa là giá trị first_value kiểu double chỉ là giá trị label hiển thị thui
         * thì tg ứng = với giá trị trả về ở hàm textfiled(dùng valueOf) là kiểu Double lun
         * */
         double first_value = Double.valueOf(filed01.getText());
         double seccond_value = Double.valueOf(filed02.getText());

         //thiết lặp đặt giá trị truyền vào với setFirst_value và setSeccond_value ở contructor đã khai báo
         this.maytinhbotui_model.setFirst_value(first_value);
         this.maytinhbotui_model.setSeccond_value(seccond_value);

         // tiene hành thực hện method tính toán đã khai báo ở Model
         this.maytinhbotui_model.cong();

         //hiện ra kết quả ở mục filed kết quả
         this.filed03.setText(this.maytinhbotui_model.getKetqua()+"");
     }

     public void tru(){
         double first_value = Double.valueOf(filed01.getText());
         double seccond_value = Double.valueOf(filed02.getText());

         //thiết lặp đặt giá trị truyền vào với setFirst_value và setSeccond_value ở contructor đã khai báo
         this.maytinhbotui_model.setFirst_value(first_value);
         this.maytinhbotui_model.setSeccond_value(seccond_value);

         // tiene hành thực hện method tính toán đã khai báo ở Model
         this.maytinhbotui_model.tru();

         //hiện ra kết quả ở mục filed kết quả
         this.filed03.setText(this.maytinhbotui_model.getKetqua()+"");
     }

     public void nhan(){
         double first_value = Double.valueOf(filed01.getText());
         double seccond_value = Double.valueOf(filed02.getText());

         //thiết lặp đặt giá trị truyền vào với setFirst_value và setSeccond_value ở contructor đã khai báo
         this.maytinhbotui_model.setFirst_value(first_value);
         this.maytinhbotui_model.setSeccond_value(seccond_value);

         // tiene hành thực hện method tính toán đã khai báo ở Model
         this.maytinhbotui_model.nhan();

         //hiện ra kết quả ở mục filed kết quả
         this.filed03.setText(this.maytinhbotui_model.getKetqua()+"");
     }
     public void chia(){
         double first_value = Double.valueOf(filed01.getText());
         double seccond_value = Double.valueOf(filed02.getText());

         //thiết lặp đặt giá trị truyền vào với setFirst_value và setSeccond_value ở contructor đã khai báo
         this.maytinhbotui_model.setFirst_value(first_value);
         this.maytinhbotui_model.setSeccond_value(seccond_value);

         // tiene hành thực hện method tính toán đã khai báo ở Model
         this.maytinhbotui_model.chia();

         //hiện ra kết quả ở mục filed kết quả
         this.filed03.setText(this.maytinhbotui_model.getKetqua()+"");
     }

     public void pow(){
         double first_value = Double.valueOf(filed01.getText());
         double seccond_value = Double.valueOf(filed02.getText());

         //thiết lặp đặt giá trị truyền vào với setFirst_value và setSeccond_value ở contructor đã khai báo
         this.maytinhbotui_model.setFirst_value(first_value);
         this.maytinhbotui_model.setSeccond_value(seccond_value);

         // tiene hành thực hện method tính toán đã khai báo ở Model
         this.maytinhbotui_model.pow();

         //hiện ra kết quả ở mục filed kết quả
         this.filed03.setText(this.maytinhbotui_model.getKetqua()+"");
     }

     public void mod(){
         double first_value = Double.valueOf(filed01.getText());
         double seccond_value = Double.valueOf(filed02.getText());

         //thiết lặp đặt giá trị truyền vào với setFirst_value và setSeccond_value ở contructor đã khai báo
         this.maytinhbotui_model.setFirst_value(first_value);
         this.maytinhbotui_model.setSeccond_value(seccond_value);

         // tiene hành thực hện method tính toán đã khai báo ở Model
         this.maytinhbotui_model.mod();

         //hiện ra kết quả ở mục filed kết quả
         this.filed03.setText(this.maytinhbotui_model.getKetqua()+"");
     }


}
