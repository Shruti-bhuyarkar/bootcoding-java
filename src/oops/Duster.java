package oops;

public class Duster {
    String brand;
    String size;
    double price;
    int quantity;

    public static Duster createduster(){
        Duster duster = new Duster();
        duster.brand = "camlin";
        duster.size = "Standard";
        duster.price = 120.5;
        duster.quantity = 2;
        return duster;

    }

    public static Duster createduster(String B , String S , double P , int Q){
        Duster duster = new Duster();
        duster.brand = B;
        duster.size = S;
        duster.price =P;
        duster.quantity = Q;
        return duster;
    }

    public static void printduster(Duster d){
        System.out.println( "Brand of the duster is "+d.brand);
        System.out.println("Size of the duster is "+d.size);
        System.out.println("price of the duster is "+d.price);
        System.out.println("Quantity of the duster is "+d.quantity);
    }
}
