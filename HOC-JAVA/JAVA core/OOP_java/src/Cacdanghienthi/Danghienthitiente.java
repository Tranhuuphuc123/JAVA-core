package Cacdanghienthi;
/*cùng tiềm hiểu cách hiên thị tiền tệ trong java
* định dạng theo quốc gia...
* */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Danghienthitiente {
    public static void main(String[] args) {
        double l = 123456789.67;

        // định dạng theo chuân rvieetj nam/ có thể thay đổi
        Locale lc = new Locale("vi", "VN");

        // lấy kiểu tiền tệ theo quốc gia vowis getCurrencyInstance
        NumberFormat format = NumberFormat.getCurrencyInstance(lc);

        // lấy sl hiển thị sau dấu thập phân
        format.setMaximumFractionDigits(4);
        format.setMinimumFractionDigits(0);

        // lấy sl hiên thị phần nguyên
        format.setMaximumIntegerDigits(9);

        // làm tròn
        format.setRoundingMode(RoundingMode.HALF_UP);

        // thay đổi kiểu mặc định tiền vn là đ thành vnd


        System.out.println(format.format(l));


        System.out.println("-------------cách 02-------------");
        //-----------có thể dùng cách 02 phần ới Decimalformat tg tự kiểu hiển thị số
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat =(DecimalFormat) DecimalFormat.getCurrencyInstance(lc);


        // đổi dấu ngàn '.' thành '_'
        DecimalFormatSymbols dcs = new DecimalFormatSymbols();
        dcs.setGroupingSeparator('_');
        // đổi mặc điịnh hiển thị tiền tệ quốc gia theo ý muốn
        dcs.setCurrencySymbol("vnd");

        // add vào định dạng hiển thị decimalformat
        decimalFormat.setDecimalFormatSymbols(dcs);

        System.out.println(decimalFormat.format(l));

    }
}
