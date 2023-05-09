package DAY_3;

import java.util.Arrays;
import java.util.Scanner;

public class Gop_array_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        int[] array3 = new int[11];
        for (int i = 0; i< array1.length; i++){
            System.out.println("nhập giá trị vào mảng 1 tại vị trí: " + (i +1) + "; ");
            array1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array1));
        for (int j =0; j< array2.length; j++){
            System.out.println("nhập giá trị vào mảng 2 tại vị trí: " + (j +1) + "; ");
            array2[j] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        for (int j = 0; j< array1.length; j++){
            array3[j]=array1[j];
        }
        for (int j = 0; j< array2.length; j++){
            array3[5 + j] =array2[j];
        }
        System.out.println(Arrays.toString(array3));
    }
}
