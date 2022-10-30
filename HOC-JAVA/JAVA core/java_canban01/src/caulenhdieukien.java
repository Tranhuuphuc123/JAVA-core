
/* cùng tìm hiêủ câu lệnh điều kiện cơ bnr trong java thông qua 2  bt phgtrinh bac nhất và bậc 2*/


// giải pt bậc nhất
/*
import java.util.Scanner;

public class caulenhdieukien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("enter the a num: ");
        a =sc.nextInt();
        System.out.println("enter the b num: ");
        b =sc.nextInt();

        if(a==0){
            if(b==0){
                System.out.println(" phuong trinh co vo so nghiem");
            }else{
                System.out.println("phuong trinh vo nghiem");
            }
      }else{
            int x= -b/a;
            System.out.println(" ph bac nhat co nghiem: x=-b/a: " + x);
        }
    }
}

 */



// phuơng trinh bậc 2

//==> lưu ý đối với các hàm toán học trong ja va nhớ cần có math.

import java.util.Scanner;

public class caulenhdieukien{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a, b,c, x1, x2, delta;

     
        System.out.println("enter the num a: ");
        a=sc.nextInt();
        System.out.println("enter the num b: ");
        b=sc.nextInt();
        System.out.println("enter the num c: ");
        c=sc.nextInt();

        delta=Math.pow(b,2)-(4*a*c);

        if(a==0){
            System.out.println("loi du lieu nha");
        }else{
            if(delta<0){
                System.out.println(" phương trinh vo nghiem nha ni");
            }else if(delta==0){
                x1=x2=-b/(2*a);
                System.out.println("PT co nghiem kep x1=x2=-b/2a: " + x1);
            }else if(delta>0){
                x1=(-b-Math.sqrt(delta))/(2*a);
                x2=(-b+Math.sqrt(delta))/(2*a);
                System.out.println("pt co 2 nghiem");
                System.out.println("Pt co nghiem kep: x1: " + x1);
                System.out.println("Pt co nghiem kep: x2: " + x2);
            }
        }

    }
}



