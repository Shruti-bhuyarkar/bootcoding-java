package oops.ExpectionHandling.trycatch;

public class ex1 {
    public static void main(String[] args) {
        try{
            int a= 10, b=2, c;
            c=a/b;
            System.out.println("value = "+ c );
        }
        catch (ArithmeticException a){
            System.out.println(a);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        System.out.println("The End");
    }
}
