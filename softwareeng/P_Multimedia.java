package softwareeng;
import java.util.ArrayList;
import java.util.Scanner;

public class P_Multimedia extends Multimedia{

    public String vote;
    public String results;


    public void creatPlatforms(){
        Multimedia m1 = new Multimedia();
        m1.setPlatform("skype");
        m1.setType("online");
        System.out.println("Platforma: Skype, Tipos: online\n");
       
        Multimedia m2 = new Multimedia();
        m2.setPlatform("zoom");
        m2.setType("online");
        System.out.println("Platforma: Zoom, Tipos: online\n");
    }
    //connection(super(speed));
    
    public void createVote(){
        String[] vote = {"Katalaves tin askisi?", "Einai swsto to sigekrimeno robust diagram?", "Swsto / lathos?"};
        
        System.out.println("Parakalw dwste tin erwtisi pros stous foitites");
        Scanner vot = new Scanner(System.in);
        String v = vot.nextLine();
        vot.close();
    }
    
    public String getVote(){
        return vote;
    }
    
    public void checkResults(){  
        System.out.println("60% swsto");   

    }

    public void online(){
        System.out.println("Deste tis zwnes sas....h tilediaskepsi ksekinaei!");
    }

    public void offline(){
        System.out.println("Eisagete to arxeio tou arxeiou pou thelete na anevaseste");
        Scanner mp4 = new Scanner(System.in);
        String m = mp4.nextLine();
    }

}