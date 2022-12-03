package list_keyword;
/*tiềm hiểu về tính kế thừa của supper với các pt từ lớp cha và lớp con*/

// xây dựng lớp cha với pt message
class lopcha{
    //method message
    public void message(){
        System.out.println("đây là lớp cha nha");
    }
}


// xây dựng class lopcon với method message y vậy và method hiển thị
   class lopcon extends lopcha{
    //method message y như lớp cha
    public void message(){
        System.out.println("đây là lớp con nha");
    }

    // method display lopcha và lopcon
    public void display(){
        //gọi method message() của lopcon
        message();

        //gọi method messgae cuar lopcha từ lopcon thông qua super
        super.message();
    }
}






// hàm main text đáp án
public class Super_Method {
    public static void main(String[] ars){
        //gọi class lopcon
        lopcon a = new lopcon();

        a.display();

        //--> kw: với message() ở method lopcon sẽ hiển thị nd của message trong lopcon
        //--> kw: với super nó sẽ kế thừa đc nôi dung message của lopcha và hiển thị nd đó trong lớp con
    }
}
