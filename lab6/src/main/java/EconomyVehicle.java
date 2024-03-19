/**
 * Class representing economy vehicle, extending vehicle class.
 */
public class EconomyVehicle extends Vehicle {
    public boolean isHybrid;

    /**
     * Constructor for EconomyVehicle class.
     * @param brand The brand of the vehicle class.
     * @param model The model of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     * @param isHybrid Whether the vehicle is hybrid or not.
     */
    public EconomyVehicle(String brand, String model, String licensePlate, boolean isHybrid) {
        super(brand, model, licensePlate);
        this.isHybrid = isHybrid;
    }

    /**
     * Calculate the rental price of the economy vehicle.
     * @param days The number of days for which the vehicle is rented.
     * @return The total rental price of the economy vehicle.
     */
    public int rentalPrice(int days) {
        int basePrice = 50;
        int additionalPrice = 0;
        if (isHybrid) {
            additionalPrice += 10;
        }
        return basePrice + additionalPrice * days;
    }
}
