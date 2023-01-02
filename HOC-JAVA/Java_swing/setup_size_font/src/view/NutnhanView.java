package view;
/*mô hình MVC- Vew xây dựng giao diện JFrame*/

import Model.NutnhanModel;
import controller.NutnhanControler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NutnhanView extends JFrame {
    private NutnhanModel nutnhan_model;
    private JButton jbutton01;
    private JButton jbutton02;
    private JButton jbutton03;
    private JButton jbutton04;
    private JLabel jlabel_display;

    // khởi tạo contructur
    public NutnhanView(){
        this.nutnhan_model = new NutnhanModel();
        this.giaodien();
    }

    // khởi tạo giaodien cho java với JFrame của java swing
    public void giaodien(){
        this.setTitle("phần mềm giao diện nút nhấn");
        this.setSize(350,300);
        // tắt hăn ứng dụng khi tắt run
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //hiển thị JFrame ở giữa màn hình desktop
        this.setLocationRelativeTo(null);


        // xây dựng font chữ thay đổi kích thước font chữ
        Font font = new Font("Arial", Font.BOLD, 60);
        // gọi truy bắt sự kiên ActionListener bên Controller
        ActionListener al = new NutnhanControler(this);// this đây chính là hàm controller vừa khởi tạo





        // xây dựng 4 nút button vào JFrame và sắp xếp layout hiên thị
        JPanel jpanel_button = new JPanel();
        jpanel_button.setLayout(new GridLayout(2,2));

        //đặt tên hiển thị cho button
        jbutton01 = new JButton("1");
        // tiến hành gán font chữ vừa khơỉ tạo cho Object button
        jbutton01.setFont(font);
        // tiến hành add Actionlistener bắt sự kiện vào Object Button
        jbutton01.addActionListener(al);

        jbutton02 = new JButton("2");
        // tiến hành gán font chữ vừa khơỉ tạo cho Object button
        jbutton02.setFont(font);
        // tiến hành add Actionlistener bắt sự kiện vào Object Button
        jbutton02.addActionListener(al);

        jbutton03 = new JButton("3");
        // tiến hành gán font chữ vừa khơỉ tạo cho Object button
        jbutton03.setFont(font);
        // tiến hành add Actionlistener bắt sự kiện vào Object Button
        jbutton03.addActionListener(al);

        jbutton04 = new JButton("4");
        // tiến hành gán font chữ vừa khơỉ tạo cho Object button
        jbutton04.setFont(font);
        // tiến hành add Actionlistener bắt sự kiện vào Object Button
        jbutton04.addActionListener(al);


        // add vào jpanel để hiển thị
        jpanel_button.add(jbutton01);
        jpanel_button.add(jbutton02);
        jpanel_button.add(jbutton03);
        jpanel_button.add(jbutton04);

        // hiển thị Jlabel ra màn hình ứng dụng
        JPanel jpanel_label = new JPanel();
        jpanel_label.setLayout(new BorderLayout());
        // đặt tên hiển thị cho jlabel
        jlabel_display = new JLabel("  ");
        // tiến hành gán font chữ vừa khơỉ tạo cho Object hiển thị Label
        jlabel_display.setFont(font);

        jpanel_label.add(jlabel_display, BorderLayout.CENTER);


        // hiên thị phân định của thẻ JFRame với các button và layout
        this.setLayout(new BorderLayout());
        this.add(jpanel_button, BorderLayout.CENTER);
        this.add(jpanel_label, BorderLayout.SOUTH);

        // hiển thị không ẩn với JFrame
        this.setVisible(true);
    }


    /* tiến hành xây dựng method trong view để hiển thị sự thay đội khi controller
    * truy bắt sự kiện khi nhấn vào:
    *    vd: khi nhấn phím 01 thì label hiển thị text sẽ hiện ra 1 , khi nhấn 2 thì thay đổi
    * sang 2
    * */

    public void change_value01(){
        // lớp JFrame tiến hành.liên kết với Model(view lk model).liên kết vơ method bên model
        this.nutnhan_model.set_value01();

        /*tiến hành  nhận và thay đổi giá trị khi nhấn ở view hiển thị của label
        * tức là khi controler nhấn button 1 thì view sẽ hiện ra 1 ở Jlabel và change khi ấn
        * phím khác*/
        jlabel_display.setText("kết quả: " + this.nutnhan_model.getValue());// getvalue là nhận giá trị thay ổi
    }
    public void change_value02(){
        this.nutnhan_model.set_value02();
        jlabel_display.setText("kết quả: " + this.nutnhan_model.getValue());// getvalue là nhận giá trị thay ổi
    }
    public void change_value03(){
        this.nutnhan_model.set_value03();
        jlabel_display.setText("kết quả: " + this.nutnhan_model.getValue());// getvalue là nhận giá trị thay ổi
    }
    public void change_value04(){
        this.nutnhan_model.set_value04();
        jlabel_display.setText("kết quả: " + this.nutnhan_model.getValue());// getvalue là nhận giá trị thay ổi
    }
}
