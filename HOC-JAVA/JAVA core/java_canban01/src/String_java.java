import java.util.Locale;

/*tìm hiểu vè hàm String chi tiết trong java*/
public class String_java {
    public static  void main(String[] args){
            String abc =" chuỗi 1 nỗi vói ";
            abc =abc.concat("chuỗi 2");
            System.out.println(abc);

            // tuy nhiên lưu ý với cách nối chuỗi concat cùng tồn động nhiều hàn chế nên dùng toán tử nối +

           char c= abc.charAt(2);
           // lấy ký tự mong  muốn
           System.out.println(c);;
           //đo độ dài các ký tự
           System.out.println(abc.length());


           // tìm hiểu về indexOf()
             String a = "123456789";
             String search = "2";
             //muốn tiềm kiếm xem ở hàm search có value là 2 nó năm ở vtri nào trên chuỗi lớn a.
             System.out.println("vtri của 2 tren chuỗi a: " + a.indexOf(search));


             // dùng hàm trim cắt khoản trắng chuỗi
            String b =" Hữu phúc ";
            System.out.println(b.trim());
            // biến in hoa thành chữ in thường, cái nào in thường rồi thì giữ nguyên
            System.out.println(b.toLowerCase());
            // biến in thường thành in hoa, chữ nào đg in hoa giữ nguyên
            System.out.println(b.toUpperCase());



            // tiềm hiểu về chuỗi replace
        String s1 = " tao là chuỗi s1" ;
        String s2 = "tao là chuỗi s1".replace("tao", "Tôi");
        System.out.println("thayđổi: " + s2);

        //cắt chuỗi subString
        String u="tôi là người máy";
        u="tôi là người máy".substring(4,12);
        System.out.println(u);



         /* với ham plit sẽ loại bỏ các phần mong muốn ra khỏi chuỗi # với substring là cắt lấy
       chuỗi mong muốn
        */

        String h1 ="123456789";
        String [] h2 = h1.split("34");
        for(String h: h2){
            System.out.println(h);
        }
    }
}
