package DAY_3;

import java.util.Scanner;

public class Tim_gia_tri_trong_Array_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] qLSV = {"Long", "Dũng", "Sỹ", "Tùng"};
        System.out.println(" nhập tên muốn tìm kiếm");
        String nhapName = sc.nextLine();
        boolean kT = false;
        for (int i = 0; i < qLSV.length; i++){
            if (qLSV[i].equals(nhapName)){
                System.out.println(" có trong danh sách");
                kT = true;
            }
        }
        if (!kT){
            System.out.println("ko có" + nhapName + " ko có trong danh sách");
        }
    }
}
