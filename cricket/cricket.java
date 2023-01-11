import java.util.*;

public class cricket {
    public static void main(String []args) {
        Team cri=new Team();
        
        // obj.setTeamA("A");
        // obj.setTeamB("B");

        // String win = obj.toss();
        // -> user inpit a, b
        // obj.setBatting("A");

        // obj.bowl();

        
        // obj.getScore();
        // /*
        //  * A -> 4(1)
        //  * B -> 0(0)
        //  */

        //  obj.bowl();
        //  obj.getScore();
        // /*
        //  * A -> 6(2)
        //  * B -> 0(0)

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your team1 name");
        String name1=sc.next();
        System.out.println("Enter your team2 name ");
        String name2=sc.next();
        cri.Setteam1name(name1);
        cri.Setteam2name(name2);
        cri.Toss(); 
         cri.bowl();
         cri.bowl();
         cri.bowl();
         cri.bowl();
         cri.getScore();
         cri.Result(); 
         sc.close();
    }
    
}
