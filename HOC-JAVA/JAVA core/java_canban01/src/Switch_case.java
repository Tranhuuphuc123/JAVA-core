/* tiềm hiểu về Switch_case trong java*/

// bài tập đơn giản về switch_case
/*import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int thu;

        System.out.println("enter the day: ");
        thu = sc.nextInt();

        switch(thu){
            case 1:
                 System.out.println(" ngày thứ 2");
                 break;
            case 2:
                System.out.println(" ngày thứ 3");
                break;
            case 3:
                System.out.println(" ngày thứ 4");
                break;
            case 4:
                System.out.println(" ngày thứ 5");
                break;
            case 5:
                System.out.println(" ngày thứ 6");
                break;
            default:
                System.out.println("th khong có trong lap trinh");
        }

    }
}*/


// tiềm hiểu về lệnh Switch case thông qua bài tập tìm ngày tháng năm
import java.util.Scanner;

public class Switch_case {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);

         int year, month;
         System.out.println("enter the year");
         year=sc.nextInt();
        System.out.println("enter the month");
         month=sc.nextInt();
         
         switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                 System.out.println("thang nam co 31 ngay");
                 break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" thang nam co 30 ngay");
                break;

            case 2:
                 if((year%4==0 && year%100 !=0) || (year%400==0)){
                     System.out.println("thang 2 co 29 ngay");
                 }else{
                     System.out.println("thang 2 co 28 ngay");
                 }
                 break;
             default:
                 System.out.println("th nay khong co hop le nha");
        
         }


    }
}
