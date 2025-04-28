import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassWork {
    private static void exc1(){
        List<String> colors = Arrays.asList("red", "green", "blue", "pink", "brown");
        System.out.println(colors);
        List<String> result = colors.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void exc2(){
        List <Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEvents = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num.intValue())
                .sum();
        System.out.println(sumOfEvents);

        int sumOfOtherEvents = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(x -> x.intValue())
                .sum();
        System.out.println(sumOfOtherEvents);
    }
    public static void exersiсе1(){
        List<String> letters = Arrays.asList("a", "b", "a", "c", "d", "c", "e", "c", "e");
        List<String> result = letters.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void exersiсе2(){
        List<String> words = Arrays.asList("letter", "list", "design", "police", "long", "collection");
        long result = words.stream()
                .map(String::toLowerCase)
                .filter(s -> s.charAt(0) == 'l')
                .count();
        System.out.println(result);
    }

    public static void exersiсе3(){
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7 ,10, 2, 127, 515);
        Integer max = numbers.stream()
                .max(Integer::compare)
                .orElse(0);

        Integer secondMax = numbers.stream()
                .filter(num -> num != max)
                .max(Integer::compare)
                .orElse(0);
        System.out.println(secondMax);  // Выведет 127
    }



    public static void main(String[] args) {
        exc1();
        exc2();
        exersiсе1();
        exersiсе2();
        exersiсе3();
    }
}
