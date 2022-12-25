package loptruutuong_abstract;
// lớp toadoa bao gồm giá trị x, y

import java.util.Scanner;
public class toado {
    private int x;
    private int y;

    // contructor


    public toado(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public toado(){

    }

    //get and set


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



    // method
    public void nhaptoado(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enther the x: ");
        x = sc.nextInt();
        System.out.println("enther the y: ");
        y = sc.nextInt();
    }




}
