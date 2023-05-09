package OOP_DAY4;

import java.util.Scanner;

public class Class_HCN_Day_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        HCN hcn = new HCN(width, height);
        System.out.println("Your Rectangle \n"+ hcn.display());
        System.out.println("Perimeter of the Rectangle: "+ hcn.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hcn.getArea());
    }
}
