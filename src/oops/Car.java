package oops;

public class Car {
    String color;
    String model;
    String brandName;
    int lights;
    int seats;
    String fuelType;

    public void startEngine(){
        System.out.println("suru zala ekdach");
    }
    public void stopEngine(){
        System.out.println("band pn zala");
    }
    public  void move(){
        System.out.println("chalte aahe ti");
    }
    public void run(){
        System.out.println("Car brand = " + brandName);
        System.out.println("Car color = " + color);
        System.out.println("Car fueltype = " + fuelType);
        System.out.println("Car model = " + model);
        System.out.println("Car lights = " + lights);
        System.out.println("Car seats = " + seats);
    }
}
