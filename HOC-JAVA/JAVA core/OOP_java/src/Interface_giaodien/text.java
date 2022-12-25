package Interface_giaodien;
/*nội dung thưc hành
a/ tạo ra interface maytinhbotui và hai class phu maytinh casio va vinacal thực thi các phep cộng trừ nhân chia
b/ tạo lớp interface thứ 2 là sapxep và 2 lớp con thực thi interfce sapxepchen và sapxepchon
c/ tạo lớp thực thi cả 2 interface lớn Maytinhbotui va sapxep co ten là phan mem may tinh
* */

import java.util.Scanner;
public class text {
    /* a tính năng máy tính*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*câu a maytinhbotui*/
        // thực hiện phép cộng nhập liệu từ bàn phím
            MaytinhCasioFX570 Fx570 = new MaytinhCasioFX570();
            Fx570.nhap_cong();
            Fx570.xuatcong();

            // phương pháp trừ theo kiểu gáng giá trị trự tiếp
            System.out.println("kw trừ: " + Fx570.tru(5,3));



        /*method chung*/
            int  n;
            System.out.println("enter the n: ");
            n = sc.nextInt();

            // nhập mảng
            double [] arr = new double[n];
            for(int i=0; i<n;i++){
                System.out.println("arr["+ i +"]: ");
                arr[i] = sc.nextDouble();
            }

            //xuất mảng
            for(int i=0; i<n; i++){
                System.out.print( arr[i] + "\t" );
            }
            System.out.println();


        /*b thưc thi interface sapxep*/
            sapxepchen sxc = new sapxepchen();

            sxc.sapxeptang(arr);
            System.out.println("kw tang");
            for(int i =0; i<arr.length;i++){
                System.out.print(arr[i] + "\t");
            }

            System.out.println();

            System.out.println("kw giam");
            sxc.sapxepgiam(arr);
            for(int i =0; i<arr.length;i++){
                System.out.print( arr[i] + "\t");
            }


            System.out.println("*********************************");
            System.out.println("phần mềm máy tính");


        /*c phanmemmaytinh thực thi 2 lớp interface lớn vừa xây dựng*/
            // gọi phuong tính maytinhbotui
             phanmemmaytinh pmmt = new phanmemmaytinh();
             pmmt.nhap_cong();
             pmmt.xuatcong();

             pmmt.sapxeptang(arr);
            for(int i =0; i<arr.length;i++){
                System.out.print(arr[i] + "\t");
            }

            pmmt.sapxepgiam(arr);
            for(int i =0; i<arr.length;i++){
                System.out.print( arr[i] + "\t");
            }

    }
}
