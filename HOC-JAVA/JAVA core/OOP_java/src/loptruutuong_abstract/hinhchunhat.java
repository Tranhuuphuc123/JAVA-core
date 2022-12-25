package loptruutuong_abstract;

public class hinhchunhat extends hinh {
    private double chieudai;
    private double chieucao;
    // contrcutor


    public hinhchunhat(toado toa_do, double chieudai, double chieucao) {
        super(toa_do);
        this.chieudai = chieudai;
        this.chieucao = chieucao;
    }

    //get and set
    public toado getToo_do(){
        return  toa_do;
    }
    public void setToa_do(toado toa_do){
        this.toa_do =toa_do;
    }

    public double getChieudai(){
        return chieudai;
    }
    public void setChieudai(double chieudai){
        this.chieudai = chieudai;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }


    //method thực thi abstract
    @Override
    public double tinhdientich(){
        return this.chieudai*this.chieucao;
    }
}
