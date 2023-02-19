import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Function.FillArray(numbers, 10, 0, 20);
        System.out.println(numbers);
        Function.DelEven(numbers);
        System.err.println(numbers);
    }
}
