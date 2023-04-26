package Thread_daluong;
/*trong lập trình java thread có nhiều method khác nhau - ta cùng tiềm hiểu về methd slepp của thread*/
public class method_Sleep extends Thread{
    public void run(){
        for(int i =0;i<=5;i++){
            try{
                // sử dụng sleep để delay
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

   public  static  void main(String[] args){
        method_Sleep t1 = new method_Sleep();
        method_Sleep t2 = new method_Sleep();
        //khởi chạy Thread
        t1.start();
        t2.start();

        /*
        * giải thích như sau:
        *  + Đoạn code này tạo ra hai đối tượng thread của lớp method-Sleep và khởi chạy chúng. Mỗi thread được thực
        * thi bởi phương thức run(), trong đó mỗi vòng lặp sẽ đợi 1s
        *
        *  + Trong phương thức run(), thread đợi 2000 milliseconds(2s) bằng cách gọi phương thức sleep(2000).
        *  + Sau đó, thread in ra giá trị của biến i (từ 0 đến 5).
        *  + Nếu thread bị gián đoạn (interrupted) trong khi đang ngủ, nó sẽ in ra thông báo lỗi.
        * ===> Bởi vì hai thread được thực thi đồng thời, kết quả của chương trình có thể khác nhau mỗi lần chạy.
        * Các giá trị i có thể được in ra lần lượt hoặc xen kẽ giữa hai thread.
         * */
    }

}
