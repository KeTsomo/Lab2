import java.util.ArrayList;
import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x: numbers) {
            s += x;
        }
        return s;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4242);

        System.out.println(sum(numbers));
    }
}
