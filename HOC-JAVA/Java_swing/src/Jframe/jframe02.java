package Jframe;
 import javax.swing.JFrame;
 import java.awt.*;

/*bài tập dụng về JFrame trong java*/
public class jframe02 extends JFrame {
    // tạo ra các phương thức cụ thể hơn với jframe

     //contrcutor
     public jframe02(){
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     // khởi tạo method
     // chức năng showw and tắt với method show của jfarme
     public void showIT(){
         this.setVisible(true);
     }

     // có thể show khai báo method như sau
     public void showIT(String title, int width, int height){
         this.setTitle(title);
         this.setSize(width,height);
         this.setVisible(true);
     }



     // thực thi bên hàm main
     public static void main(String[] args) {
         jframe02 a1 = new jframe02();
         jframe02 a2 = new jframe02();
         a1.showIT();
         a2.showIT("bài tập Frame đầu tin",600,400);




     }
}
