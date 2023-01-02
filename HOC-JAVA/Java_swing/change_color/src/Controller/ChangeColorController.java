package Controller;

import View.ChangeColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Mô hình MVC- Controller tiên hành truy bắt sự kiện điều khiển ctrinh*/
public class ChangeColorController implements ActionListener {
 private ChangeColorView mycolor_view;

 //contructor


    public ChangeColorController(ChangeColorView mycolor_view) {
        this.mycolor_view = mycolor_view;
    }

    // tiến hành Override method thực thi truy bắt sự kiện với ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        // truy bắt sự kiện Actionlisstener với getActionCommand
        String src = e.getActionCommand();
        if(src.equals("màu đỏ")){
            this.mycolor_view.change_text_color(Color.RED);
        }else if(src.equals("màu vàng")){
            this.mycolor_view.change_text_color(Color.yellow);
        }else if(src.equals("màu xanh")){
            this.mycolor_view.change_text_color(Color.green);
        }else if(src.equals("nền đỏ")){
            this.mycolor_view.change_background_color(Color.red);
        }else if(src.equals("nền cam")){
            this.mycolor_view.change_background_color(Color.orange);
        }else if(src.equals("nền hồng")){
            this.mycolor_view.change_background_color(Color.pink);
        }
    }
}
