package oops;

public class Chess {
    String piece;
    String board;
    int player;

    public void move(){
        System.out.println("The starting and ending spot");
    }
    public void game(){
        System.out.println("keep track on all the move");
    }
    public void print(){
        System.out.println("Favorite piece = "+piece);
        System.out.println("size of the Board ="+board);
        System.out.println("No. of players = "+player);
    }
}
