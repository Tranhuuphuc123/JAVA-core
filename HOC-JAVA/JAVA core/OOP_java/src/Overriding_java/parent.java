package Overriding_java;
/*tiềm hiểu về ghi đè phương thức Overrride trong java*/
public class parent {
    private String name;

    public parent(String name) {
        this.name = name;
    }
    public parent(){

    }
    // getter and setter

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method

    public void eat(){
        System.out.println("tao đag ăn");
    }

    public void action(){
        System.out.println("------");
    }
}
