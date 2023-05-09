package OOP_DAY4;

public class Fan_2 {
    public static void main(String[] args) {
        Fan fan1 = new Fan((byte) 10, "Blue", "fan1");
        Fan fan2 = new Fan((byte) 5, "Yellow", "fan2");
        fan1.turnOn();
        fan1.getSpeed();
        fan1.speedUp();
        fan1.getSpeed();
        fan1.speedUp();
        fan1.speedUp();
        fan1.speedUp();
        fan1.getSpeed();
        fan1.displayInformation();
        fan1.speedUp();
        fan1.speedDown();
        fan1.getSpeed();
        fan1.displayInformation();
        fan2.displayInformation();
    }
}
