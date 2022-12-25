package Overriding_java;
/*tiềm hiểu về ghi đè phương thức Overrride trong java*/
public class child extends parent {

      @Override
    public void eat(){
          System.out.println(" lớp con đang ăn");
      }
      @Override
    public void action(){
          System.out.println(" lớp con đang chơi");
      }
}
