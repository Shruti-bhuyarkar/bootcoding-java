package oops.inheritance;

public class App {
    public static void main(String args[]) {
        //COMPUTER TABLE
        ComputerTable ct = new ComputerTable();
        ct.legs = 4;
        ct.material = new Material();
        ct.tabletop = true;
        ct.tabletype = "Computer";
        ct.createTable();
        ct.move();

        //DINING TABLE
        DiningTable dt = new DiningTable();
        dt.legs = 4;
        dt.material = new Material();
        dt.tabletop = true;
        dt.tabletype = "Dining";
        dt.createTable();
        dt.move();

        //DRESSING TABLE
        DressingTable dr =new DressingTable();
        dr.legs = 0;
        dr.material = new Material();
        dr.tabletop = false;
        dr.tabletype="Dressing";
        dr.createTable();
        dr.move();
    }
}
