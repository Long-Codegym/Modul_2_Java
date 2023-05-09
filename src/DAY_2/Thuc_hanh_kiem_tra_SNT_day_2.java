import java.util.Scanner;

public class Thuc_hanh_kiem_tra_SNT_day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số muốn kiểm tra có phải là SNT không:");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println(" không phải là SNT");
        }else {
            int  i = 2;
            boolean kT = true;
            while (i < number){
                if (number % i ==0){
                    kT = false;
                    break;
                }
                i++;
            }if (kT){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " ko là số nguyên tố");
            }
        }
    }
}
