package DAY_3;

import java.util.Arrays;
import java.util.Scanner;

public class Xoa_phan_tu_in_array_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 4, 5, 7, 9, 3, 11, 6};
        System.out.println(" nhập phần tử cần xóa: ");
        int delPT = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            int index;
            if (array[i] == delPT) {
                index = i;
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[(j + 1)];
                }
            }else {
                System.out.println(" giá trị nhập vào không có trong mảng.");
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
