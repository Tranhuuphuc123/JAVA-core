package baiftap_quanly_film;
/*thông tin ngày tháng năm của lịch chiếu một bộ phim*/

import java.util.Scanner;

public class myDate {
    private int day;
    private int month;
    private int year;

    public myDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public myDate(){
        // hàm rỗng để nhập dữ liệu ở hàm mmain

    }

    // phuong thức setter abnd getter


    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // xây dwungj method thực thi nhập thông tin ngày tháng năm
}
