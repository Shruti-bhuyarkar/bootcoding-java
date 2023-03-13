package oops.ClassNObject;

public class Spectacles {
   double Weight;
    boolean waterResistance;
    double prize;
    String category;
    String lens;
    public void print(){
        System.out.println(Weight);
        System.out.println(waterResistance);
        System.out.println(prize);
        System.out.println(category);
        System.out.println(lens);
    }

    public static void main(String[] args) {
        Spectacles specs = new Spectacles();
        specs.Weight = 2.99;
        specs.waterResistance = true;
        specs.prize = 2500;
        specs.category="full-frame";
        specs.lens = "Progressive";
        specs.print();
    }
}
