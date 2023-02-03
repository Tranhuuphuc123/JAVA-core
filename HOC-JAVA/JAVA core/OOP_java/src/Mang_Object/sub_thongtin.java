package Mang_Object;
// xây dựng class với pg thưc method ve thong tin ca nhan

public class sub_thongtin {
    private String name;
    private String diachi;
    private int tuoi;

    // contructor


    public sub_thongtin() {
       // contructor mă định
    }

    public sub_thongtin(String name, String diachi, int tuoi) {
        this.name = name;
        this.diachi = diachi;
        this.tuoi = tuoi;
    }

    // get and set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
