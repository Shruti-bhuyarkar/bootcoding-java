package oops;

//create a class box with 3 data members length , breadth and height (double )
// having 3 methods
//create box with 3 parameter
// create with 0 parameter
// print box with 0 parameter
//createBox()
//createBox(l,b.h)
//printBox()
public class Box {
    double length;
    double breadth;
    double height;

    public static Box createBox(){
    Box Box = new Box();
    Box.length = 10.2;
    Box.breadth = 14;
    Box.height = 12.3;
    return Box;
}
    public static Box createBox(double l , double b , double h){
        Box Box = new Box();
        Box.length =l;
        Box.breadth =b;
        Box.height = h;
        return Box;
    }
    public static void printbox(Box b){
        System.out.println("Box.length = "+ b.length);
        System.out.println("Box.breadth = "+ b.breadth);
        System.out.println("Box.heigth = "+ b.height);
    }
}

