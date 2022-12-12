package oops;

public class Cricket {
    int players;
    int scores;
    String stadium;
    String place;


    public void schedule(){
        System.out.println("The match is scheduled....");
    }
    public void leadeBoard(){
        System.out.println("Display the leader Board....");
    }
    public void kit(){
        System.out.println("Cricket players = "+players);
        System.out.println("Cricket score = "+scores);
        System.out.println("Cricket stadium name = "+stadium);
        System.out.println("Cricket place = "+place);
    }
}
