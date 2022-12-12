package oops;

public class Marker {
    //data member
    String type;
    String brand;
   public String color;
    double price;

    //data methods

    public  void refil(){
        System.out.println("Refill marker Successfully");
    }
    public void  write(String message){
        System.out.println("on White Board -  "+ message);
    }
    public void print(){
        System.out.println("Marker Brand : "+brand);
        System.out.println("Marker type : "+type);
        System.out.println("Marker color : "+color);
        System.out.println("Marker price : "+price);
    }
    //single mline comments
    /*
    multi-line comments
    -black comments
    4tyryur6
    hfyuyfg
     */

    /**
     documentation comment
     */
}
