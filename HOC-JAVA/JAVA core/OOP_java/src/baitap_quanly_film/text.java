package baitap_quanly_film;
import java.util.ArrayList;
import java.util.Scanner;

// phần mềm quản lý danh sách xem phim

public class text {
    public  static void main(String[] args){
        ArrayList<Quanly_film> phanmem_film = new ArrayList<>();
        Quanly_film a = new Quanly_film();
        a.nhap_film();
        phanmem_film.add(a);

        System.out.println("------------------");
        Quanly_film b = new Quanly_film();
        b.nhap_film();
        phanmem_film.add(b);

        // xuất thông tin
        for(int i =0; i<phanmem_film.size();i++){
            phanmem_film.get(i).xuat_film();
        }



        // tiến hành so sánh giá vé
        System.out.println("phim có giá rẻ hơn: " + a.sosanhgiave(b));

    }

}
