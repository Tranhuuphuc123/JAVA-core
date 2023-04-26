package Thread_daluong;
/*một ví dụ về cách thiết lập luokng hiếm Daemon*/
public class Daemon_luonghiem extends  Thread {
    @Override
    public void run(){
        if (Thread.currentThread().isDaemon()) { // check luong hiem
            System.out.println("luong hiem hoat dong");
        } else {
            System.out.println("luong nguoi dung hoat dong");
        }
    }

    public static void main(String[] args) {
        //tao thread
         Daemon_luonghiem t1 = new Daemon_luonghiem();
         Daemon_luonghiem t2 = new Daemon_luonghiem();
         Daemon_luonghiem t3 = new Daemon_luonghiem();

        t1.setDaemon(true);// cat dat t1 la luong hiem

        t1.start();// start cac thread
        t2.start();
        t3.start();
    }

}
