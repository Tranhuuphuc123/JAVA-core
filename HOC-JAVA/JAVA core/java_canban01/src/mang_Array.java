
/*tiềm hiểu về mảng Array trong java*/


public class mang_Array {
    public static void main(String[] args){
        // amngr 01 chiều
        // cách 01_01: khai báo mảng theo kiểu tinh gọn, liệt kê chi tiết các giá trị  vào mảng

        
    /*    int [] myArray = new int [] {10,20,30,40,60,70,50,30,50,10};
        for(int i=0;i<myArray.length; i++){
            // lenght dùng để đo đến chiều dài phần tử mảng đã khai báo ở đây là 10 pt (0->9)
            System.out.println("myArray [" + i + "]" + ":" + myArray[i]);
        }
*/






        // cách 01_02: hoặc có thể viết theo kiểu đơn giản tinh gọn như sau:
        
       /* int [] myArray = {10,20,30,40,60,70,50,30,50,10};
        for(int i=0;i<myArray.length; i++){
            // lenght dùng để đo đến chiều dài phần tử mảng đã khai báo ở đây là 10 pt (0->9)
            System.out.println("myArray [" + i + "]" + ":" + myArray[i]);
        }*/




        // cách 02: khai báo kiểu  đưa ra cụ thể giới hạn pt biết trước tường minh
        
      /*  int [] myArray = new int [4];
        myArray[0] = 10;
        myArray[1] = 60;
        myArray[2] = 20;
        myArray[3] = 100;

        for(int i=0;i<myArray.length; i++){
            // lenght dùng để đo đến chiều dài phần tử mảng đã khai báo ở đây là 4 pt (0->3)
            System.out.println("myArray [" + i + "]" + ":" + myArray[i]);
        }*/
        //==> kiểu khai báo cách 02 khá rườn rà và không nhanh gọn nên không khuyến khích nên dùng cahs 01-02





        // Mảng 2 chiều:
      // cách 01: khai báo tường minh với mảng 2 chiều
     /*
        int [] [] arr = new int [] [] {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}
        };
        for(int i = 0; i< 3; i++){
            for(int j=0; j<4;j++){
                System.out.println(arr[i] [j] + "");

            }
            System.out.println();
        }*/



        /*c2 viết tinh giản lại từ c1*/

        int [][] arr =  {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        // vòng lặp forr bên ngoài đại diện cho số dòng 
        for(int i = 0; i< arr.length; i++){
            // vòng lặp bên trong int j đại diện cho số cột, luôn để số cột < số dòng
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }




        /* tiềm hiểu về mảng răng cưa trong java Jagged array forr java*/






    }
}
