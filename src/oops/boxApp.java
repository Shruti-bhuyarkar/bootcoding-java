package oops;

import javax.swing.*;
//BOX
public class boxApp {
//    public static void main(String[] args) {
//        Box b1 = Box.createBox();
//        Box b2 = Box.createBox(7.5, 5.2, 2.5);
//        Box.printbox(b1);
//        Box.printbox(b2);
//    }


    //DUSTER
//    public static void main(String[] args) {
//        Duster d1 = Duster.createduster();
//        Duster d2 = Duster.createduster("camlin", "standard", 150.3, 6);
//        Duster.printduster(d1);
//        Duster.printduster(d2);
//    }

    //HELMET
//    public static void main(String[] args) {
//        Helmet h1 = Helmet.createhelmet();
//        Helmet h2 = Helmet.createhelmet("Off-road", "Vega", 600.9, "red");
//        Helmet.printhelmet(h1);
//        Helmet.printhelmet(h2);
//    }

//CYCLE
    public static void main(String[] args) {
        Cycle c1 = Cycle.createcycle();
        Cycle c2 = Cycle.createcycle(2, 80,"cyclo" ,"red");
        Cycle.printcycle(c1);
        Cycle.printcycle(c2);

        MountainCycle mc = new MountainCycle();
        mc.brand ="Mountain";
        mc.breaks = 3;
        mc.weight = 40;
        mc.color = "black";


        GearCycle gc = new GearCycle();
        gc.brand = "Gear";
        gc.breaks = 2;
        gc.color = "maroon";
        gc.weight = 32;


}
}


