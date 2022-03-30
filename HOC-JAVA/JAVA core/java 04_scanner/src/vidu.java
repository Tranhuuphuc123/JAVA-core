import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        Scanner hamNhap = new Scanner(System.in);

        System.out.println(" nhap vao ten ho: ");
        String tenHo = hamNhap.nextLine();

        System.out.println("nhap MSSV: ");
        int mssv = hamNhap.nextInt();

        System.out.println("nhap diem thi: ");
        float diemThi = hamNhap.nextFloat();

        System.out.println("-----------------------------------------------------");

        System.out.println("ten ho la: " + tenHo);
        System.out.println("MSSV: " + mssv);
        System.out.println("diem thi la: " + diemThi);

    }
}
