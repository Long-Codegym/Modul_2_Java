package DAY_3;

import java.util.Scanner;

public class Ung_DSL_SV_thi_do_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Điền độ dài mảng:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println(" Kích thước không được vượt quá 20 phần tử");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println(" Nhập điểm cho sinh viên:" + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
