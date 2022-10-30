// phần thực hiện chuỗi nâng cao với mảng chuỗi hỗn hợp String builder và String buffer

public class String_nangcao {
    public static void main(String[] args){

        // 01/ Phương thức appen nối chuỗi trong Stringbuilder, Stringbuffer
        StringBuilder b = new StringBuilder();
        b.append("hello");
        b.append("Java");

        System.out.println(b.toString());
        //===> in ra hello java





        //02_ tìm hiểu phương thức insert() trong Stringbuilder, Stringbuffer
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        System.out.println(sb.toString());

        //===> lúc này ở vtri 1 sẽ chèn chữ java vào vtri 1 Hello thành  HJavaello





        //03_ phương thức replace trong Stringbuilder, Stringbuffer

            StringBuffer sb1=new StringBuffer("Hello");
            sb1.replace(1,3, "Java");
            System.out.println(sb1);


        //04_ phương thức delete trong StringBuilder, Stringbuffer

        StringBuilder a1 = new StringBuilder("Hello");
        System.out.println(a1.delete(1,3));


        //05_Phương thức Reserve() phương thức đảo chuỗi
        StringBuffer a = new StringBuffer("Hữu Phúc");
        System.out.println(a.reverse());
    }
}
