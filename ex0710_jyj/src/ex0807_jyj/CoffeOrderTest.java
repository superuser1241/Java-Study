package ex0807_jyj;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeOrderTest {
    public static void main(String[] args) {
        List<String> coffee= Arrays.asList(
                "Cappuccino", "Americano", "Espresso", "Caramel Macchiato",
                "Mocha", "Cappuccino", "Espresso", "Latte"
        );

        List<String> list = coffee.stream()
        		.filter(s -> s.endsWith("o"))
        		.sorted() //정렬
        		.distinct()  //중복제거
        		.collect(Collectors.toList());
        System.out.println(list);
    }
}
