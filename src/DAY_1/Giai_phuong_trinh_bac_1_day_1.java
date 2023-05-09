import java.util.Scanner;

public class Giai_phuong_trinh_bac_1_day_1 {
    public static void main(String[] args) {
        System.out.println("Phương trình 'a * x + b = c', nhập giá trị các số:");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a:");
        double a = sc.nextDouble();
        System.out.println("nhập b:");
        double b = sc.nextDouble();
        System.out.println("nhập c:");
        double c = sc.nextDouble();
        if (a != 0){
            double kQ = (c - b) / a;
            System.out.println("nghiệm pt: " + kQ);
        }else {
            if (b == c){
                System.out.println(" pt có nghiệm duy nhất x = 0");
            }else {
                System.out.print(" vô nghiệm!");
            }
        }
    }
}
