import model.Players;
import model.Team;
import model.group;

import java.util.ArrayList;

public class Main {
    public static void Main(String[] args) {
        ArrayList<Players>englandPlayer=new ArrayList<>();
        ArrayList<Players>southkoreaPlayers=new ArrayList<>();
        ArrayList<Players>portugalPlayers=new ArrayList<>();
        Players p1=new Players("Harry Kane",12,32,10);
        Players p2=new Players("Son Heungmin",10,29,9);
        Players p3=new Players("Cristiano Ronaldo",10,36,9);
        Players p4=new Players("Mount",12,31,10);
        Players p5=new Players("Kim Minjae",10,30,9);
        Players p6=new Players("Pepe",10,34,9);
        Players p7=new Players("Walker",12,31,10);
        Players p8=new Players("Cho",10,28,9);
        Players p9=new Players("Bruno",10,33,9);
        Players p10=new Players("Shaw",11,31,10);
        Players p11=new Players("Hwang",10,26,9);
        Players p12=new Players( "Felix",10,28,9);

        englandPlayer.add(p1);
        englandPlayer.add(p4);
        englandPlayer.add(p7);
        englandPlayer.add(p10);


        southkoreaPlayers.add(p2);
        southkoreaPlayers.add(p5);
        southkoreaPlayers.add(p8);
        southkoreaPlayers.add(p11);

        portugalPlayers.add(p3);
        portugalPlayers.add(p6);
        portugalPlayers.add(p9);
        portugalPlayers.add(p12);

        Team england = new Team("Englang","White",3,englandPlayer);
        Team southkorea = new Team("southkorea","Reds",3,southkoreaPlayers);
        Team portugal = new Team("portugal","Red",3,portugalPlayers);
        ArrayList<Team> alist = new ArrayList<>();
        ArrayList<Team> blist = new ArrayList<>();
        alist.add(southkorea);
        alist.add(portugal);
        blist.add(england);

        group A =new group("A",alist);
        group B= new group("B",blist);




    }
}