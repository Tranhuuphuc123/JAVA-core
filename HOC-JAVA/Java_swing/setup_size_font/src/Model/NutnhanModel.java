package Model;
/*mô hình MVC- Model xây dựng pm nút nhấn hiển thị giá trị khi ấn*/


public class NutnhanModel {
    private int value;

    // contructor

    public NutnhanModel() {
        this.value = 1;
    }

    // get and set

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // xây dựng method tiến hành trả giá trị khi ấn
    public void set_value01(){
        this.setValue(1);
    }
    public void set_value02(){
        this.setValue(2);
    }
    public void set_value03(){
        this.setValue(3);
    }
    public void set_value04(){
        this.setValue(4);
    }
}
