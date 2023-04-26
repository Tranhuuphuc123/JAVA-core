package Exception_Throw_Throws;
/*trong bài toán này ta thực hành một đoạn bắt lỗi với số chia cho 0 sẽ bị loi
dùng đoạn Myexception tự tạo để bắt lõi cỗ đó
* */
public class text {
    public static void main(String[] args) {
       try {
           // lỗi nếu không bỏ vào try catch bắt lỗi vì số nguyên không chia đc cho 0
           chia2so(5,0);
       }catch (MyException e){
           System.out.println(e.getEror());

       }

    }

    // xây dựng function  xử lý số  chia 2so
    public static void chia2so(int a, int b) throws MyException{
        try {
                int kq = a/b;
        }catch (Exception e){
            // ném ra ngoại lệ vừa khởi tạo MyException
            throw new MyException("lỗi không chi đc cho số 0 nha bạn yêu");
            //---> lúc này throw ne ra ngoại lệ sẽ bị lõi nếu ta không định danh nó lại trong hàm bằng throws
            // định danh throws ở ngay tên của function khơi tạo
        }
    }
}
