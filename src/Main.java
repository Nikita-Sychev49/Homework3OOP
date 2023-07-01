import hwrk.skypro.*;

public class Main {
    public static void main(String[] args) {
        Bycicle stels = new Bycicle("Стелс", 2);
        Car bmw = new Car("BMW", 4);
        Truck man = new Truck("MAN", 8);

        ServiceStation station = new ServiceStation();
        station.check(stels);
        station.check(bmw);
        station.check(man);


    }
}