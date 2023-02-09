package hascode_equals;
/* tiềm hểu về phương thức equals và hascode trong java oop*/
// hàm chính text kết quả


public class equals_hascode {
    public static void main(String[] args){
        // gọi lớp con ra
        lopphu_equals_hascode a1 = new lopphu_equals_hascode(12,5,1995);
        lopphu_equals_hascode a2 = new lopphu_equals_hascode(11,9,1993);
        lopphu_equals_hascode a3 = new lopphu_equals_hascode(12,5,1995);

        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);


        // sử dụng so sánh Object của class xây dựng bằng method equals
        System.out.println("a1 so sanh bang a2: "
                + a1.equals(a2));

        System.out.println("a1 so sanh bang a3: "
                + a1.equals(a3));


        // sử dụng phương thức hascode, hascode còn tiềm hiểu thêm?
        System.out.println("a1 hascode: " + a1.hashCode());



    }

}
