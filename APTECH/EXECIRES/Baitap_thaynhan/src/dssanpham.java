import java.util.Scanner;

public class dssanpham {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int gia;

    public dssanpham(String name, int gia) {
        this.name = name;
        this.gia = gia;

    }
    public dssanpham(){

    }

    public void nhapdl(){
        System.out.println(" nhập  tên sản phẩm: ");
        name = sc.nextLine();
        System.out.println("nhap gia san pham: ");;
        gia = sc.nextInt();
    }



    public String getName() {
        return this.name;
    }



    public int getGia() {
        return this.gia;
    }

    @Override
    public String toString(){
        return  this.name + " " + this.gia;
    }
}
