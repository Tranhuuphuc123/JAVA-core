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
        String src = e.getActionCommand();

    }
}
