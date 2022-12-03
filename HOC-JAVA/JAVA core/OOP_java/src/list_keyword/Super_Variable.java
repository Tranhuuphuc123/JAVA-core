package list_keyword;
// tìm hiểu về các keyword thng dụng trong java: bài đầu nói về keyword super()
// do ví dụ minh họa nagwns nên ta sẽ tạo các class ngay trong môt file package .java

// khởi tạo ột lớp tocdo1
 class tocdo1{
    int speed = 120;
}

// khởi tạo tocdo2 thua ke toc do1
 class tocdo2 extends  tocdo1{
    int speed=200;
    // xây dựng method hiê hị
    public void hienthi(){
        System.out.println("tốc độ hiển thị thừa kế: " + super.speed);
    }
}





// text thử trong hàm main
public class Super_Variable {
     public static void main(String[] args){
         // sử dụng super với  các Variable biến để xem kết quả ntn
         tocdo2 a = new tocdo2();

        a.hienthi();

        /*--> kww: 120 đơn giản do class tocdo2 nó thừa kế từ tocdo1 nên nó sẽ lấy giá trị speed của tocdo1 để hiển thi do tính
         kế thừa super gây ra. */
     }
}
