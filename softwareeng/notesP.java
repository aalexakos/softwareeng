package softwareeng;

public class notesP extends Notes{
    public notesP(){
        //auto increment id
        this.noteId=noteId++;
    }

    public int getId(){
        return noteId;
    }

    public void deleteNote(String  path){
        for(int i=0; i<notesList.size(); i++){
            if(notesList.get(i).notePath.equals(path)){
                notesList.remove(i);
            }
            else    
                System.out.println("no such path");
        }
    }
}


