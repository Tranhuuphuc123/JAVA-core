package loptruutuong_abstract;
// hàm main kiểm tra code
/*nội dung của bài là tạo lớp trừu tượng  và cách thức triển khai sử dụng nó , ta sẽ tạo ra một lớp toado bao
* gồm lớp abstract, tien hanh thưc thi lớp abtract trong các các ớp thừa kế*/

// thứ tự các file: todoa-hinh-diem-hinhtron-hinhchunhat-text

public class text {
    public static void main(String[] args)
    {
        System.out.println("nhập tọa độ 1:");
        toado td1 =new toado();
        td1.nhaptoado();

        System.out.println("nhập tọa độ 2:");
        toado td2 = new toado();
        td2.nhaptoado();

        System.out.println("nhập tọa độ 3:");
        toado td3 = new toado();
        td3.nhaptoado();

        hinh h1 = new diem(td1);
        hinh h2 = new hinhtron(td2, 5);
        hinh h3 = new hinhchunhat(td3, 4,3);

        // xuất thông tin

        System.out.println("tọa độ điểm: " + h1.tinhdientich());
        System.out.println(" diện tích hình tròn: " + h2.tinhdientich());
        System.out.println("diện tích hcn: " + h3.tinhdientich());
    }
}
