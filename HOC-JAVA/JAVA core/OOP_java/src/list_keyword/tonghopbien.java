package list_keyword;
// tiềm hiểu các hình thức tổng hợp các loại biến và hàm trong lập trình hướng đối tượng

public class tonghopbien {

    // biến local, biến trong một phương thức hàm
//    public void tongtin(){
//        String xincaho="xinchao";
//        System.out.println(xincaho);
//    }
    //---> lúc này nếu trong hàm main không gọi method thongtin th giá trị biến xin chào sẽ không bao giờ đc thực hiện..



    // biến intstance là biến khai báo chung cho một class dùng chung cho tât cả method
    private String name;
    //--> String name là một biến instace
    //contructor
    public tonghopbien(String name) {
        this.name = name;
    }

    //method layten dung biến instance
    public String getName(){
        return name;
    }


    //hàm main thực thi chtrinh
    public static void main(String[] args) {
        //biến instance là một dạng khai báo không có static nên sẽ thực thi bằng cách khởi tạo biens đối tượng
        tonghopbien thb = new tonghopbien("phúc");
        System.out.println("ten: " + thb.getName());
    }
}
