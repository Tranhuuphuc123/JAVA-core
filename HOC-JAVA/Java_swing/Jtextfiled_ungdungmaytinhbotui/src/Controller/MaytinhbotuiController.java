package Controller;
// mô hình MVC- Controller truy bắt sự kiện

import View.MaytinhbotuiView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaytinhbotuiController implements ActionListener {

    private MaytinhbotuiView maytinhbotui_view;

    // contructor


    public MaytinhbotuiController(MaytinhbotuiView maytinhbotui_view) {
        this.maytinhbotui_view = maytinhbotui_view;
    }



    // tiến ành ghi đè method actionPerformed để xử lý sự kiện
    @Override
    public void actionPerformed(ActionEvent e) {
        //nguồn sự kiện được bắt lấy bởi hàm getActionCommand có tên là button, ý nghĩa nhấn nút sự kiện gì sẽ xảy ra???
        String button = e.getActionCommand();
        if(button.equals("+")){
            this.maytinhbotui_view.cong();
        }else if(button.equals("-")){
            this.maytinhbotui_view.tru();
        }else if(button.equals("*")){
            this.maytinhbotui_view.nhan();
        }else if(button.equals("/")){
            this.maytinhbotui_view.chia();
        }else if(button.equals("^")){
            this.maytinhbotui_view.pow();
        }else if(button.equals("%")){
            this.maytinhbotui_view.mod();
        }

    }
}
