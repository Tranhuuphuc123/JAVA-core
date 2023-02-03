package Basic01;
// bài tập thực hành tạo câu hỏi trắc nghiệm bằng vòng lặp

import java.util.Scanner;
public class Thuchanh_taocauhoitracnghiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while voi trye la vong lap vo han chi kethuc nho break
        while ((true)) {
            System.out.println("Câu hỏi của bạn là ai là ngừi tạo ra ngôn ngữ java");
            System.out.println("A/ Trần hữu Phúc");
            System.out.println("B/ Dennes Richie");
            System.out.println("C/ Lưu Bá Ôn");
            String luachon = sc.nextLine();

            if(luachon.equals("A")){
                System.out.println("Câu trả lời của bạn sai nha");
                break;
            }else if(luachon.equals("B")){
                System.out.println("Câu trả lời đúng rồi, chúc mừng bạn");
                break;
            }else if(luachon.equals("C")){
                System.out.println("Lụa chọn sai nhá ban iu");
                break;
            }

        }
    }
}
