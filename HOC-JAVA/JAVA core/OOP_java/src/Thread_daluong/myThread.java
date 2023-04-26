package Thread_daluong;

// tạo thread theo kiểu implement Runable
    class myThread1 implements Runnable {

        // với việc tạo thread thì vần Override lại method run của Runable
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A: " + i);
            }
        }
    }

    // tạo thread theo kiểu extend Thread
     class myThread2 extends Thread {
        // với việc tạo thread thì vần Override lại method run của Runable
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("A: " + i);
            }
        }
    }

    //hàm main class chính
    public class myThread{
        public static void main(String [] args){
            // cách chạy song song nhiều luông
            myThread1 thread1 = new myThread1();
            Thread t = new Thread(thread1);
            /* khi goi khởi tạo thread2 thi không cần gán vào Thread chỉ cần gọi là chạy
            * vì thread 1 đã liên kết với Thread ngay từ lần khởi tạo đầu tiên
            * */
            myThread2 thread2 = new myThread2();


            // chạy thread
            t.start();
            thread2.start();
        }
    }








