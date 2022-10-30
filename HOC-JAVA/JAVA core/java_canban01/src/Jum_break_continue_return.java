/*tiềm hiểu về câu lệnh Jum nhảy với Break, continue, return*/

public class Jum_break_continue_return {
    public static void main(String[] args) {

        // câu lệnh với continue có đạt label tên là outer
      /*
          for(int i=2; i<=9; i++) {
            for(int j=1; j<=10; j++) {
                if(j>5)
                    continue ;
                System.out.println(i+" x "+j +" = "+(i*j));
            }
            System.out.println("---");
        }*/
        /*===> ta thấy với label outer khi đặt continue sẽ bỏ qua lun cac thức continue
        * trong vòng lặp for của j mà tiến tới for của i và lệnh continue sẽ có giá trị lun ở đó
        *  */





        //câu lệnh return


            for(int i=2; i<=9; i++) {
                for(int j=1; j<=10; j++) {
                    if(j>5)
                        return;
                    System.out.println(i+" x "+j +" = "+(i*j));
                }
                System.out.println("---");
            }

    }
}
