package controller;

import view.NutnhanView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*mô hình MVC-Controller truy bắt sự kiện với ACtionListener*/
// lưu y với ActionListener thì cần Overrider lại, nhanh gọn bằng cách nhấn add IMplement method trong phần bug lỗi
public class NutnhanControler implements ActionListener {
    private NutnhanView nutnhan_view;

    // contructor
    public NutnhanControler(NutnhanView nutnhan_view) {
        this.nutnhan_view = nutnhan_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            /*truy bắt sự kiện bằng getActionCommand
            * nghĩa là khi controler bắt sự kiện khi ấn button để biết đc giá trị value
            * khi nhấn là giá trị nào để tiến hành xét đk thiết lập ở method changevalue ở view
            * thì ta dùng getActionCommand
            * */

        /*tiếp tục tiến hành xét đk if với equals.. nếu nhaanj vào là 1 thi lk với NutnhanView
        tiến hành thay đổi theo method change_value bên view.. tg tự ở các button khác
        * */
        String nguonsukien = e.getActionCommand();
        if(nguonsukien.equals("1")){
            this.nutnhan_view.change_value01();
        }else if(nguonsukien.equals("2")){
            this.nutnhan_view.change_value02();
        }else if(nguonsukien.equals("3")){
            this.nutnhan_view.change_value03();
        }else if(nguonsukien.equals("4")){
            this.nutnhan_view.change_value04();
        }
    }
}
