package softwareeng;

import java.util.Scanner;
import java.util.ArrayList;

public class S_Multimedia extends Multimedia{

    ArrayList<String> Vidcourses = new ArrayList<String>(); 
    protected String answer;

    //connection(super(speed));

    
    public void ansVote(){
        //System.out.println(getVote());
        System.out.println("Einai swsto to sigekrimeno robust diagram?");
        Scanner an = new Scanner(System.in);
        String ans = an.nextLine(); 
    }

    public String getAns(){
        return answer;
    }

    public void chooseVid(){
        System.out.println("Eisagete ton arithmo tis videodialeksis pou thelete na parakolouthisete\n");
        Scanner video = new Scanner(System.in);
        String vid = video.nextLine();
        System.out.println("Parakalw perimenete\n");
        

    }
    
}
