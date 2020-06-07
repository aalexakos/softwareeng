package softwareeng;

import java.util.Scanner;

public class notesP extends Notes{
    public notesP(){
        //auto increment id
        this.noteId=noteId++;
    }

    public int getId(){
        return noteId;
    }

    public void deleteNote(){
        System.out.println("Poia simeiwsi theleis na diagrapseis? Dwse to path: ");
        Scanner scan = new Scanner(System.in);
        String path =scan.nextLine();
        for(int i=0; i<notesList.size(); i++){
            if(notesList.get(i).notePath.equals(path)){
                notesList.remove(i);
            }
            else    
                System.out.println("no such path");
        }
    }
}


