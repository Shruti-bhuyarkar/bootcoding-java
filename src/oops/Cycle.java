package oops;

public class Cycle {
    int breaks;
    double weight;
    String brand;
    String color;

    public static Cycle createcycle(){
        Cycle cycle = new Cycle();
        cycle.breaks = 2;
        cycle.weight = 60.5;
        cycle.brand = "Lady-bird";
        cycle.color = "black";
        return cycle;
    }
    public static Cycle createcycle(int B1, double W, String B, String C){
        Cycle cycle = new Cycle();
        cycle.breaks = B1;
        cycle.weight = W;
        cycle.brand = B;
        cycle.color = C;
        return cycle;
    }
    public static void printcycle(Cycle c){
        System.out.println("Breaks = "+c.breaks);
        System.out.println("Weight = "+c.weight);
        System.out.println("Brand = "+c.brand);
        System.out.println("Color = "+c.color);
    }
}
