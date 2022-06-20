package cars;

public abstract class Car {
    public final String registrationNumber;
    public String color;
    public final int seats;
    public final int horsepower;

    public Car(String registrationNumber, String color, int seats, int horsepower) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.seats = seats;
        this.horsepower = horsepower;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public abstract String increaseSpeed();
    public abstract String startCar();

}
