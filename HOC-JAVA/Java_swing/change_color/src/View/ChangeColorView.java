package View;

import Controller.ChangeColorController;
import Model.ChangeColorModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*chương trình tạo giáo diện JFraem Gui cu java SWIng
* mô hình MVC-  View hiển thị*/
public class ChangeColorView extends JFrame {
    private ChangeColorModel mycolor_model;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JLabel label_display;

    //contructor
    public ChangeColorView(){
        this.mycolor_model = new ChangeColorModel();
        this.giaodien();
    }

    // xây dựng method giao diện
    public void giaodien(){
        this.setTitle("phân mềm thay đổi màu sắc");
        // hiển thị ứng dụng ngay giữa desktop
        this.setLocationRelativeTo(null);
        //tắt hẳn chtrinh
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

        // tiến hành thay đổi kích thuocs font chữ
        Font my_font= new Font("Arial", Font.BOLD, 20);
        // định myfont_label
        Font my_text= new Font("Arial", Font.BOLD, 75);


        // tiến hành gọi sự kiện ACtionListener
        ActionListener al = new ChangeColorController(this);


        JPanel jpanel_label = new JPanel();
        jpanel_label.setLayout(new BorderLayout());
        label_display = new JLabel("Text", JLabel.CENTER);
        //add my_font thay đổi kích cỡ
        label_display.setFont(my_text);

        jpanel_label.add(label_display, BorderLayout.CENTER);

        // thiết lập button
        button1 = new JButton("màu đỏ");
        // add my_font thay đổi kích cỡ font chữ
        button1.setFont(my_font);
        // thiết lập màu chữ
        button1.setForeground(Color.red);
        //add sự kiện ActionListener
        button1.addActionListener(al);

        button2 = new JButton("màu vàng");
        // add my_font thay đổi kích cỡ font chữ
        button2.setFont(my_font);
        // thiết lập màu chữ
        button2.setForeground(Color.yellow);
        //add sự kiện ActionListener
        button2.addActionListener(al);

        button3 = new JButton("màu xanh");
        // add my_font thay đổi kích cỡ font chữ
        button3.setFont(my_font);
        // thiết lập màu chữ
        button3.setForeground(Color.green);
        //add sự kiện ActionListener
        button3.addActionListener(al);

        button4 = new JButton("nền đỏ");
        // add my_font thay đổi kích cỡ font chữ
        button4.setFont(my_font);
        // set màu nền cho button
        button4.setBackground(Color.red);
        // set đổi màu nền
        button4.setOpaque(true);
        //add sự kiện ActionListener
        button4.addActionListener(al);

        button5 = new JButton("nền cam");
        // add my_font thay đổi kích cỡ font chữ
        button5.setFont(my_font);
        // set màu nền cho button
        button5.setBackground(Color.orange);
        // set đổi màu nền
        button5.setOpaque(true);
        //add sự kiện ActionListener
        button5.addActionListener(al);

        button6 = new JButton("nền hồng");
        // add my_font thay đổi kích cỡ font chữ
        button6.setFont(my_font);
        // set màu nền cho button
        button6.setBackground(Color.pink);
        // set đổi màu nền
        button6.setOpaque(true);
        //add sự kiện ActionListener
        button6.addActionListener(al);

        JPanel jpanel_button = new JPanel();
        jpanel_button.setLayout(new GridLayout(2,3));
        jpanel_button.add(button1);
        jpanel_button.add(button2);
        jpanel_button.add(button3);
        jpanel_button.add(button4);
        jpanel_button.add(button5);
        jpanel_button.add(button6);

        // hiển thị phân bố của class JFrame
        this.setLayout(new BorderLayout());
        this.add(jpanel_label, BorderLayout.CENTER);
        this.add(jpanel_button, BorderLayout.SOUTH);

        // hieent hị không ẩn
        this.setVisible(true);
    }

    // xây dựng method đổi màu cho text nội dung văn bản
    public void change_text_color(Color color_text){
        this.label_display.setForeground(color_text);
    }

    // method đỏi màu nền
    public void change_background_color(Color color_background){
        /* truy vấn đế tên của thẻ Jlabel.đến hàm đổi màu nền setBackground
        * truyền vào tham số biến do use đặt để sét thay đổi khi sự kiện nhấn vào
        * sẽ bắt đc sự khiển và tiến hành đổi màu
        * */

        this.label_display.setBackground(color_background);

        // thiêt lập đổi màu
        this.label_display.setOpaque(true);
    }


}
