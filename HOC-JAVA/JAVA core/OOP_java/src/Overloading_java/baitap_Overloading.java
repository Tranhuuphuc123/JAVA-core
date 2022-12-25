package Overloading_java;
/*tiềm hiểu về Oververloading thông qua bài tập sau
* lưu ý overloading là sử dụng nhiều method cunùng tên nhưng khác tham số
* */
public class baitap_Overloading {
        // xây dựng method tìm min
    public int min(int a, int b){
        if(a<b) {
            return a;
        }
        else {
            return b;
        }
    }


    //Overoading  method 2 giống method 1 khác tham kiểu type
    public double min(double a, double b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }



    // xây dựng method 3 tính tổng 2 số
    public int tinhtong(int a, int b){
        return a+b;
    }

    // overloading với method 3 nhưng khác tham số và type luôn
    public double tinhtong(double [] arr){
        double tong =0;
        for(int i =0; i<arr.length;i++){
            tong +=arr[i];
        }
        return tong;
    }


    // thực thi trong ham main kiểm tra text

    public static void main(String [] args){
        baitap_Overloading a = new baitap_Overloading();
        System.out.println("min số nguyên; " + a.min(5,6));

        System.out.println("min số thực Over; " + a.min(5.6,3.3));

        System.out.println("tong số nguyên: " + a.tinhtong(6,5));

        double [] arr = {2,5,6,5,8};
        System.out.println("tong mảng Over: " + a.tinhtong(arr));
    }
}

