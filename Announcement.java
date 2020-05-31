import java.time.LocalDate;
public class Announcements{
    public String aname;
    public int aid;
    LocalDate myDate = LocalDate.now();
    private myDate date;
    

    public Announcements( String name,  int id,  myDate d) {
        aname = name;
        aid = id;
        date = d;
    }
    
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    
    























}