package  Nested_Ano;
//import thư viện Annotattion

import java.lang.annotation.*;
public class Khoitao{

    // tiến hành khởi tạo các Annotation tự định nghĩa

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    //tạo tên pt Annotation tự định nghĩa
    public @interface  phuc1 {
        String value();
    }

    // khởi tạo Annotation thứ 2 để Nested Annotation t 1

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public @interface phuc2{
        phuc1[] value();
    }
    // tiến hành sử dụng tái định nghĩa lại bằng cách truyền value
    // cho mảng Annotaion phuc1[]

    @phuc2({
            @phuc1("value1"),
            @phuc1("value2")
    })
    public interface giaothuc{

    }



}