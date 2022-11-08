package  Nested_Ano;

// tiến hành thực thi file Annotation vừa tạo
public class Man extends Khoitao{
    public static void main(String[] args){
        // tiến hành Truy xuất chú thích qua lớp Bộ lọc

        phuc2 ph = giaothuc.class.getAnnotation(phuc2.class);
        for(phuc1 p: ph.value()){
            System.out.println("xuất thông tin: " + p.value());
        }

    }
}