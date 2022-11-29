// khái báo thư viện khi gọi Arraylist

import java.util.*;

public class mang_Arraylist_2d {
    // trong bài này ta tiềm hiểu về mảng Arrsylist 2 chiều.. nhiều chiều
    /*baif toán đặt ra là có nhiều mảng Arraylist vậy cách tạo để bao gói các mảng đó và
    * xuất ra tất cả các mảng đó*/
    public static void main(String[] args){
        // đây là cách khai báo Arraylist cho nhiểu mảng Arraylist ( tức mảng Araylist 2d->)
        ArrayList<ArrayList> mang_lon = new ArrayList();

        // khởi tạo Arraylist con 1
        ArrayList<String> mang_con_01 = new ArrayList<>();
        mang_con_01.add("value 1");
        mang_con_01.add("value 2");


        // khởi tạo Arraylist con 2
        ArrayList<String> mang_con_02 = new ArrayList<>();
        mang_con_02.add("value 3");
        mang_con_02.add("value 4");

        // khởi tạo Arraylist con 3
        ArrayList<String> mang_con_03 = new ArrayList<>();
        mang_con_03.add("value 5");
        mang_con_03.add("value 6");

        // tiến hành đóng gối đưa vào Arraylist tổng, --> lúc này Arraylist tổng sẽ bao bọc hết các Arraylist con
        mang_lon.add(mang_con_01);
        mang_lon.add(mang_con_02);
        mang_lon.add(mang_con_03);


        // xuất thông tin toàn bộ 3 mảng
        System.out.println(mang_lon);
        // xuất thông tin mang theo ý muốn, vd lấy mang_con_03
        System.out.println(mang_lon.get(2));
        // xuất dữ liệu ở mảng con 03 ở vtri 2 có giá trị value 6
        System.out.println(mang_lon.get(2).get(1));


    }

}
