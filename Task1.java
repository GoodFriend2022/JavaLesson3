import java.util.ArrayList;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Function.FillArray(numbers, 10, 0, 20);

        System.out.println(numbers);

        int minEl = Function.FindMinNumb(numbers);
        int maxEl = Function.FindMaxNumb(numbers);

        double sumArray = Function.SumElArray(numbers);
        double lengthAr = numbers.size();
        double aver = sumArray / lengthAr;

        System.out.printf(" Минимальный элемент - %d;\n Максимальный элемент - %d;\n "
            + "Среднее арифметическое - %.1f\n", minEl, maxEl, aver);
        
    }
}
