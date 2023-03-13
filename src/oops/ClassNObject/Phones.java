package oops.ClassNObject;
//carrier = collaborate with people who share your enthusiasm
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
        ph.carrier = " AT&T";
        ph.model = "iPhone 12 ";
        ph.print();

    }
}
