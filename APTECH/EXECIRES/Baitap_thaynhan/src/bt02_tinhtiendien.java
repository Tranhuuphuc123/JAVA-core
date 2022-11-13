// bài tập tính tiền điện xây dựng kiểu trả về void để lk với bài tập 03

import java.util.Scanner;
public class bt02_tinhtiendien {
    public void tinhtiendien(){

        Scanner sc = new Scanner(System.in);

        int sodien;

        System.out.print(" nhập tiền điện: " + "\n");
        sodien=sc.nextInt();

        if(sodien==0 || sodien<=50){
            int tongtien1 = sodien*1000;
            System.out.println(" tiền điện tháng này la: " + tongtien1 );
        }else if(sodien>50){
            int tongtien2 =  50*1000 + (sodien - 50)*1200;
            System.out.println(" tong tiê điện >50kw: " + tongtien2);
        }

    }
}
