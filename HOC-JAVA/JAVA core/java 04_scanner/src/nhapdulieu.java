import java.util.Scanner;/* note:khai bao thu vien de ho tro cho lop scanner
							neu khong co import thi lop scanner khong hoat dong*/

public class nhapdulieu {
	public static void main(String[] args) {
		Scanner nhapVaXuat = new Scanner(System.in);// note: khai bao ten lop scanner

		System.out.println("nhap vao ten ho cua ban: ");
		String tenHo = nhapVaXuat.nextLine();// note: gang ten bien vao lop scanner

		System.out.println("nhap MSSV cua ban: ");
		long mssv = nhapVaXuat.nextLong();

		System.out.println("nhap vao diem thi cua ban: ");
		float diemThi = nhapVaXuat.nextFloat();

		// note: xuat ra cac gia tri nhap tu scanner
		System.out.println("-----------------------");
		System.out.println("ho va ten:" + tenHo);
		System.out.println("ma so sinh vien cua ban la: " + mssv);
		System.out.println("diem thi cui ky la: " + diemThi);
	}

}