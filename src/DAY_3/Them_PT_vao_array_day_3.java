package DAY_3;

import java.util.Arrays;
import java.util.Scanner;

public class Them_PT_vao_array_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số cần thêm vào mảng:");
        int A = sc.nextInt();
        System.out.println(" Nhập vị trí cần chèn:");
        int index = sc.nextInt();
        int[] array = {1,3,5,7,3,8,9,0,0,0,0};
        if (index < -1 || index >= array.length-1){
            System.out.println(" không chèn phần tử vào mảng được");
        }else {
            for (int i = array.length-1; i> index; i--){
                array[i]=array[i - 1];
            }
            array[index] = A;
        }
        System.out.println(Arrays.toString(array));
    }
}
