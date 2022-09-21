import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer [] massiv = {13,3,35,5,50,54,7,8,9,10};

        Optional<Integer> integerList = Arrays.stream(massiv).filter(x ->x%2==0).map(x -> x * x).collect(Collectors.toList()).stream().max(Comparator.naturalOrder());

        System.out.println(integerList);
    }
}