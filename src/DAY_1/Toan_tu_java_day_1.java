import java.util.Scanner;

public class Toan_tu_java_day_1 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = sc.nextFloat();
        System.out.println("Nhập chiều dài");
        height = sc.nextFloat();
        float dienTich = width * height;
        System.out.println("Diện tích hcn là: " + dienTich);
    }
}
