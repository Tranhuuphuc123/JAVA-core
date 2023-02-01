public class Ham_function {
    /*Bài học này học về cách xây dựng một hàm function trong một class và các kểu hàm function thông dụng
    * --> hàm main (main) nơi thực thi code của một chtrinh tiềm hiểu trong phần cấu trúc của một ctrinh java sẽ hiểu hơn về main
    * */

    // function có kiểu trả về nhưng không có đối số truyền vào
    public static  int tinhtong(){
        int x =5;
        int y = 12;
        int tong  = x+y;

        return tong;
    }


    // function có kiểu trả về có đối số truyền vào
        public static int tinhhieu(int x, int y){
            int hieu= x-y;
            return  hieu;
        }

    // function không có kiểu trả về (void)
    public static  void xinchao(){
        System.out.println("xin chao day la ham khong doi so va kieu tra ve");
    }

    // function không có đối số truyền vào nhưng vẫn có kiểu trả về
    public static float Pi(){
        return 3.14f;
    }





    // hàm main thực thi chtrinh chính của java
    public static void main(String[] args) {
        int x =5;
        int y = 2;

        // gọi thực thi function01 có kiểu dl trả về nhưng không đối số, tong la 17 vì x, y gi trị đc khai báo trong method ham tinhtong trc đó
        System.out.println("tong: " + tinhtong());

        // gọi và tt hàm 02 truyền ga đối số trong ha main vào hàm 02 để nó hiểu
        int hieu= tinhhieu(x,y);
        System.out.println("hieu: " + hieu);

        // gọi và thực thi hàm không đối ố không kiểu trả về
        xinchao();

        //gọi thực thi hàm function 04 hàm kiểu không đôối số nhưng có kiểu trả về
        float S = Pi()*2;
        System.out.println("Diện tích: " + S);


    }

}
