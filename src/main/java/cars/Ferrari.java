package cars;

public class Ferrari extends Car{

    private boolean key;

    public Ferrari(String registrationNumber, String color, int seats, int horsepower, boolean key) {
        super(registrationNumber, color, seats, horsepower);
        this.key = key;
    }

    @Override
    public String increaseSpeed() {
        double increaseSpeed = horsepower/100.1;
        return "Speed increases per " + increaseSpeed + " each second";
    }

    @Override
    public String startCar() {
        if (key) return "Car started";

        return "Insert key to start engine";
    }
}
