import java.util.Scanner;
public class cacpheptoan {
	public static void main(String[] args) {
		
		Scanner phepToan = new Scanner(System.in);
		
		int a,b;
		System.out.println("nhap vao gia tri a: ");
         a = phepToan.nextInt();
		
		System.out.println("nhap vao gia tri b: ");
		b = phepToan.nextInt();
		
		int tong = a+b;
		int hieu =a-b;
		int tich = a*b;
		float thuong = (float)a/b;// khai bao ep kieu tuong minh, vi phep chia có lấy phần dư
		int soDu = a%b;
		
		System.out.println( "tong phep tinh: "+ a +"+"+ b+ "=" + tong);
		System.out.println( "hieu phep tinh: "+ a +"-"+ b+ "=" + hieu);
		System.out.println( "tich phep tinh: "+ a +"*"+ b+ "=" + tich);
		System.out.println( "thuong phep tinh: "+ a +"/"+ b+ "=" + thuong);
		System.out.println( "phep tinh so du: "+ a +"%"+ b+ "=" + soDu);
	}
}
