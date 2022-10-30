/*tiềm hiểu nâng cao với mảng, Arraylist, list*/
import java.util.Scanner;
public class mang_Arraylist_list {
    public static void main(String[] args){
        //ôn tí về pg thức xây dựng mảng: y/c nhập số pt mảng từ bàn phím và xuất tổng mảng
        Scanner sc = new Scanner(System.in);


        System.out.println("nhập phần tử n mảng vào: ");
        int n=sc.nextInt();

        int arr[] = new int[n];

        System.out.println("------------------------------");

        for(int i=0; i<n; i++){
            System.out.println("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("-----------------------------");

        int total = 0;

        for(int i = 0; i<n;i++){
            total += arr[i];
        }

        System.out.println(" total: " + total);

    }
}
