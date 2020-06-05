import java.util.ArrayList;
public class S_Notes extends Notes{
    

    public S_Notes(int size, int ndate, String note, int rate, int noteId) {
        super(size, ndate, note, rate, noteId);
    }        

    public static ArrayList<Notes> s_noteList = new ArrayList<Notes>();

    public static void addSNote(Notes a) {
        s_noteList.add(a);
    }

    public static void deleteSNote(Notes n) {
		s_noteList.remove(n);
      }
     
    
  
    public static boolean evaluation(Notes e) {
        int k = e.getSize();
        if(k<500)
        return true;

        else
        return false;
    }

     /*  
    public void insertRating(Notes r,int m) {
      s_noteList.get(r).setRating(m);
    }
    */
}