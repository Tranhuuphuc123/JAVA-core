package baitap_abstract;
// hàm main thực thi ứng dụng

public class text {
    public static void main(String[] args){
        xedap pt1 = new xedap();
        pt1.nhap_xedap();

        System.out.println("-----------------------------------");

        oto pt2 = new oto();
        pt2.nhap_oto();

        System.out.println("-----------------------------------");


        System.out.println("tt xe đạp: " + pt1.toString());
        System.out.println("hãng sx: " + pt1.laytenhangsanxuat());
        System.out.println("-----------------------------------");
        System.out.println("tt xe oto: " + pt2.toString());
        System.out.println("hãng sx: " + pt2.laytenhangsanxuat());

    }
}
