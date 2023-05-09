import java.util.Scanner;

public class Ung_dung_tinh_tien_lai_day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền gửi:");
        double tienGui = sc.nextDouble();
        System.out.println("nhập số tháng gửi");
        int thang = sc.nextInt();
        System.out.println("nhập phần trăm lãi xuất");
        double laiXuat = sc.nextDouble();
        double tongTienlai = 0;
        for(int i = 0; i < thang; i++){
           tongTienlai += tienGui * (laiXuat/100)/12 * thang;
        }
        double tongTienlaivagui= tongTienlai + tienGui;
        System.out.println("tổng số tiền gửi cộng với lãi xuất là: " + tongTienlaivagui + " ,tổng số tiền lãi là: " + tongTienlai );
    }
}
