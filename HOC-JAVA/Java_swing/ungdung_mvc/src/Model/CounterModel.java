package Model;
/*m hình MVC- model chức năng xử lý dữ liệu của ứng dụng*/
public class CounterModel {
    private int value;

    // contructor

    public CounterModel() {
        this.value = 0;
    }

    // get and set

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // xây dựng method dếm lên và đếm xuống cho mục đích đề bài

    public void bodemtang(){
        this.value++;
    }

    public void bodemxuong(){
        this.value--;
    }

    // reset chương trình về mặc định 0 ban đầu
    public void reset(){
        this.value=0;
    }
}
