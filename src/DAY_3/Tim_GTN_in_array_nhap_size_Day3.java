package DAY_3;

import java.util.Scanner;

public class Tim_GTN_in_array_nhap_size_Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray;
        int[] array;
        do {
            System.out.println(" nhập độ dài mảng:");
            sizeArray = scanner.nextInt();
            if (sizeArray > 10) {
                System.out.println(" vượt quá độ dài mảng cho phép");
            }
        } while (sizeArray > 10);
        array = new int[sizeArray];
        int i = 0;
        while (i < array.length){
            System.out.println("nhập giá trị vào mảng" + (i +1) + "; ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println();
        for (int j=1; j < array.length; j++){
            System.out.println(array[j]+ "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] < min){
                min = array[j];
                index = j +1;
            }
        }
        System.out.println( min + " số nhỏ nhất vị trí thứ: " + index);
    }

}
