package DAY_3;

import java.util.Scanner;

public class Tim_gia_tri_max_in_array_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray;
        int[] array;
        do {
            System.out.println(" nhập độ dài mảng:");
            sizeArray = sc.nextInt();
            if (sizeArray > 10) {
                System.out.println(" vượt quá độ dài mảng cho phép");
            }
        } while (sizeArray > 10);
        array = new int[sizeArray];
        int i = 0;
        while (i < array.length){
            System.out.println("nhập giá trị vào mảng" + (i +1) + "; ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println();
        for (int j=1; j < array.length; j++){
            System.out.println(array[j]+ "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println( max + " số lớn nhất vị trí thứ: " + index);
    }
}
