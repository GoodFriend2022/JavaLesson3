import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        FillArray(numbers, 10, 0, 20);
        System.out.println(numbers);
        
    }
    static void FillArray(ArrayList array, int lengthArray, int minNumb, int maxNumb) {
        Random numb = new Random();
        for (int i = 1; i < lengthArray; i++) {
            array.add(numb.nextInt(minNumb, maxNumb));
        }
    }

    static int FindMinNumb(ArrayList array) {
        int min = array.get(0);
        for (int i = 1; i < array.length; i++) {
            
        }
    }
}
