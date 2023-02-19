import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        FillArray(numbers, 10, 0, 20);

        System.out.println(numbers);

        int minEl = FindMinNumb(numbers);
        int maxEl = FindMaxNumb(numbers);

        double sumArray = SumElArray(numbers);
        double lengthAr = numbers.size();
        double aver = sumArray / lengthAr;
        
        System.out.printf(" Минимальный элемент - %d;\n Максимальный элемент - %d;\n "
            + "Среднее арифметическое - %.1f\n", minEl, maxEl, aver);
        
    }
    static void FillArray(ArrayList<Integer> array, int lengthArray, int minNumb, int maxNumb) {
        Random numb = new Random();
        for (int i = 0; i < lengthArray; i++) {
            array.add(numb.nextInt(minNumb, maxNumb));
        }
    }

    static int FindMinNumb(ArrayList<Integer> array) {
        int min = (int) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (min > array.get(i)) min = array.get(i);
        }
        return min;
    }

    static int FindMaxNumb(ArrayList<Integer> array) {
        int max = (int) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (max < array.get(i)) max = array.get(i);
        }
        return max;
    }

    static int SumElArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum +=array.get(i);
        }
        return sum;
    }
}
