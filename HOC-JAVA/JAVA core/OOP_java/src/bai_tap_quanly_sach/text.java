package bai_tap_quanly_sach;

import java.util.ArrayList;
import java.util.Scanner;
/*tiến hành thực thi phần mềm quản lý sách*/
public class text {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        ArrayList<quanlysach> pmquanlysach = new ArrayList<>();
        // quanlysach c1 = new quanlysach();
        // c1.nhap_sach();
        // pmquanlysach.add(c1);

        // System.out.println("--------------------");
        // quanlysach c2 = new quanlysach();
        // c2.nhap_sach();
        // pmquanlysach.add(c1);

        while(true){
            quanlysach ql = new quanlysach();
            ql.nhap_sach();
            pmquanlysach.add(ql);

            String n="Y";

            System.out.println("ban co muon nhap tiep: Y/N?");
            n = sc.nextLine();
            if(n.compareTo("N")==0 || n.compareTo("n")==0) {
                break;
            }
        }


        for(int i=0; i<pmquanlysach.size();i++){
            pmquanlysach.get(i).xuat_sach();
        }

        // kiểm tra có cùng nằm xuất bản
//        System.out.println("kiểm tra cùng năm xuất bản có không: " + c1.equals(c2));



        // tiền giảm giá 10%
         System.out.println("---------------------");
       

    }
}
