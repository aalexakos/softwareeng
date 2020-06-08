package softwareeng;

import java.util.*;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList; 

public abstract class Notes {
    protected String uploader;
    protected int noteId;
    protected String notePath;
    protected int rating;
    protected double size;
    protected String todate;
    protected boolean isNoteProff;
    ArrayList<Notes> notesList = new ArrayList<Notes>();

    public void setIsNoteProff(boolean bool){
        this.isNoteProff=bool;
    }

    public int getRating(){
        return rating;
    }

    public void setRatingNote(int i){
        this.rating=i;
    }

    public boolean checkSize(){
        if (size>500)
            return false;
        else
            return true;
    }

    public void uploadNote(){
        Scanner scan = new Scanner(System.in);
        System.out.println("insert location path (formatted C://location//name.txt): ");
        String notePath = scan.nextLine();
        File file =new File(notePath);

		if(file.exists()){

			double bytes = file.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            size=megabytes;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            System.out.println("size is "+numberFormat.format(size)+" megabytes");
            Date date = new Date();
            todate = date.toString();
            notesList.add(this);

        }
        else   
            System.out.println("Filepath does not exist.");

    }

    //bubble sorting the array of notes based on ratings
    public void noteOrder(){
        for(int i = notesList.size(); i>0; i--){
            for (int j=0; j<i; j++){
                if (notesList.get(j-1).getRating()>notesList.get(j).getRating()){
                    Notes temp = notesList.get(j-1);
                    notesList.set(j-1,notesList.get(j));
                    notesList.set(j,temp);
                }
            }
        }
    }

    public void viewNotes(){
        if (notesList.size()==0){
            System.out.println("There are currently no notes availiable");
        }
        else{
            for(int i=0; i<notesList.size(); i++){
                System.out.println("this note "+i);
            }
        }
    }

}