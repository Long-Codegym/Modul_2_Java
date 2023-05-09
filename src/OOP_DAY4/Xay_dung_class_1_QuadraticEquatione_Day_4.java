package OOP_DAY4;

import java.util.Scanner;

public class Xay_dung_class_1_QuadraticEquatione_Day_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số a: ");
        double a = sc.nextDouble();
        System.out.println(" nhập số b: ");
        double b = sc.nextDouble();
        System.out.println(" nhập số c: ");
        double c = sc.nextDouble();
        Class_2_QuadraticEquation_Day_4 PTB2 = new Class_2_QuadraticEquation_Day_4(a, b, c);
        System.out.println(" Delta của PT là delta = " + PTB2.getDiscriminat());
        System.out.println(" Nghiệm đầu tiên của phương trình là X1 = " + PTB2.getRoot1());
        System.out.println(" Nghiệm thứ hai của phương trình là X2 = " + PTB2.getRoot2());
    }
}
