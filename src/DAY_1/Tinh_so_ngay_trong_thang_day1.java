import java.util.Scanner;

public class Tinh_so_ngay_trong_thang_day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tháng muốn kiểm tra số ngày:");
        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.println(" tháng 2 có 28 ngày hoặc 29 ngày đối với năm nhuận");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng này có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng này có 30 ngày");
                break;
        }
    }
}
