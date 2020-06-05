package softwareeng;

import java.util.Scanner;
import java.util.ArrayList;

public class S_Multimedia extends Multimedia{

    ArrayList<String> Vidcourses = new ArrayList<String>(); 
    protected String answer;

    //connection(super(speed));


    public void ansVote(String ans){
        //System.out.println(getVote());
        Scanner an = new Scanner(System.in);
        ans = an.nextLine();      
    }

    public String getAns(){
        return answer;
    }

    public int chooseVid(){
        //epilogi video lecture.
        return 0;
    }
    
}
