package oops.inheritance;

import oops.Encapsulation.Ambulance;

public class MobieAmbulance extends Ambulance {
    //parent protected property becomes -> private to child
    public void assignCharge(){
        charges = 100;

    }
}
