package Controller;
// chức năng controle tg tác sự kiên với giao diện view và model

import view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// sự kiện với Listener nó sẽ băt sự kiện giúp ta xử lý tác vụ
public class Counter_listener implements ActionListener {

    private CounterView ctv;

    // contrcutor
 public Counter_listener(CounterView ctv){
    this.ctv = ctv;
 }



 // ghi đè acttionListener,,
    @Override
    public void actionPerformed(ActionEvent e) {
       // hàm getActionCommand:
        String src= e.getActionCommand();
        System.out.println("bạn đã nhấn nút " + src);
        if(src.equals("Up")){
            this.ctv.bodemtang();
        }else if(src.equals("Down")){
            this.ctv.bodemgiam();
        }
    }
}
