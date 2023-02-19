import java.util.ArrayList;

// Реализовать алгоритм сортировки слиянием
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Function.FillArray(numbers, 33, 0, 100);
        System.out.println(numbers);
        Function.SortMerg(numbers);
        System.out.println(numbers);
    }
}
