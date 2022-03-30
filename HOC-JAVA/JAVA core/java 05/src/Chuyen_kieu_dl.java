public class Chuyen_kieu_dl{
	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		// xuat ket qua ra binh thuong
		System.out.println("gia tri bien a: "+a);
		System.out.println("gia tri bien b:"+b);
		
		// khai bao ep kieu float cho int de gia tri bien float bang gia tri bien kieu int
		// khai bao kieu ngam dinh
		float c =a;
		float d =b;
		
		System.out.println("\n");
		System.out.println("----ep kieu ngam dinh-------\n");
		
		System.out.println("gia tri ep kieu float c="+c);
		System.out.println("gia tri ep kieu float d= "+d);
		
		// khai bao ep kieu tuong minh nham ep kieu float voi gia tri thap phan sang kieu int 
		// co gia tri lam tron
		
		
		System.out.println("\n");
		System.out.println("----gia tri bt cua kieu float trc khi ep kieu-------\n");
		
		float e = 10.3546f;
		float f = 20.3564f;
		
		System.out.println(" gia tri binh thuong cua e: "+e);
		System.out.println(" gia tri binh thuong cua f: "+f);
		
		// ep kieu tuong minh xuat ket qua
		
		System.out.println("\n");
		System.out.println("----ep kieu tuong minh-------\n");
		
		int g =(int)e;
		int h =(int)f;
		
		System.out.println("gia tri ep kieu tuong minh g= "+g);
		System.out.println(" gia tri ep kieu tuong minh h= "+h);
		
		// ep kieu qua lai giua bien nguyen thuy va doi tuong
		System.out.println("\n");
		System.out.println("----ep kieu qua lai giua bien nguyen thuy va doi tuong-------\n");
		
		int x =new Integer(32);
		System.out.println(" gia tri x: "+x);

	}
}
