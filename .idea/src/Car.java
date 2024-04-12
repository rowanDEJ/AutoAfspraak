public class Car {
    private String model;
    private String licensePlate;
    private boolean availability;
    private int mileage;

    public Car(String model, String licensePlate, boolean availability, int mileage) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.availability = availability;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}