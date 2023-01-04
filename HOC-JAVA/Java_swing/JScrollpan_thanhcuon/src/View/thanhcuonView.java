package View;

import Controller.thanhcuonControler;
import Model.thanhcuonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class thanhcuonView extends JFrame {
    private thanhcuonModel tc_model;

    private JLabel label_display01;
    private JLabel label_display02;
    private JLabel label_display03;

    private JTextArea area;
    private JTextField field;

    private JButton button01;

    //contructor
    public thanhcuonView()  throws HeadlessException {
        this.tc_model = new thanhcuonModel();
        this.giaodienchinh();
    }

    // xấy dựng method giao diện chính
    public void giaodienchinh(){
        this.setTitle("phần mềm Ứng dụng tiềm kiếm");
        this.setSize(400,400);
        // tắt hẳn khi chtrinh đóng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hiện khi chạy ctrinh ở giữa màn hình Desktop
        this.setLocationRelativeTo(null);


        // thiết lập font chữ
        Font font = new Font("Arial", Font.BOLD, 20);


        // gọi s kiện ActionListener
        ActionListener al = new thanhcuonControler(this);

        // thiết lập JPanel

        JPanel panel_footer = new JPanel();

        // đặt tên hiển thị
        label_display01 = new JLabel("Văn bản");
        label_display02 = new JLabel("Từ khóa");
        label_display03 = new JLabel("kết quả");

        button01 = new JButton("thống kê");
        // thiết lập màu chữ, màu nền
        button01.setForeground(Color.WHITE);
        button01.setBackground(Color.BLACK);
        // thiết lập tô màu cả viền
        button01.setOpaque(true);
        // thêm sự kiện
        button01.addActionListener(al);

        area = new JTextArea(100,100);
        area.setFont(font);

        field = new JTextField();
        field.setFont(font);


        panel_footer.setLayout(new GridLayout(2,2,20,20));
        panel_footer.add(label_display02);
        panel_footer.add(field);
        panel_footer.add(button01);
        panel_footer.add(label_display03);

        // thiết lập layout chugn của JFraem phân bố
        this.setLayout(new BorderLayout());
        this.add(label_display01, BorderLayout.NORTH);
        this.add(area, BorderLayout.CENTER);
        this.add(panel_footer, BorderLayout.SOUTH);

        // hiển thị không ẩn JFrame
        this.setVisible(true);
    }


    // method truy bắt sự kiện
    public void timkiem(){
        this.tc_model.setVanban(area.getText());
        this.tc_model.setTukhoa(field.getText());
        this.tc_model.timkiem();
        // lúc này không nhận giá trị nhập vào(hay gtri đầu vào) nên ta dùng setText để ghi nhận kết quả
        // setText trả về chuỗi kw
        this.label_display03.setText(this.tc_model.getKetqua());
    }
}
