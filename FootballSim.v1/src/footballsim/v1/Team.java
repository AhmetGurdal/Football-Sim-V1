package footballsim.v1;
import java.util.Random;

public class Team{
    String name;
    String[] Players;
    int[] goals;
    int played;
    int wins;
    int draws;
    int losses;
    int scored;
    int conceded;
    int points;
    
    public Team(String[] p,String n){
        name = n;
        Players = p;
        goals = new int[Players.length];
    }
    
    public String selectScorer() {
        Random rand = new Random();
        int r = rand.nextInt(5); // (Except the goalkeeper - so we won't return p1)
        goals[r+1]++;
        return Players[r+1];         
    }
       
    public void PrintAll(){
        System.out.println("Kaleci -> " + Players[0] );
        for (int i = 1; i < 6;i++){
            
            System.out.println(Players[i] + "-->" + goals[i]);
           
        }
    }
}
