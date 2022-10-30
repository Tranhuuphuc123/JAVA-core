public class Jagged_Array {
    public static void main(String[] args){
        //khởi tạo mảng Jagged Aray mảng răng cưa

        /*int arr[][] = new int[2][];


        arr[0] = new int[3];
        arr[1] = new int[2];


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        System.out.println("====================");

       for(int i = 0; i < arr.length; i++){
           for(int j=0; j<arr[i].length;j++){
               System.out.print(arr [i][j] + " ");
           }
           System.out.println();
       }
*/
        // trong lạp trình java prinln: là in xuống dòng còn print là in không cuống dòng


        /*hình thúc thứ 2 của ảng răng cưa*/

         // khởi tạo biến răng cưa Jagged Array
        int  arr[][] = new int [5][];

        for(int i=0; i<arr.length; i++){
            arr[i] = new int[i+1];
        }


        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        System.out.println("====================");

        for(int i = 0; i < arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }

    }
}
