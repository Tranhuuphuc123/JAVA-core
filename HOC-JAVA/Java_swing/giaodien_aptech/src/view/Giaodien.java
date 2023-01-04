package view;

import Model.chucnang;
import controller.batsukien;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Giaodien  extends  JFrame{

    private chucnang cn_model;
    private JPanel panel;
    private JLabel label_name;
    private JTextArea textarea;
    private JLabel label_name1;
    private JTextField textfiled;
    private JButton button1;
    private JLabel label_text;

    //// contructor
    public Giaodien(){
        this.cn_model = new chucnang();
        this.init();
    }


    //method giao diện
    public void init(){
        this.setTitle("ứng dụng tiềm kiếm");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();

        // bắt sự kiện
        ActionListener al = new batsukien(this);
        button1.addActionListener(al);
    }

    public void timkiem(){
        this.cn_model.setVanban(textarea.getText());
        this.cn_model.setTukhoa(textfiled.getText());
        this.cn_model.timkiem();
        // lúc này không nhận giá trị nhập vào(hay gtri đầu vào) nên ta dùng setText để ghi nhận kết quả
        // setText trả về chuỗi kw
        this.label_text.setText(this.cn_model.getKetqua());
    }


}
