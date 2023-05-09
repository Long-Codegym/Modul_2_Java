package OOP_DAY4;

import java.util.Random;

public class Class_2_Stopwatch_Day_4 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        Xay_dung_class_1_StopWatch_Day_4 stopwatch = new Xay_dung_class_1_StopWatch_Day_4();
        selectionSort(array);
        stopwatch.stop();

        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
