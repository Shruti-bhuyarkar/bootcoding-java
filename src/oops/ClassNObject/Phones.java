package oops.ClassNObject;

public class Phones {
    String brand;
    String OS;
    String carrier;
    String model;

    public void print(){
        System.out.println(brand);
        System.out.println(OS);
        System.out.println(carrier);
        System.out.println(model);
    }

    public static void main(String[] args) {
        Phones ph = new Phones();
        ph.brand = "Apple";
        ph.OS = "ios 14";
        ph.carrier = "Boost Mobile ";
        ph.model = "iPhone 12 ";
        ph.print();

    }
}
