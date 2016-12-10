package footballsim.v1;

public class League {
    String name;
    Team[] teams;
    Match[] matches = new Match[12];
    
    
    
    
    
    public League(String n){
        name = n;
    }
    
    
    public void createFixture(){
        int count = 0;
        for(int i = 0; i < 4;i++){
            for (int j = 0; j < 4; j++){
            if (i == j)
                continue;
            else{
                matches[count] = new Match(teams[i],teams[j]);
                count++;
            }
        }
    }

        
        /*
        m2 = new Match(teams[1], teams[2]);
        m3 = new Match(teams[2], teams[3]);
        m4 = new Match(teams[1], teams[0]);
        m5 = new Match(teams[2], teams[1]);
        m6 = new Match(teams[3], teams[2]);
        m7 = new Match(teams[0], teams[2]);
        m8 = new Match(teams[1], teams[3]);
        m9 = new Match(teams[2], teams[0]);
        m10 = new Match(teams[3], teams[1]);
        m11 = new Match(teams[0], teams[1]);
        m12 = new Match(teams[0], teams[3]);
        */
    }
 
    public void start() {
        for (int i= 0; i < 12; i++){
            matches[i].play();
            showTable();
        
        }
        
        /*
        m1.play();
        showTable();
        m2.play();
        showTable();
        m3.play();
        showTable();
        m4.play();
        showTable();
        m5.play();
        showTable();
        m6.play();
        showTable();
        m7.play();
        showTable();
        m8.play();
        showTable();
        m9.play();
        showTable();
        m10.play();
        showTable();
        m11.play();
        showTable();
        m12.play();
        showTable();
        */
    }

    public void showTable() {
        System.out.println("-------------------------------------------------");
        System.out.println("Team\t\tP W D L S:C\tP\tDif");
        for (Team m:teams){
            System.out.println(
                    m.name + "\t" + m.played + " "
                    + m.wins + " "
                    + m.draws + " "
                    + m.losses + " "
                    + m.scored + ":"
                    + m.conceded + "\t"
                    + m.points + "\t"
                    + (m.scored - m.conceded));
        }
        System.out.println("-------------------------------------------------");
    
    }

}
