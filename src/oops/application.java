package oops;

public class application {
    public static void main(String[] args) {
        //how to create an object - syntax of object creation
        //className objectName = new classname();
        Marker marker = new Marker();

        //Access members of an object
        //objectName.memberName -- data members
        marker.brand="camlin";
        marker.color="BLUE";
        marker.type="WHiteBoard";
        marker.price=142.32;

        //objectName.membermethod()
        marker.refil();
        marker.write("I am learning OOPs in java");
        marker.print();

        //newcar
        Car car = new Car();
        car.brandName="Mahindra";
        car.color="White";
        car.fuelType="Desel";
        car.lights=6;
        car.seats= 6+1;
        car.model="MARAZO M6";

        car.startEngine();
        car.move();
        car.stopEngine();
        car.run();

        //newcricket
        Cricket cricket = new Cricket();
        cricket.players=11;
        cricket.scores=250;
        cricket.stadium="Wankhede stadium";
        cricket.place="Mumbai,Maharashtra";

        cricket.schedule();
        cricket.leadeBoard();
        cricket.kit();

        //newcollege
        College college = new College();
        college.College="K. D. K. College of Engineering";
        college.Department="Computer Science and Engineering";
        college.Incharge="S. Kurzharkar";
        college.practicals=3;
        college.Lectures=6;
        college.Students=150;
        college.AnnualEvent="NAVONMESH";
        college.commitee="Face-IT";

        college.atmosphere();
        college.canteen();
        college.clg();

        //newchess
        Chess chess = new Chess();
        chess.piece="Queen";
        chess.board="8x8";
        chess.player=2;

        chess.move();
        chess.game();
        chess.print();
    }
}
