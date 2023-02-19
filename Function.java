import java.util.ArrayList;
import java.util.Random;

public class Function {
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
