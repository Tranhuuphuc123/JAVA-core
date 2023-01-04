package view;

import javax.swing.*;

public class quanlythuvien extends JFrame {
    private JPanel panel_main;
    private JLabel label_tiimkiem1;
    private JTextField field_tiemkiem1;
    private JLabel label_tiemkiem2;
    private JTextField label_timkiem2;
    private JButton button_timkiem1;
    private JButton button_timkiem2;
    private JTextArea area_hienthi;
    private JLabel label_danhsach;
    private JLabel label_sach;
    private JLabel label_maSach;
    private JTextField field_sach1;
    private JLabel label_tenSach;
    private JTextField field_sach2;
    private JLabel label_theLoai;
    private JTextField field_sach3;
    private JLabel label_namXuatban;
    private JTextField field_sach4;
    private JButton button_Add;
    private JButton button_Delete;
    private JButton button_Update;
    private JButton button_Cancel;


    // contructor
    public quanlythuvien(){
        this.giaodien();
    }

    // method giao diện
    public void giaodien(){
        this.setTitle("phần mềm quản lý sách thư viện");
        // tắt hẳn khi đóng ưnng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //chạyứng dụng không ẩn
        this.setVisible(true);



        // thiết lập chạy JFRAME trên GUI form của java Swing
        this.setContentPane(panel_main);
        this.pack();

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
