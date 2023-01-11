import java.util.*;

public class Team {
    
    Random ran=new Random();
    Scanner sc=new Scanner(System.in);
    String choice="Null";
    String Tname1,Tname2;
    char batteam;
    static boolean tos=true;
    int team1score,team2score;
    static int i=0,j=0;
    public void Setteam1name(String a) {
      Tname1=a;
    }
    public void Setteam2name(String b) {
        Tname2=b;
    }
    public String getTeam1name() {
        return Tname1;
    }
    public String getTeam2name() {
        return Tname2;
    }
    public void Setteam1Score(int score1) {
        team1score +=score1;
    } 
    public int getteam1Score() {
        return team1score;
    }
    public void Setteam2Score(int score2) {
        team2score +=score2;
    }
    public int getteam2Score() {
        return team2score;
    }
    public void Toss() {
        int toss =ran.nextInt(3-1)+1;
        if(tos) {
        switch(toss) {
            case 1:
            System.out.println(getTeam1name()+"  is won the toss");
            SetBatting('A');
            tos=false;
            break;
            case 2:
            System.out.println(getTeam2name()+"  is won the toss");
            SetBatting('B');
            tos=false;
            break;
        }
    }
    else {
        System.out.println("Already tossed");
    }
        
    }
    public void SetBatting(Character batTeam) {
      batteam=batTeam;
    }
    public void bowl() {
        if(batteam=='A'&&i<2) {
                i++;
                int scr=ran.nextInt(6);
                Setteam1Score(scr);
                System.out.println("A-> "+getteam1Score()+"("+i+")");
                System.out.println("B-> "+getteam2Score()+"("+j+")");
                if(i==2) {
            SetBatting('B');
                }
        }
        else if(batteam=='B'&&j<2) {
                j++;
                int scr=ran.nextInt(6);
                Setteam2Score(scr);
                System.out.println("A-> "+getteam1Score()+"("+i+")");
                System.out.println("B-> "+getteam2Score()+"("+j+")");
                if(j==2) {
                SetBatting('A');
                }
        }
    }
    public void getScore() {
        System.out.println("A-> "+getteam1Score()+"("+i+")");
        System.out.println("B-> "+getteam2Score()+"("+j+")");
    }
    public void Result() {
        if(getteam1Score()>getteam2Score()) {
            System.out.println("Team "+getTeam1name()+" is win the match");
        }
        else {
            System.out.println("Team "+getTeam2name()+" is win the match");
        }
    }
}
