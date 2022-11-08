package Ano02.Ano02;
/*bài này chỉ cách khởi tạo một Anotation tự định nghĩa*/



// import thư viện Anotation
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Inherited;
import java.lang.annotation.Documented;

public class khoitaoano {

        //bắt đầu khởi tạo
        @Retention(RetentionPolicy.RUNTIME)
        @Target(ElementType.FIELD)
        @Documented
        @Inherited

        // xây dựng lớp với tên Annotation mình mún đặt

        public @interface  khoitao{
            int index();

            String title();

            String decription() default "not value";
        }

    }



