package softwareeng;

import java.util.*; 
import java.util.Scanner;

public class notesS extends Notes{
    public notesS(){
        //auto increment id
        this.noteId=noteId++;
        this.uploader=login.username;
    }

    public void downloadNotes(int id){
        for(int i=0; i<notesList.size(); i++){
            if (notesList.get(i).noteId==id){
                //download note
            }
        }
    }

    public void removeSNote(){
        System.out.println("Poia simeiwsi theleis na diagrapseis? ");
        Scanner scan = new Scanner(System.in);
        int id=scan.nextInt();
        for(int i=0; i<notesList.size(); i++){
            //removing notes only if the student is the uploader
            if (notesList.get(i).noteId==id && uploader.equals(login.username)){
                notesList.remove(i);
            }
        }
    }

    public void rateNotes(){
        if (notesList.size()==0){
            System.out.println("There are currently no notes availiable");
        }
        else{
            for(int i=0; i<notesList.size(); i++){
                System.out.println("rate this note "+i);
                Scanner scan = new Scanner ( System.in );
                int rate = scan.nextInt();
                setRatingNote(rate);
            }
        }
    }
}