package cars;

public class Main {

    public static void main(String[] args) {


//    Volvo volvo = new Volvo("k=234", "blue", 4,400);
//    volvo.getColor();
//    volvo.getHorsepower();
//    volvo.startCar();


    Ferrari ferrari = new Ferrari("LK=90", "black", 2, 680, true);
    System.out.println(ferrari.startCar());
    System.out.println(ferrari.getColor());
    System.out.println(ferrari.getHorsepower());
    System.out.println(ferrari.getRegistrationNumber());
    System.out.println(ferrari.increaseSpeed());
    }
}
