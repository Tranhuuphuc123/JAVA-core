package Controller;

import View.thanhcuonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thanhcuonControler implements ActionListener {

    private thanhcuonView tc_view;

    // contructor


    public thanhcuonControler(thanhcuonView timkiem_view) {
        this.tc_view = timkiem_view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.tc_view.timkiem();
    }
}
