package Exception_Xulyngoaile;
// tiềm hiểu về try catch trong xử l ngoại lệ

public class try_catch {
    public static void main(String[] args) {
        // ví dụ đoạn code sai sao va cách bắt lỗi với try catch

        int mang[] = {2,3};

        try {
            System.out.println("mpt thứ 3: "+ mang[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("loi : " + "\n" + e);
        }
        catch (Exception e){
            System.out.println("lỗi 2" + "\n" + e);
        }finally {
            System.out.println("luôn thực thi dù có hay không có exception");
        }

        /* lưu ý catch(Exception) là phần tử gốc của bắt lỗi catch
        * vì trong try catch ta có thể thêm nhiểu catch cô một try
        * cho nên lưu ý với Exception e là phần tử gốc thì ta nên để nó ở cúi cùng
        * để tránh lỗi khi biên dịch chtrinh
        * */

    }
}
