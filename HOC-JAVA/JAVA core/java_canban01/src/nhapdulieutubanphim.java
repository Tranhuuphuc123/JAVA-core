
import java.util.Scanner; // Phần khai báo thư viện cho lớp scanner
public class nhapdulieutubanphim {

    // tìm hiểu cách nhập dữ liệu yhoong qua lớp scanner
    public static void main(String[] args){
       Scanner Scan = new Scanner(System.in);

       System.out.println("nhap vao ten cua ban: ");
       String hovaten = Scan.nextLine();

       System.out.println("nhap vao tuoi cua ban: ");
       int tuoi=Scan.nextInt();

       System.out.println("nhap vao mssv cua ban: ");
       int mssv = Scan.nextInt();

       System.out.println("nhap vao lop cua ban: ");
       String malop = Scan.nextLine();



       System.out.println("--------------------------------");

       System.out.println(" ten cua ban: " + hovaten);
       System.out.println(" tuoi cua ban: " + tuoi);
       System.out.println("mssv la: " + mssv);
       System.out.println("lop cua ban: " + malop);


    }
}
