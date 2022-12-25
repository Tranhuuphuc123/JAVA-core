package Interface_giaodien;

import java.util.Scanner;
public class sapxepchen implements sapxep{


    @Override
    public void sapxeptang(double [] arr){
        double temp = arr[0];
        int i,j;
        for( i =0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void sapxepgiam (double [] arr){
        double temp = arr[0];
        int i,j;
        for( i =0; i<arr.length-1;i++){
            for(j=i+1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
