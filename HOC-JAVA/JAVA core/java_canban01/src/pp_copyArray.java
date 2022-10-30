// cùng tiềm hiểu về các phương thức copy sao chép value các mảng với java


import java.lang.reflect.Array;
import java.util.Arrays;

public class pp_copyArray {
    public static void main(String[] args) {

        // phương pháp 01- án giá trị mảng 1 cho mảng 02
        /*int a[] ={1,8,3};

        int b[] = new int [a.length];

        b=a;

        System.out.println(" kết quả sao chép mảng");

        for(int i=0; i<a.length;i++){
            System.out.println("a[" + i + "]: " + a[i] + " ");
        }

        for(int i=0; i<b.length;i++){
            System.out.println("b[" + i + "]: " + b[i]);
        }*/
        //===> như vậy là ta đã tiến hành copy dữ liệu qua lại giữa hai mảng





        // Phương pháp copy 2 với clone (ưu tiên sài)
       /* int a[] = {1, 8, 3};

        int b[] = a.clone();


        System.out.println(" kết quả sao chép mảng");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]: " + a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]: " + b[i]);
        }*/




        //Phương pháp 03 copy mảng với arraycopy
        /*int a[] ={1,8,3};

        int b[] = new int [a.length];


         System.arraycopy(a,0,b,0,3);
         // nghĩa là copy tính từ vtri 0 của a sang vtri 0 của b và có đúng 3 pt như dậy.


        System.out.println(" kết quả sao chép mảng");

        for(int i=0; i<a.length;i++){
            System.out.println("a[" + i + "]: " + a[i] + " ");
        }

        System.out.println();

        for(int i=0; i<b.length;i++){
            System.out.println("b[" + i + "]: " + b[i]);
        }*/




        // Phương pháp copy mảng thứ 4 opyof()
      /*  int a[] = {1, 8, 3};

        int b[] = Arrays.copyOf(a, 3);
        // copy từ mảng a có 3 phần tử


        System.out.println(" kết quả sao chép mảng");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]: " + a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]: " + b[i]);
        }
*/



        //Phương pháp 05 copy ảng với copyRange()

        int a[] = {1, 8, 3, 5, 6, 8};

        int b[] = Arrays.copyOfRange(a,2,6);
        /* với copyRange nghĩa là xác định mảng copy từ a vị trí ở mảng a[2] tức vị trí 3
        * và số lương mảng a có 6 pt đc khai báo trc đó
        * kw là từ vtri 3 thì lấy ra đc copy là 3 5 6 8
        * */


        System.out.println(" kết quả sao chép mảng");

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]: " + a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "]: " + b[i]);
        }

        /*===> ưu tiên phương pháp 02 clone() nếu như mún copy đầy đủ bt
        *  và phương pháp 05 Arrays.copyRange() để copy vị tri mong muốn
        * */
    }
}
