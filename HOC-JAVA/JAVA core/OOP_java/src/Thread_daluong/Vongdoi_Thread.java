package Thread_daluong;

public class Vongdoi_Thread implements  Runnable {
    @Override
    public void run() {
        System.out.println("Thread bắt đầu chạy");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread bị chặn");
        }
        System.out.println("Thread đã kết thúc");
    }

    //hame main
    public static void main(String[] args) {
        // Tạo một thread mới
        Thread myThread = new Thread(new Vongdoi_Thread());

        // Bắt đầu thread
        myThread.start();

        // Chờ thread kết thúc
        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Chờ thread bị chặn");
        }

        System.out.println("Chương trình kết thúc");
    }
}

/*giái thích chi tiết*/
/*
*  đây, trong phương thức run(), chúng ta bắt đầu bằng câu lệnh in ra "Thread bắt đầu chạy", sau đó tạm dừng thread trong 2
* giây bằng phương thức Thread.sleep(), rồi in ra "Thread đã kết thúc".Trong phương thức main(), chúng ta tạo một thread mới
*  và bắt đầu nó bằng phương thức start(). Sau đó, chúng ta sử dụng phương thức join() để chờ thread kết thúc trước khi chương
* trình hoàn thành. Nếu thread bị chặn trong khi đang chạy, chúng ta xử lý ngoại lệ trong phương thức catch. Cuối cùng, chúng
* ta in ra "Chương trình kết thúc" để báo hiệu rằng chương trình đã hoàn thành.
* */
