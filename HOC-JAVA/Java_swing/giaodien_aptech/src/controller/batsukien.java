package controller;

import view.Giaodien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class batsukien  implements ActionListener {
    private Giaodien giaodien_view;

    public batsukien(Giaodien giaodien_view) {
        this.giaodien_view = giaodien_view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.giaodien_view.timkiem();
    }
}
