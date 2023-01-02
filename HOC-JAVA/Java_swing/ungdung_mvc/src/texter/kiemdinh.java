package texter;

import Model.CounterModel;
import view.CounterView;

/// vai trò texter kiêm tử ứng dụng
public class kiemdinh{
    public static void main(String[] args) {
        CounterModel cm = new CounterModel();
        cm.bodemtang();
        System.out.println(cm.getValue());
        // cho giảm 1 lần
        cm.bodemxuong();
        System.out.println("kw đếm xuống:" + cm.getValue());

        // chạy giao diện
        CounterView cv = new CounterView();
    }
}