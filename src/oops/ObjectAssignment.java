package oops;

public class ObjectAssignment {
    public static void main(String[] args) {
        //primitive data type
        int a =10;
        int b =a;//b<-a (value of a)
        b=30;//b-change but not changing a
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        // ADT - Abstract data type
        Marker blueMarker = new Marker();
        Marker redMarker = blueMarker;//redmarker <- bluemarker (reference)
        blueMarker.color="Blue";
        redMarker.color="Red";
        System.out.println("BlueMarker = "+blueMarker.color);
        System.out.println("RedMarker = "+redMarker.color);

    }
}
