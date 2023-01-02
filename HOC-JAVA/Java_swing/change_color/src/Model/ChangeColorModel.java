package Model;
/*ứng dụng mô hin MVC-> Mô hinh Model changecolor màu săc
* xây dựng chức năng method để quản lý và xử lý method dữ liệu chính
* cho project
* */
import java.awt.Color;
public class ChangeColorModel {
    private Color Mauchu;
    private Color Maunen;
    private boolean Tomauvien;

    // contructor
    public ChangeColorModel(){
        this.Mauchu = Color.BLACK;
        this.Maunen = Color.WHITE;
        this.Tomauvien= true;
    }

    // get and set

    public Color getMauchu() {
        return Mauchu;
    }

    public void setMauchu(Color mauchu) {
        Mauchu = mauchu;
    }

    public Color getMaunen() {
        return Maunen;
    }

    public void setMaunen(Color maunen) {
        Maunen = maunen;
    }

    public boolean isTomauvien() {
        return Tomauvien;
    }

    public void setTomauvien(boolean tomauvien) {
        Tomauvien = tomauvien;
    }


    // xây dựng method chương trình:

}
