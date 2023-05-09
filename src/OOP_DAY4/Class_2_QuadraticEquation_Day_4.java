package OOP_DAY4;

public class Class_2_QuadraticEquation_Day_4 {
    private double a, b, c;
    public Class_2_QuadraticEquation_Day_4(){

    }

    public Class_2_QuadraticEquation_Day_4(double a, double b, double c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminat(){
       return b*b - 4*a*c;
    }
    public double getRoot1(){
        double delta = getDiscriminat();
        if (delta < 0){
            System.out.println(" phương trình vô nghiệm");
        }
        return (-b + Math.sqrt(delta))/(2 *a);
    }

    public double getRoot2(){
        double delta = getDiscriminat();
        if (delta < 0){
            System.out.println(" phương trình vô nghiệm");
        }
        return (-b - Math.sqrt(delta))/(2 *a);
    }
}

