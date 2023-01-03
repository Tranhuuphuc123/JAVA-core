package Controller;
// mô hình MVC- Controller bắt sự kiện với Controller

import View.UngdungtimkiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UngdungtimkeimController implements ActionListener {
    private UngdungtimkiemView timkiem_view;

    // contructor


    public UngdungtimkeimController(UngdungtimkiemView timkiem_view) {
        this.timkiem_view = timkiem_view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.timkiem_view.timkiem();
    }
}
