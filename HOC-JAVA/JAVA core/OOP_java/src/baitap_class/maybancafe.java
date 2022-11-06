package baitap_class;
/*tiềm hiểu chi tiết về phương thức với class trong bài tập làm pm bán cafe để tính toán giá, khối lượng, tên loại cafe
 * tạo một lớp coffee riêng biệt để tính toán và xuất ra thông tin loại cafe giá, kl và tổng tiền đồng thời xuất ra tt
 * của những thông tin đó trong hàm main của pm máy bán cà phê*/

public class maybancafe {
    public static void main(String[] args){
        // gọi class lopcoffee vao hàm main và đặt tên, truyền value cho nó
        lopcoffee cf = new lopcoffee("Cafe trung nguyen", 10000, 1.5);
        System.out.print("tổng tiền là: " + cf.tinhtongtien() + "\n");

        // đặt giả sử mún kiểm tra các giá trị kl xem có lớn hơn 3kg
        System.out.print("kl có lơn hơn 3kg: " + cf.kiemtrakhoiluong(3));
    }
}
