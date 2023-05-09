import java.util.Scanner;

public class Chuyen_doi_tien_te_day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền đô muốn đổi:");
        float usd = sc.nextFloat();
        float vnd = 23000f;
        float VtoU = usd * vnd;
        System.out.println("VND: " + VtoU);
    }
}
