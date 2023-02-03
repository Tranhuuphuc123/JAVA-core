package list_keyword;
// tiềm hiểu về cách khai báo biến và hàm của class với static.. hiểu rõ hơn về hương thức của static

public class tukhoa_static {
    // ví dụ đây ta sẽ khai báo một biến và một hàm method bằng static và cách gọi sử dụng class có biến hàm bănng static trong hàm main
    // cũng như tiềm hiểu thêm về cách gọi biến và hàm trong một class khi không có static bằng cách khởi tạo đối tượng cho class
//***************************************************************
    // kởi tạo biến với static
    private static int count =0;
    // khởi tạo biến  bình thường
    private int count2 =0;

    // xây dựng method static
    public static int chuvi(int chieudai, int chieurrong){
        return (chieudai+chieurrong)*2;
    }

    // xây dựng method khoogn có static
    public int dientich(int chieudai, int chieurong){
        return (chieudai*chieurong);
    }



    // thực thi trong hàm main
    public static void main(String[] args) {
        //đối với cách khai báo có static khi thực thi ta chỉ việc gọi tên class.biến hoặc tên class.method
        tukhoa_static.count+=1;
        System.out.println(tukhoa_static.count);
        System.out.println("chuvila: " + tukhoa_static.chuvi(5,3));



        /* nhưng đối với biến và hàm không có  static thì không thể gọi thực thi theo kiểu dùng tên class. biến hoặc hàm method mà phải
        * gọi class và khởi tạo đối tượng gọi theo kiểu đối tượng
        * */
        tukhoa_static tk = new tukhoa_static();
        tk.count2+=2;
        System.out.println(tk.count2);
        System.out.println("dientich: " + tk.dientich(5,3));
    }

}
