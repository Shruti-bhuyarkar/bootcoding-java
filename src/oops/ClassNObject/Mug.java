package oops.ClassNObject;

public class Mug {
    String Material;
    String Color;
    double Prize;

    public void print(){
      //  Mug m = new Mug();
        System.out.println(Material);
        System.out.println(Color);
        System.out.println(Prize);
    }

    public static void main(String[] args) {
        Mug m = new Mug();
        m.Material = " ceramic";
        m.Color = "black";
        m.Prize = 200;
        m.print();
    }

}
