package Cacdanghienthi;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/*trong java có nhiều cách thiển thị số: int, float, double...
* trong phần nay ta sẽ hiển thị số theo một cach nâng cao với Numberformat
* tùy chỉnh nhiều dạng hiển thị các ố nguyên, thập phân... theo ý mún
* */
public class Danghienthiso {
    public static void main(String[] args) {
        long l = 123456789;
        double k = 1234567.890123;

        // định dạng kiểu chữ  theo kiểu quốc gia với locale
        Locale lc = new Locale("vi","VN");
        // dùng numberforrmat để định dạng số theo yêu cầu/ dùng getInstacne để lấy kiểu chữ theo mã quốc gia
        NumberFormat format = NumberFormat.getInstance(lc);

        /* dùng setMaximumFractionDigits để gới số số hiển thị sau dấu thập phân( đây là sau đấu ',')
        * dùng setMinimumFractionsDigits để giới hạn số hiển thị thập phân tối thiểu cần có
        * */
        format.setMaximumFractionDigits(1);
        format.setMinimumFractionDigits(0);

        /*
        * tg t giới ha số phần nguyên hiển thị giới hạn bao nhiêu vối setMax/minIntergerDigits
        * lưu ý với setMax/min.. của 2 loại nó thg lầy theo tt từ đích lên từ phải qua trái
        * */

        format.setMaximumIntegerDigits(9);

        // làm tròn số với hàm setRoundingMode
        /*
        * RoundingMode.HALF_UP: làm tròn lên 1 sô(>5 thì làm tròn lên 1 số)
        * RoundingMode.CEILING: làm tròn số lên
        * RoundingMode.FLOOR: làm tròn số xuống
        * RoundingMode.HALF_DOWN: làm tròn số xuônống 0.5
        * RoundingMode.HALF_EVEN: làm tròn đến giá trị cẵn gần nhất
        * */
        format.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println(format.format(l));
        System.out.println(format.format(k));
        //--> kww: phần ngàn theo kiểu vn: là dấu '.' phần thập phân là dấu ','





        System.out.println("---------------cách 02 với Decimalforrmat----------------");
        //----------------------Cách 02 định dạng với Decimalformat------------------------------




        // tạo kiểu mẫu định dạng số
        String pattern ="###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        //decimaleformat theo locale định danh theo chuẩn số chữ quốc gia
        // lưu ý dung cách này cần ép kiểu sang Decimalforrmat
       decimalFormat =(DecimalFormat) DecimalFormat.getInstance(lc);

        // định max/min hiển thị giới hạn với setMaxx/min với Decimalformat
        decimalFormat.setMaximumFractionDigits(4);
        decimalFormat.setMinimumFractionDigits(0);

        decimalFormat.setMaximumIntegerDigits(9);

        // làm tròn với setRoundingMode

        // cách thay đổi dấu hiển thị phần ngàn thành '-', thp phân là dấu ,
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        // thay đổi dấu phần ngàn thành '_'
        decimalFormatSymbols.setGroupingSeparator('_');
        // thay đổi dấu thaahp phân thành ','
        decimalFormatSymbols.setDecimalSeparator(',');
        // thực thi thay đổi
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);



        System.out.println(decimalFormat.format(l));
        System.out.println(decimalFormat.format(k));

    }
}
