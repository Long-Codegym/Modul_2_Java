package OOP_DAY4;

public class HCN {
    double width, height;
    public HCN(){

    }
    
    public HCN(double width, double height ){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "HCN{" + "width=" + width + ", height=" + height + "}";
    }
}
