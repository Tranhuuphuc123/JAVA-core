package java08;
import java.util.Scanner;
public class vidu {
	public static void main(String[] args) {
			Scanner maHoa = new Scanner(System.in);
			
			int a,b;
			
			System.out.println("nhap gia tri a: ");
			a = maHoa.nextInt();
			System.out.println("nhap gia tri b: ");
			b =  maHoa.nextInt();
			
			System.out.println("--------------");
			System.out.println("so sanh phep ==: "+a+"=="+b+ "thi ket qua la: "+(a==b));
			
		}

}
