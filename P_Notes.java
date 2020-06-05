import java.util.ArrayList;
public class P_Notes extends Notes{
    

    public P_Notes(int size, int ndate, String note, int rate, int noteId) {
        super(size, ndate, note, rate, noteId);
    }     
    
    private ArrayList<Notes> p_noteList = new ArrayList<Notes>();

    public void addSNote(Notes a) {
        p_noteList.add(a);
    }

    public void deleteSNote(Notes n) {
		p_noteList.remove(n);
	}

    public boolean evaluation(Notes e) {
        int k = e.getSize();
        if(k<500)
        return true;

        else
        return false;
    }
  
}