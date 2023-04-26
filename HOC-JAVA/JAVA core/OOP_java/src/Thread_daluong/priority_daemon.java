package Thread_daluong;
/*cùng tiềm hiểu thuộc tính mới của Thread
* 1/Priority: độ ưu tiên khi chạy củ một thread(ưu tiên theo câp độ: 1 - 5 - 10)
* 2/ daemon(): luồng hiếm chạy ngầm của Thread
* */
public class priority_daemon extends  Thread{
    @Override
    public void run(){
        for(int i =0;i<5;i++){
            System.out.println(this.getName() + " " + i);
        }
    }
//hàm main thực thi
    public static  void main(String[] args){
        priority_daemon t1 = new priority_daemon();
        priority_daemon t2 = new priority_daemon();
        priority_daemon t3 = new priority_daemon();

        //đặt tên cho thread
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");

        //xét độ ưu tiên priority-> dựa vào độ ưu tiên càng cao thread sẽ chạy trc.
        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(5);

        // tiến trình Daemon luồng hiếm
        t1.setDaemon(true);
        System.out.println("luong hiem hoat dong: " + t1.isDaemon());
        /*
        * Lưu ý: Nếu bạn muốn tạo một luồng người dùng như một luồng hiểm, phải gọi phương thức setDaemon(true) trước khi start()
        * */

        //chạy thread
//        t1.start();
//        t2.start();
//        t3.start();
        /*xét đọ ựu tiên của pritotity*/
    }
}
