package softwareeng;

import java.util.Scanner;

public class P_Multimedia extends Multimedia{

    public String vote;
    public String results;


    public void creatPlatforms(){
        Multimedia m1 = new Multimedia();
        m1.setPlatform("skype");
        m1.setType("online");
       
        Multimedia m2 = new Multimedia();
        m2.setPlatform("zoom");
        m2.setType("online");
    }
    //connection(super(speed));
    
    public void createVote(){
        System.out.println("Parakalw dwste tin erwtisi pros stous foitites");
        Scanner vot = new Scanner(System.in);
        String v = vot.nextLine();
        this.vote = v;
        vot.close();
    }
    
    public String getVote(){
        return vote;
    }
    
    public void checkResults(){  
        System.out.println();   

    }

    public void online(){
        //tha ginete i online sindesi.

    }

    public void offline(){
        //tha ginete i offline sindesi.

    }

}