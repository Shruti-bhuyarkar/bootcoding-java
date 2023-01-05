package oops;

public class Helmet {
    String type;
    String brand;
    double price;
    String color;

    public static Helmet createhelmet(){
        Helmet helmet = new Helmet();
        helmet.type = "Modular";
        helmet.brand = "Steel-bird";
        helmet.price = 500.60;
        helmet.color = "Black";
        return  helmet;
    }
    public static Helmet createhelmet(String T, String B, double P, String C){
        Helmet helmet = new Helmet();
        helmet.type = T;
        helmet.brand = B;
        helmet.price =P;
        helmet.color =C;
        return helmet;
    }
    public static void printhelmet(Helmet h){
        System.out.println("Type = "+h.type);
        System.out.println("Brand = "+h.brand);
        System.out.println("Price = "+h.price);
        System.out.println("Color = "+h.color);
    }
}
