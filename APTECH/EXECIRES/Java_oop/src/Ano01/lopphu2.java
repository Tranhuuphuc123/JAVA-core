package Ano01;


public class lopphu2 extends  lopphu1{

    public lopphu2(String name, int tuoi) {
        
        super(name, tuoi);
    }

    @Override
    public void printname(){

        System.out.println(" tên của tôi: " + this.name);
    }

    @Deprecated
    public void printtuoi(){
        System.out.println(" tuoi: " + this.tuoi);
    }

}
