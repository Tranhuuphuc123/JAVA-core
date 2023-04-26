package Thread_daluong;
/*tiềm hiểu về method_join trong java thread
* join dùng để cho tiến trình của một thread đc chỉ định chạy hết mới tới lược các thread còn lại chạy
* */
public class method_join extends Thread {
    public void run(){
        for(int i = 0; i<5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //cách xuất ra thread với giá trị đươợc đặt tên
            System.out.println(this.getName() + " " + i);
        }
    }

    //hàm main để chạy tiến trình join và setName cho thread
    public static  void main(String[] args){
        method_join t1 = new method_join();
        // đặt tên cho thread
        t1.setName("Thread1");

        method_join t2 = new method_join();
        // đặt tên cho thread
        t2.setName("Thread2");

        method_join t3 = new method_join();
        // đặt tên cho thread
        t3.setName("Thread3");

        /*bài toa đặt ra l nếu chạy t1.start.. t3.start thì tiên trình chạy sẽ bị delay 2s và chạy song song
        * vậy nếu muốn cho thread t1 chạy hết rồi mới tới các thread sau thì làm sau: dùng join
        * lưu ý khi dùng join cần bỏ vào exception
        * */
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
        t3.start();
        /*
        *  ==> lúc này sau khi t1 chạy hết tiến trình thì t2,t3 mới chạy song song tiếp tục
        * ==> ngoài ra join cũng có  thể set thời gian: vd join(1500) sau 1.5s maf không chạy xong thì
        * các thread còn lại sẽ chạy
        * */
    }
}
