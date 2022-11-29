
import java.util.Scanner;
public class manggiatri {
    /*thực hiện bài tập mảng giá trị nhp và xuất kết quả mảng ra màn hình*/
    public static void main(String[] args){
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        n= sc.nextInt();


        int arr[] = new int[n];

        // tiến hành nhập mảng
        for(int i=0; i<n;i++){
            System.out.println("Arr[" + i + "]: " );
            arr[i] = sc.nextInt();
        }

        // tiến hành xuất giá trị mảng
         int min =0;
        System.out.println("=====================================");;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("-------------------------------" +"\n");

        // xuất kết quả tăng dân
        tangdan(arr);
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }


        System.out.println("-------------------------------" +"\n");


        // xuất kết quả giảm dần
        giamdan(arr);
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }


    // xây dựng funton giảm dần

    public static void tangdan(int arr[]){
        int temp = arr[0];
        for(int i=0; i<arr.length - 1;i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    // funtion giảm dần
    public static void giamdan(int arr[]){
        int temp = arr[0];
        for(int i=0; i<arr.length - 1;i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }



}
