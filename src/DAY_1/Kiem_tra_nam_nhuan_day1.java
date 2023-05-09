import java.util.Scanner;

public class Kiem_tra_nam_nhuan_day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số năm cần kiểm tra: ");
        int nam = sc.nextInt();
        if(nam % 4 == 0){
            if(nam % 100 == 0){
                if(nam % 400 == 0){
                    System.out.printf("là năm nhuận: ", nam);
                } else {
                    System.out.printf("Không phải là năm nhuận", nam);
                }
            } else {
                System.out.printf("là năm nhuận: ", nam);
            }
        } else {
            System.out.printf("không phải là năm nhuận: ", nam);
        }
    }
}
