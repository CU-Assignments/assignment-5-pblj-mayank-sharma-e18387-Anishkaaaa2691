import java.util.*;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        for (String part : parts) {
            // Autoboxing: int to Integer
            numbers.add(Integer.parseInt(part));
        }

        int sum = 0;
        for (Integer num : numbers) {
            // Unboxing: Integer to int
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
