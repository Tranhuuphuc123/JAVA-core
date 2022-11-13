import java.util.Arrays;

public class filter {
    public static void main(String[] args){
        Arrays.asList(2,3,5,7)
                .stream()
        .filter(i->i % 2 !=0)
        .map(i -> "Dâta: " + i).
                forEach(System.out::println);

    }
}
