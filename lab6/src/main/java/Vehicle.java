/**
 * Abstract class representing a vehicle.
 */
public abstract class Vehicle {
    public String brand;
    public String model;
    public String licensePlate;

    /**
     * Constructor for Vehicle class.
     * @param brand The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     */

    public Vehicle(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    /**
     * Get the brand of the vehicle.
     * @return The brand of the vehicle.
     */

    public String getBrand() {
        return brand;
    }

    /**
     * Get the model of the vehicle.
     * @return The model of the vehicle.
     */

    public String getModel() {
        return model;
    }

    /**
     * Get the license plate of the vehicle.
     * @return The license plate of the vehicle.
     */

    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * Abstract method to calculate the rental price of the vehicle.
     * @param days The number of days for which the vehicle is rented.
     * @return The total rental price of the vehicle.
     */

    public abstract int rentalPrice(int days);

}
