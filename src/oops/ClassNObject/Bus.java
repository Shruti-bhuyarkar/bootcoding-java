package oops.ClassNObject;

public class Bus {
    String type;
    int seats;
    String Air;
    String Use;
    public void print(){
        System.out.println(type);
        System.out.println(seats);
        System.out.println(Air);
        System.out.println(Use);
    }

    public static void main(String[] args) {

        Bus b = new Bus();
        b.type = "clg bus";
        b.seats = 50;
        b.Air = "non-AC";
        b.Use = "daly purpose";
        b.print();
    }

}
