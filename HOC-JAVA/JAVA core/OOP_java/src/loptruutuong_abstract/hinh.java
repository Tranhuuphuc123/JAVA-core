package loptruutuong_abstract;
// khởi tạo lớp trừu tượng
public abstract class hinh {
   protected  toado toa_do;

   // contructor

    public hinh(toado toa_do) {
        this.toa_do = toa_do;
    }


    // get and set


    public toado getToa_do() {
        return toa_do;
    }

    public void setToa_do(toado toa_do) {
        this.toa_do = toa_do;
    }


    // method abbstract, lưu ý metod của abstract thì không cấn nd thực thi
    public abstract double tinhdientich();


}
