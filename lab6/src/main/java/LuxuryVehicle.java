/**
 * Class representing luxury vehicle, extending vehicle class.
 */
public class LuxuryVehicle extends Vehicle {
    public boolean hasGPS;
    public boolean hasLeatherSeats;

    /**
     * Constructor for LuxuryVehicle class.
     * @param brand The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     * @param hasGPS Whether the vehicle has GPS or not.
     * @param hasLeatherSeats Whether the vehicle has leather seats or not.
     */

    public LuxuryVehicle(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate);
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    /**
     * Calculate the rental price of the luxury vehicle.
     * @param days The number of days for which the vehicle is rented.
     * @return The total rental price of the luxury vehicle.
     */
    public int rentalPrice(int days) {
        int basePrice = 100;
        int additionalPrice = 0;
        if (hasGPS) {
            additionalPrice += 20;
        }
        if (hasLeatherSeats) {
            additionalPrice += 30;
        }
        return basePrice + additionalPrice * days;
    }
}
