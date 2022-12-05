package bai_tap_quanly_sach;

import java.util.ArrayList;

/*tiến hành thực thi phần mềm quản lý sách*/
public class text {
    public static void main(String[] args){
        ArrayList<quanlysach> pmquanlysach = new ArrayList<>();
        quanlysach c1 = new quanlysach();
        c1.nhap_sach();
        pmquanlysach.add(c1);

        System.out.println("--------------------");
        quanlysach c2 = new quanlysach();
        c2.nhap_sach();
        pmquanlysach.add(c1);


        for(int i=0; i<pmquanlysach.size();i++){
            pmquanlysach.get(i).xuat_sach();
        }

        // kiểm tra có cùng nằm xuất bản
        System.out.println("kiểm tra cùng năm xuất bản có không: " + c1.equals(c2));



        // tiền giảm giá 10%
         System.out.println("---------------------");
        System.out.println("giá giảm sp1: " + c1.giaSauKhiGiam(10));
        System.out.println("giá giảm sp1: " + c2.giaSauKhiGiam(10));


    }
}
