package baitap_abstract;
// phưng tiện xe đạp là class con

import java.util.Scanner;
public class xedap extends phuongtiendichuyen{
    // contructor
    public xedap(String tenphuogntien, String tenhangsanxuat, String quocgiasx) {

        super("xe đạp", tenhangsanxuat, quocgiasx);
    }

  // contructor rổng để tiê hành nhập từ bàn phím
    public xedap(){

    }


    //method nhap
    public void nhap_xedap(){
        super.nhap();
    }


    @Override
    public double layvantoc(){
        return 50;
    }

    @Override
    public String toString()
    {
        return "phương tiện xe đạp:( " + "tên hãng sx: " + this.getTenhangsanxuat() + "\n" + "quốc gia sx: " + this.getQuocgiasx() + "\n"
                + "vận tốc: " + this.layvantoc();
    }
}
