package Jpanel_use;
/*thực thi trong hàm main của Jpanel*/

import java.awt.*;
import javax.swing.*;
import java.nio.ByteOrder;

public class text {
    public static void main(String[] args) {
        try {
/*các dạng look and feel này chỉ chạy cái thui*/

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//		    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyCalulator();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
