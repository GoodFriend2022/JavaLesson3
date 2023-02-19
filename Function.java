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
            if (min > array.get(i))
                min = array.get(i);
        }
        return min;
    }

    static int FindMaxNumb(ArrayList<Integer> array) {
        int max = (int) array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (max < array.get(i))
                max = array.get(i);
        }
        return max;
    }

    static int SumElArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }

    static void DelEven(ArrayList<Integer> array) {
        int count = 0;
        while (count < array.size()) {
            if (array.get(count) % 2 == 0) {
                array.remove(count);
            } else
                count++;
        }
    }

    static ArrayList<Integer> Sort(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
        ArrayList<Integer> array = new ArrayList<>();
        int count = 0;
        for (int j = 0; j < firstList.size(); j++) {
            while (count < secondList.size() && j < firstList.size()) {
                if (firstList.get(j) > secondList.get(count)) {
                    array.add(secondList.get(count));
                    count++;
                }
                else {
                    array.add(firstList.get(j));
                    j++;
                }
            }
            if (j < firstList.size()) array.add(firstList.get(j));
        }
        for (int k = count; k < secondList.size(); k++) {
            array.add(secondList.get(k));
        }
        return array;
    }
   
    static void SortMerg(ArrayList<Integer> array) {
        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();
        for (int i = 0; i < array.size() / 2; i++) {
            firstArray.add(array.get(i));
            secondArray.add(0, array.get(array.size() - 1 - i));
        }
        if (array.size() % 2 != 0) firstArray.add(array.get(array.size() / 2));
        array.clear();
        if (firstArray.size() > 1) {
            SortMerg(firstArray);
            SortMerg(secondArray);
        }
        array.addAll(Sort(firstArray, secondArray)); 
    }
}
