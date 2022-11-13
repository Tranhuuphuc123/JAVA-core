import java.util.Scanner;

public class bt03_menu {
    public  static  void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int chon;
        do
        {
            System.out.println("1. Tính phương trình bậc nhất");
            System.out.println("2. Tính tiền điện ");
            System.out.println(". Exit");
            System.out.println("____________________________");
            System.out.println("Mời chọn lại : ");
            chon=sc.nextInt();
            switch(chon)
            {
                case 1:
                    bt01_giaiphuongtrinhbacnhat b = new bt01_giaiphuongtrinhbacnhat();
                    b.menu();

                case 2:
                    bt02_tinhtiendien c = new bt02_tinhtiendien();
                    c.tinhtiendien();

                case 3:{
                    System.out.println("Ðã thoát!");
                    System.exit(0);
                }
            }
        }
        while(chon!=0);
    }
}
