package Exception_Throw_Throws;
// đoạn Exception do mình tự định nghĩa và tạo ra khong dự cấu trúc khuôn mẫu có sẵn

public class MyException extends Exception{
    private String eror;
    // contructor


    public MyException(String eror) {
        super();
        this.eror = eror;
    }

    // get and set

    public String getEror() {
        return eror;
    }

    public void setEror(String eror) {
        this.eror = eror;
    }
}
