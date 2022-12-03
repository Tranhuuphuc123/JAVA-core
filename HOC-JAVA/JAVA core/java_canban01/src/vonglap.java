/*trong bài hôm nay mình sẽ tìm hiểu về vòng lặp trong ngôn ngữ java*/
import java.util.Scanner;

public class vonglap {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

         int x=0;

         // in bảng cửu chương với vòng lặp for.
      /*
         System.out.println(" ente the x: ");
         x= sc.nextInt();

         System.out.println(" bang cuu chuong gia tri : " + x);
         for(int i=0; i<=10;i++){
             int ketqua = x*i;
             System.out.println( x + "*" + i + "=" + ketqua);
        }
        */


         // vòng lặp vô tận với for
        /*
        * System.out.println("gia trị x: ");
        for( ; ; ){
            System.out.println(x);
            x++;
        }

        *
        * */



        //vòng lặp while

        /*int y = 1;
        while(y!=0) {
            System.out.println(" nhan 0 de thoat- nhán phím bat ky de tiep tuc");
            y=sc.nextInt();
         }*/


        // vòng lặp vô tận với while
        
        int c =0;
        while(true) {
            System.out.println(c);
            c++;

            // đoạn này để chặn hộng khi tới 10 vòng lặp vô tận bi đắp chiếu
            if(c==10){
                break;
            }
        }
        




        // vòng lặp do - while

        // vòng lặp for-each

        String bosuutap[]={"value1", "value2", "value3"};
        for(String a: bosuutap){
            System.out.println(a);
        }



    }
}
