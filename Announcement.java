import java.time.LocalDate;
public class Announcements{
    protected String aname;
    protected int aid;
    LocalDate myDate = LocalDate.now();
    protected myDate date;
    protected String text;
    

    public Announcements( final String name,  final int id,  final myDate d, final String txt) {
        aname = name;
        aid = id;
        date = d;
        text = txt;
    }
    
    public String getName(){
        return String.format(name);
    }

    public int getId(){
        return id;
    }

    public String getText(){
        return String.format(text);
    }
    
    

}





















