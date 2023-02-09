package ham_Instancesof;
// ta tiến hành khám xem các subclass thuocj class nào thông qua toán tử kiểm tra một đối tượng Instanceof
public class texter {
    public static void main(String[] args) {

        String h;
        Dongvat dv = new Dongvat();
        dog d = new dog();
        meo m = new meo();


        // để kiểm tra xem các lớp trên có thuộc class đã xây dựng ta dùng Instanceof đ kiemtra
        if (dv instanceof Dongvat) {
            System.out.println("dv thuộc class Dongvat");
        }
        if (d instanceof dog) {
            System.out.println("d là thuộc class dog");
        }
        if (m instanceof meo) {
            System.out.println("m là thuộc class meo");
        }

    }

}
