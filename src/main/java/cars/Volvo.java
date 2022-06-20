package cars;

public class Volvo extends Car{


    private boolean key;
    public Volvo(String registrationNumber, String color, int seats, int horsepower) {
        super(registrationNumber, color, seats, horsepower);
        this.key = key;
    }

    @Override
    public String increaseSpeed() {
        return null;
    }

    @Override
    public String startCar() {
        return "Car started";
    }
}
