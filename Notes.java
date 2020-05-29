public class Notes {
    private int size;
    private int ndate; //sql alhtheias
    private String note;
    private int rate;
    private int noteId;
    
    /*
    public void selectSubject() {
        this.name = n;
    }
    public String noteOrder() {
        return name;
    }
    */
    
    public int getSize() {
        return size;        
    }

    public int getNdate() {
        return ndate;        
    }    

    public String getNote() {
        return note;        
    }

    public int getRate() {
        return rate;        
    }

    public int getNoteid() {
        return noteId;        
    }

    public void setRating(int rt) {
        if(rt>=0 || rt<=5)
        this.rate = rt; 
        else
        System.out.println("\nInvalid rating");   
    }

    public Notes(int size, int ndate, String note, int rate, int noteId) {
		this.size = size;
		this.ndate = ndate;
		this.note = note;
		this.rate = rate;
		this.noteId = noteId;
    }        

    @Override
    public String toString() {
        return "Size:"+ this.getSize() + "MB" + "\nDate of upload:" + this.getNdate() + "\nNote url:" + this.getNote() 
        + "\nRating:" + this.getRate() + "/5" + "\nID:" + this.getNoteid();
    }
}