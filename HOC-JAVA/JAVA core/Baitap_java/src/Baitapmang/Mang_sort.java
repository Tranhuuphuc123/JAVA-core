package Baitapmang;
// sắp xếp mảng

import java.util.Scanner;
public class Mang_sort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("vui long nhap so phan tu mang: ");
        n = sc.nextInt();

        int [] arr = new int[n];

        // nhap tuwng phan tu mang
        for(int i=0; i<arr.length; i++){
            System.out.println("nhap vao phan tu mang arr[" +i+ "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("============================");

        // xuat phan tu mang
        for(int x: arr){
            System.out.print( x + " ");
        }
        System.out.println("\n");
        System.out.println("============================");



        // sap xep phan tu mang tang dan theo cach khac
//       for(int i=0; i<arr.length-1;i++){
//           int temp = arr[i];
//           for(int j=i+1; j<arr.length;j++){
//              if(temp>arr[j]){
//                  arr[i] = arr[j];
//                  arr[j] = temp;
//                  temp = arr[i];
//              }
//           }
//       }
//
//        for(int x: arr){
//            System.out.println(x);
//        }



       System.out.println("gia tri mang tang dan");

       tangdan(arr);
       for(int i=0; i<arr.length;i++){
           System.out.println(arr[i] +" ");
       }


    }



    // xay dung function tang dan
        public static void tangdan(int arr[]){
            int temp = arr[0];
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length;j++){
                    if(arr[i]> arr[j]){
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i]= temp;
                    }
                }
            }
        }
//--> giam dan tg tu



}
