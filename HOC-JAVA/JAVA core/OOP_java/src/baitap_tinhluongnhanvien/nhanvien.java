package baitap_tinhluongnhanvien;
// nhân viên xay dựng quan hệ Is-A

public class nhanvien extends connguoi{
  private int sonamkinhnghiem;


  // contructor
    public nhanvien(){

    }

    public nhanvien(String name, Diachi diachi, int sonamkinhnghiem) {
        super(name, diachi);
        this.sonamkinhnghiem = sonamkinhnghiem;
    }

    //get and set

    public int getSonamkinhnghiem() {
        return sonamkinhnghiem;
    }

    public void setSonamkinhnghiem(int sonamkinhnghiem) {
        this.sonamkinhnghiem = sonamkinhnghiem;
    }

    @Override
    public double luong(){
        if(this.sonamkinhnghiem<1){
            return super.luong()*1.5;
        }else if(this.sonamkinhnghiem>1 && this.sonamkinhnghiem<3){
            return super.luong()*2;
        }else{
            return super.luong()*3;
        }
    }

}
