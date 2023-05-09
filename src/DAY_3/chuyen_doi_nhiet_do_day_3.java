package DAY_3;

import java.util.Scanner;

public class chuyen_doi_nhiet_do_day_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doC ;
        double doF ;
        int menuCN;
        do {
            System.out.println(" chức năng chuyển nhiệt độ");
            System.out.println(" nhập 1 để chuyển đổi độ C sang độ F");
            System.out.println(" nhập 2 để chuyển đổi độ F sang độ C");
            System.out.println(" nhập 0 để thoát ra");
            menuCN = sc.nextInt();
            switch (menuCN){
                case 1: {
                    System.out.println(" nhập độ C để chuyển đổi");
                    doC = sc.nextDouble();
                    System.out.println(" độ C sang độ F: " + doCsangdoF(doC));
                    break;
                }
                case 2: {
                    System.out.println(" nhập độ F để chuyển đổi");
                    doF = sc.nextDouble();
                    System.out.println(" độ F sang độ C: " + doFsangdoC(doF));
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        }while (menuCN !=0 );
    }

    public static double doCsangdoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double doFsangdoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
