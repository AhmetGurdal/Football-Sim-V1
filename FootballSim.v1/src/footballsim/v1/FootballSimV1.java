package footballsim.v1;

import java.util.Collection;

/**
 * @author ╠AHMET GURDAL╣ & ╠TAHA ALP╣
 */
public class FootballSimV1 {
     
    
    public static void main(String[] args) {
        String[] gsp = {"Fernando Muslera" ,"Semih Kaya" , "Selcuk Inan", "Sabri Sarioglu", "Wesley Sneijder", "Eren Derdiyok"};
        String[] fbp = {"Volkan Demirel" ,"Simon Kjaer", "Alex de Souza","Robin van Persie","Moussa Sow","Lens"};
        String[] bjkp = {"Tolga Zengin", "Gökhan Gönül", "Quaresma", "Gökhan İnler", "Caner Erkin","Abaoubakar" };
        String[] trkspor = {"Ahmet Gürdal","Taha Alp","Ramis Turgut","Murat Ak","Melih Günay","Eminem"};
        
        Team gs = new Team(gsp,"Galatasaray");
        Team fb = new Team(fbp,"Fenerbahçe");
        Team bjk = new Team(bjkp,"Beşiktaş");
        Team ts = new Team(trkspor, "Turk Spor");
        
        Team[] teams = {gs,fb,bjk,ts};
        
        //System.out.println(teams[0].Players[2] + "---->" + teams[0].goals[2]);
        League msl = new League("Mini Super League");
        
        msl.teams = teams;
        
        msl.createFixture();
    
        msl.start();
        System.out.println("♦♦♦GOALS♦♦♦");
        System.out.println("Galatasaray Goals");
        System.out.println("-----------------");
        gs.PrintAll();
        System.out.println("");
        
        System.out.println("Fenerbahçe Goals");
        System.out.println("-----------------");
        fb.PrintAll();
        System.out.println("");
        
        System.out.println("Beşiktaş Goals");
        System.out.println("-----------------");
        bjk.PrintAll();
        System.out.println("");
        
        System.out.println("TurkSpor Goals");
        System.out.println("-----------------");
        ts.PrintAll();
        

    }

}
