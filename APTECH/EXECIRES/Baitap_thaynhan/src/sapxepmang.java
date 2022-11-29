
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class sapxepmang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhập vào n phần tử");
        n= sc.nextInt();


        int arr[] =  new int[n];

        for(int i =0; i<n; i++){
            System.out.println("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int x: arr){
            System.out.println(x);
        }



    }
}
