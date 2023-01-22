package Get_Set;
/*
* trong bài hôm nay mình sẽ tiềm hiểu về phương thức Get and Set trong lập trinnh OOP*/


public class phuognthuc_get_set {

    /*tạo lớp Phuongthuc, để khai báo getter and seter*/
     private int day;
     private int month;
     private int year;


     // khởi tạo contructor kèm đk đầu vào

    public phuognthuc_get_set(int day, int month, int year) {
        // đặt đk để ngày nhập vào phải l ngay 1 -> 31 nếu nhập quá phạm vi thì default là 1
        if(day>=1 && day<=31) {
            this.day = day;
        }else{
            this.day =1;
        }
        // tương tự các k cho month and year để đa bảo quá trình truyền đúng dữ liệu, không nhp quá phạm vi
        if(month >=1 && month<=12){
          this.month = month;
        }else{
            this.month = 1;
        }

        if(year>=1){
          this.year = year;
        }else{
            this.year = 1;
        }
    }

    /* xây dựng pt getter and setter thay cho method thông thường
    * mục tiêu là getter and setter sẽ đảm bảo quá trình truyền dữ liệu có tính kiểm
    * tra ổn định và không cho truyền quá giá trị pham vi định nghĩa, tức là pt getter
    * and setter cung cấp cho bạn sự tiện lợi khi nhập giá trị của các biến thuộc
    * bất kỳ kiểu dữ liệu nào theo yêu cầu của mã.  Điều này tốt hơn nhiều so với
    * việc cập nhật biến số trực tiếp. Và nó chi tiết hơn là xây dựng method chỉ
    * Sysout bình thường*/

    //==> để xây dựng getter and setter có thể viết tay or bấm Alt + Ins> getter and setter


    // xÂy dựng pt getter để return về kiểu dữ liệu khái báo ban đầu
    public int getDay(){
        return this.day;
    }
    // xây dựng setter để đặt hoặc cập nhật giá trị (bộ đột biến)
    public void setDay(int d) {
        if (d >= 1 && d <= 31) {
            this.day = d;
        }

    }
      // xây dựng các cặp setter và getter tg trự cho từng data member
       public int getMonth(){
            return this.month;
        }

        public void setMonth(int m){
           if(m>=1 && m<=12){
               this.month = m;
           }
        }

        // xây dựng getter và setter cho datamember 3


        public int getYear() {
            return this.year;
        }

        public void setYear(int y) {
            if(y>=1){
                this.year = y;
            }
        }




}





