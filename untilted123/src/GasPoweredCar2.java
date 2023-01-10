public class GasPoweredCar2 extends Car2 {

    private int battery;
    private double avgKmPerLiter;

    public GasPoweredCar2(String description) {
        super(description);
    }

    public GasPoweredCar2(String description, int battery, double avgKmPerLiter) {
        super(description);
        this.battery = battery;
        this.avgKmPerLiter = avgKmPerLiter;
    }
}
