import java.util.Scanner;

public class Tim_so_uoc_chung_max_day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên a:");
        int a = sc.nextInt();
        System.out.println("nhập số nguyên b:");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("không có ước chung lớn nhất");
            while (a != b) {
                if (a > b){
                    a = a - b;
                System.out.println("ước chung lớn nhất: " + a);
                }
                else{
                    b = b - a;
                    System.out.println("ước chung lớn nhất: " + b);
                }
            }
        }
    }
}
