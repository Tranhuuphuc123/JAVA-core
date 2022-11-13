package to_String;
/*tìm hiểu lại bài tập Mydate ở bài setter and getter*/
public class to_String {
    private int day;
    private int month;
    private int year;


    // khởi tạo contructor
    public to_String(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
        if (year >= 1) {
            this.year = year;
        } else {
            this.year = 1;
        }

        /* tạo setter and getter để return kiểu dữ liệu và đặt biến một cách thoải mái thuận tiện
         * mục tiêu của lập trình hg đối tượng là không cho người dùng nhập dữ liệu tùy
         * ý mà không có kiểm tra với getter và setter nó sẽ tiện lợi hơn trong việc quản lý
         * giá trị value khi truyền vào tt từ setter*/


    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int d) {
        if (d >= 1 && d <= 31) {
            this.day = d;
        }
    }
    /*lưu ý rằng khi thiết lập đk khi khởi tạo với contructor ở trên thì cũng thiết lập
     * y như vậy ở setter nơi thiết lập value tu biến, nghĩa là nếu đk if đúng thì
     * giá trị đó ở setter có thể đặt biến thay thế tùy biên, vd: day nếu đk trong khoảng
     * 1-31 thì nó cũng xét đk tử setter và gán giá trị đặt ở setter thay thế cho value ở contructor
     * còn sai thì quay về giá trị contructor, đăắt value truyền vào contructor là 31, thiết
     * lập setDay(25), 25 thỏa đk thì ghe đè 25 thay ngày 31, nếu setDay(35), sai đkif
     * thì quay về value truyền vào contructor trc đó là 31*/


    public int getMonth() {
        return this.month;
    }

    public void setMonth(int m) {
        if (m >= 1 && m <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int y) {

        if (y >= 1) {
            this.year = y;
        }
    }


    // vài trò của toString trong java()
   @Override // pt ghi ddef timf hieeur been baif Annotation in java
    public String toString(){
       return this.day + "/" + this.month + "/" + this.year;
   }
}
