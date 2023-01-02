package view;

import Controller.Counter_listener;
import Model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// mô hình mvc-> view chức năng hiển thị giao diện người dùng với Jframe
public class CounterView extends JFrame {
    private CounterModel countermodel;
    private JButton jbutton_up;
    private JButton jbutton_down;
    private JLabel display_label;

    //contructur
    public CounterView(){
        // lk giá trị khi hiên thị button up down bên view sang class Model CounterModel
        this.countermodel = new CounterModel();
        this.giaodienchinh();
        // không ẩn jFrame
        this.setVisible(true);
    }

    // xây  dựng method giaodienchinh() để hiển thị view
    public void giaodienchinh(){
        this.setTitle("phần mềm tắng giảm số");
        this.setSize(300,300);
        // giúp hiển thị nằm giữa khi chạy chtrinh
        this.setLocationRelativeTo(null);
        // tắt hẳn ứng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /* tạo bắt sự kiện với Listener bên controller, nghĩa l controller có method @Overrdie
        * public void actionPerformed(ActionEvent e đk lk để bắt sự kiện bên view
        * */
        // gọi class listener lk với class controller đã xây dựng để lk sự kiện
        ActionListener al = new Counter_listener(this);


        jbutton_up = new JButton("Up");
        jbutton_up.addActionListener(al);
        jbutton_down= new JButton(("Down"));
        jbutton_down.addActionListener(al);
        display_label = new JLabel(this.countermodel.getValue()+"", JLabel.CENTER);

         // đặt vị trí layout của button va label:
        JPanel jpanel = new JPanel();


        //đặt vị trí
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jbutton_up, BorderLayout.WEST);
        jpanel.add(jbutton_down, BorderLayout.EAST);
        jpanel.add(display_label, BorderLayout.CENTER);

        // vị trí của JFrame phân định
        this.setLayout(new BorderLayout());
        this.add(jpanel, BorderLayout.CENTER);

      // xây dựng lại 2 method bodemtang() và bodemgiam()

    }
    public void bodemtang(){
        this.countermodel.bodemtang();
        this.display_label.setText(this.countermodel.getValue()+"");
    }

    public void bodemgiam(){
        this.countermodel.bodemxuong();
        this.display_label.setText(this.countermodel.getValue()+"");
    }
}
