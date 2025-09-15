package ProblemStatements;
abstract class Transport {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Transport(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "VehicleID: " + vehicleId + ", Driver: " + driverName + ", Rate/Km: " + ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Scooter extends Transport implements GPS {
    private String location;

    public Scooter(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Scooty extends Transport implements GPS {
    private String location;

    public Scooty(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Transport implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApp {
    public static void processRide(Transport transport, double distance) {
        System.out.println(transport.getVehicleDetails());
        System.out.println("Fare for " + distance + " km: " + transport.calculateFare(distance));
        if (transport instanceof GPS) {
            GPS gps = (GPS) transport;
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Transport t1 = new Scooter("C101", "Arjun", 15, "Downtown");
        Transport t2 = new Scooty("B202", "Ravi", 10, "Station");
        Transport t3 = new Auto("A303", "Kiran", 12, "Mall");

        processRide(t1, 10);
        processRide(t2, 8);
        processRide(t3, 5);
    }
}


