public class Truck extends Car{
    private final double towingCapacity;


    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Truck [VIN: " + getVinNumber() + ", Make: " + getMake() + ", Model: " + getModel() + ", Mileage: " + getMileage() + " Towing capacity: "+ towingCapacity + "]";
    }
}
