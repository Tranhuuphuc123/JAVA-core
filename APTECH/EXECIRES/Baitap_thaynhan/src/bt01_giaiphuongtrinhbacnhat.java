


import java.util.Scanner;
public class bt01_giaiphuongtrinhbacnhat {
    // giải phương trình bậc nhât


    // xây dựng phương thức
    public static void menu(){
            Scanner sc = new Scanner(System.in);

            int a, b;

            System.out.println("enter the number a: ");
            a = sc.nextInt();
            System.out.println("enter the number b: ");
            b = sc.nextInt();


            // giải pt bâ nhất

          if(a==0){
              if(b==0){
                  System.out.print(" Pt co vo so nghiem " + "\n");
              }else{
                  System.out.print(" pt vô nghiệm " + "\n");
              }

          }else{
              int nghiem = -b/a;
              System.out.println(" pt co mot nghiem: " + "nghiem = " + "-" + b + "/" + a + "=" + nghiem );
          }
    }
}
