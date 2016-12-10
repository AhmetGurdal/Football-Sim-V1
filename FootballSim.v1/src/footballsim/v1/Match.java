package footballsim.v1;
import java.util.Random;

public class Match {
    Team home;
    Team away;
    int hGoals;
    int aGoals;

    public Match(Team h, Team a) {
        home = h;
        away = a;
        hGoals = 0;
        aGoals = 0;
    }

    public void play() {
        Random rand;
        rand = new Random(); 
        hGoals = rand.nextInt(6); //Home team scores 0 to 5 goals...
        aGoals = rand.nextInt(4); //Away teams scores 0 to 3 goals...
        //Well, home teams have an advantage after all...
        
        //Let's update the team results according to the results.
        home.played++;
        away.played++;

        home.scored += hGoals;
        home.conceded += aGoals;
        away.scored += aGoals;
        away.conceded += hGoals;

        if (hGoals > aGoals) { //Home team wins.
            home.wins++;
            away.losses++;
            home.points += 3;
        } else if (hGoals < aGoals) { //Away team wins...
            home.losses++;
            away.wins++;
            away.points += 3;
        } else { //Draw...
            home.draws++;
            away.draws++;
            home.points++;
            away.points++;
        }
        //Let's not forget to report the score of the match:
        System.out.println(home.name + "  " + hGoals + " : " + aGoals + "  " + away.name);
        int begin = 0;
        int last = hGoals + aGoals;
        for(int i=0; i<last ; i++) {
            String c = "";
            int a = (int)(Math.random()*(90-begin) + begin+1);
            if (a > 90){
                a = 90;
                c = "+";
            
            }
            int b = (int)(rand.nextInt(2));
            if (aGoals == 0  && b == 1)
                b = 0;
            else if (hGoals == 0 && b == 0)
                b = 1;
            if (hGoals != 0 && b == 0){
                String h = home.selectScorer();
                System.out.println(h+ "["+a+c+"\"]");
                begin = a;
                hGoals--;
            }
            else if (aGoals != 0 && b == 1){
                System.out.println("                 "+"["+a+c+"\"]"+away.selectScorer());
                begin = a;
                aGoals--;
            }
        }
        
        /*
        for(int i=0; i<hGoals ; i++) {
            
            int a = (int)(Math.random()*(90-begin) + begin);
            String h = home.selectScorer();
            System.out.println(h+ "["+a+"\"]");
            begin = a;
            
        }
        begin = 0;
        for(int i=0; i<aGoals; i++) {
            int a = (int)(Math.random()*(90-begin) + begin);
            System.out.println("                 "+"["+a+"\"]"+away.selectScorer());
            begin = a;
        }
        */
    }
    
     
}



