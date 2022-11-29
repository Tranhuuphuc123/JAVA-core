/*tiềm hiểu nâng cao với mảng, Arraylist, list*/
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class mang_Arraylist_list {
    public static void main(String[] args){

        //ôn tí về pg thức xây dựng mảng: y/c nhập số pt mảng từ bàn phím và xuất tổng mảng
        /*Scanner sc = new Scanner(System.in);


        System.out.println("nhập phần tử n mảng vào: ");
        int n=sc.nextInt();

        int arr[] = new int[n];

        System.out.println("------------------------------");

        for(int i=0; i<n; i++){
            System.out.println("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("-----------------------------");

        int total = 0;

        for(int i = 0; i<n;i++){
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println(" total: " + total);
*/



        /*Arraylist*/
        // phần bài tập Arraylist- phần 1


        // gọi ha Arraylist trong java
       /* ArrayList<Integer> phuc = new ArrayList<>();

        //tạo vòng lặp nối các yếu tố của danh sách Arraylist với kích thước ban đầu
        for(int i =1; i<=5;i++){
            phuc.add(i);
        }

        // xuất mảng danh sáchAraylist
        System.out.println(phuc);

        // xóa bỏ vị trí tp mong muốn với remove
        phuc.remove(3);
        System.out.println(phuc);

        // xóa bỏ khung [] và in từng phần tử một
        for(int i =0; i<phuc.size(); i++){
            System.out.print(phuc.get(i) + " " );
        }*/







        //-----------------------------------------------------------------------

        // phần 2 của Array list
        ArrayList<String> phuc = new ArrayList<>();

        // thêm phần tử với add
        phuc.add("value 1");
        phuc.add("value 2");

        System.out.println(phuc);
        //===> in kw: [value1, value2]

        // Ở đây chúng ta đang đề cập đến chỉ số tại đó nó sẽ được thêm vào
        phuc.add(1,"+");

        System.out.println(phuc);
        //===> in kw: [value1,+, value2]

        // thiết lập thay đô với set
        phuc.set(1,"nối");
        System.out.println(phuc);

        //====> kw: nó sẽ thay vtri 1 là + thành nối: [valua 1, nối, value 2]

        // loại bỏ với remove
        phuc.remove("nối");
        System.out.println(phuc);

        //==> kw: [value 1, value 2] t cũng c thể viết phuc.remove(1)

    }
}
