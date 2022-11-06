package baitap_class;
// lớp coffee đc xây dựng riêng
/*phân tích các đối tượng cụ thể
* Object:
*  - tên coffe (kiểu String)
*  - giá tiền (kiểu double)
*  - khối lượng
*
*
* ===> method chỉ print thì không cần trả veef dùng void
* ===> nếu method có trả về đây chủ yếu là money nên nhớ cần có kiểu trả về
*
* ###method thực thi:
*    - tổng tiền = khối lượng * giá tiền (kiểu trả về double v dính đến tiền)
* */

public class lopcoffee {

    private String tenloai;
    private double giatien;
    private double khoiluong;


    // khởi tạo contructor cho datamember Object
    public lopcoffee(String tl, double gia, double kl){
        this.tenloai = tl;
        this.giatien = gia;
        this.khoiluong = kl;

        /* lưu ý các kiểu String tl.. double kl thì là các tên tl, gia , kl
        * thực chất là tên datamember Object đc tham chiếu ở trong hàm main tức
        * là các Object đc khởi tạo bên lớp riêng đc tham chiếu qua hàm main bằng
        * các tên biến này.. và khi vào hàm main thì những tên biến này là nơi để
        * truyền tham số value vào và lk với nhau để giá trị Object khởi tạo bên
        * lớp riêng đc liên kết và nhận giá trị truyền vào từ hàm main
        * vì vậy bước khởi tạo Object contrutor có ý nghĩa cụ thể là như vậy*/
    }



    // method khối lệnh thực thi một chức năng cụ tể của Object khởi tạo

    public double tinhtongtien(){
       return this.giatien * this.khoiluong;
    }


    // tạo method kiểm tra kl có lớn hơn giá trị cần ktr haykhông

    public boolean kiemtrakhoiluong(double kl){
//        if(this.khoiluong>kl){
//            return true;
//        }else{
//            return false;
//        }
        // có thể viết chuyên nghiệp hơn

        return this.khoiluong>kl;
    }

}
