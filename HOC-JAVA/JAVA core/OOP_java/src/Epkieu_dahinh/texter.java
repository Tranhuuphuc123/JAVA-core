package Epkieu_dahinh;
/*bài tập này sẽ hiểu rõ về tính ép kiểu trong đối tượng đa hình trong java*/
public class texter {
    public static void main(String[] args) {
        sub_class s = new sub_class();
        // tiến hành thực nghiệm tính đa hình: trỏ lơp cha gọi  đến lơp con
        Parrent_class p = new sub_class();

        s.thongtin_subclass();
        // lơp con gọiddeeneens method subclass rất bt

       // p.thongtin_subclass();
        //--> tuy nhiên đa hình p gọi đến method thongtin_subclass sẽ báo lỗi do bên lớp cha Pareent_class không có pt đó
        // để nó lk đc thì ta tiến hành ép kiểu đối tường cha về kiểu đối tượng con:

        sub_class ek = (sub_class) p;
        ek.thongtin_subclass();

        // 0--> lúc này p đã gọi đc method bên class con

    }
}
