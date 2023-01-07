package oops.Encapsulation;

public class AmbApplication {
    public static void main(String[] args) {
        Ambulance amb = new Ambulance();
        amb.setHospitalName("Care Hospital");
        amb.setType("Vinger");
        amb.setCharges(999.9);
        amb.setAvailable(true);

        System.out.println("Ambulance info.");
        System.out.println("Hospital Name " + amb.getHospitalName());
        System.out.println("Type of vehicle " + amb.getType());
        System.out.println("Charges made "+ amb.getCharges());
        System.out.println("Availability "+ amb.getAvailable());
    }
}
