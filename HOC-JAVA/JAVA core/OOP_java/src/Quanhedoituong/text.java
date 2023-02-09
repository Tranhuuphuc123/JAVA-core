package Quanhedoituong;
// hàm kiểm định chất lượng code

/*tt các file:
* 1/dia chi
* 2/person
* 3/nhanvien
* 4/text kiểm định
* */

public class text {
    public static void main(String[] args) {
        nhanvien nv = new nhanvien();
        nv.setName("Trần Hữu Phúc");
        // địa chỉ do không setdc tên dg nên phai gọi lop dia chi lk settenduong
        nv.setDiachi(null);

        Diachi dc = new Diachi();
        dc.setTenduong("Phan văn trị");

        nv.setDiachi(dc);

        System.out.println("tên: " + nv.getName());
        System.out.println("diachi: " + dc.getTenduong());

    }
}
