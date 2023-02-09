package tinhdahinh;
// lớp cha
public class person {
    private String ten;

    //contructor

    public person() {
    }

    // get and set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

   //method lơp cha person
    public void thongtin(){
        System.out.println("đây là lớp cha");
    }

}
