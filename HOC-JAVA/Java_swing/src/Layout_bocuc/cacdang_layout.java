package Layout_bocuc;

import javax.swing.*;
import java.awt.*;

// tiềm hiểu các dạng Layout:
public class cacdang_layout extends JFrame {

    //tạo layout dạng Flowlayout, layout nằm xếp ngang
    public void dang_flowlayout( String title,int x, int y){
        this.setTitle(title);
        this.setSize(x,y);
        this.setLayout(new FlowLayout());
        this.add(new JButton("ok"));
        this.add(new JButton("Cancel"));

        //tắt hẳn ứng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hiển thị không ẩn JFrame
        this.setVisible(true);
    }

    // tạo layout dạng Gridlayout, chia dạng bố cục lưới
    public void dang_Gridlayout(String title, int x, int y){
        this.setTitle(title);
        this.setSize(x, y);
        this.setLayout(new GridLayout(1,2));
        this.add(new JButton("ok"));
        this.add(new JButton("cancel"));

        //tắt hẳn ứng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hiển thị không ẩn JFrame
        this.setVisible(true);
    }

    // tạo layout dạng Borderlayout dang phân theo vị trí bắc nam đôgn tây
    public void dang_Borderlayout(String title, int x, int y){
        this.setTitle(title);
        this.setSize(x, y);
        this.setLayout(new BorderLayout());
        this.add(new JButton("nút bắc"), BorderLayout.NORTH);
        this.add(new JButton("nút nam"), BorderLayout.SOUTH);
        this.add(new JButton("nút đông"), BorderLayout.EAST);
        this.add(new JButton("nút tây"), BorderLayout.WEST);
        this.add(new JButton("nút gữa"), BorderLayout.CENTER);

        //tắt hẳn ứng dụng
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // hiển thị không ẩn JFrame
        this.setVisible(true);
    }





 // thực thi ở hàm main
    public static void main(String[] args) {
        cacdang_layout a = new cacdang_layout();
        // gọi từng dạng layout
//        a.dang_Gridlayout("dang grid", 200,200);
        // dạng Border layout
        a.dang_Borderlayout("dang Border", 300,300);

    }
}
