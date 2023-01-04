package Model;

public class thanhcuonModel {
    private String vanban;
    private String tukhoa;
    private String ketqua;

    // contructor
    public thanhcuonModel(){
        this.vanban="";
        this.tukhoa="";
        this.ketqua="";
    }

    // get and set

    public String getVanban() {
        return vanban;
    }

    public void setVanban(String vanban) {
        this.vanban = vanban;
    }

    public String getTukhoa() {
        return tukhoa;
    }

    public void setTukhoa(String tukhoa) {
        this.tukhoa = tukhoa;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }


    //xây dựng method tiềm kiếm số lần xuất hiện của từ khóa trong một đoạn văn bản
    public void timkiem(){
        int dem = 0;
        int vitri = 0;
        while(true){
            // dùng hàm indexOf() để đưa về giá trị vị trí từ khóa mong muốn tiềm kiếm
            int i =this.vanban.indexOf(this.tukhoa, vitri);
            if(i==-1){
                // -1 là giá trị xem như không tìm thấy đc
                break;
            }else{
                dem++;
                /* khi biến đếm tăng lên thì nó sẽ đếm số lần xuất hiện ừ vị trí ban đầu xuất hiện
                 * +1, +2... cho đến khi nào không còn xuất hiện nữa.
                 * ---> để đếm đc số ần nó trùng từ khóa xuất hiện bao nhiêu lần
                 * */
                vitri = i+ 1;
            }
        }
        this.ketqua = "kết quả: có " + dem + " " + this.tukhoa;
        System.out.println(ketqua);
    }
}
