package softwareeng;

import java.time.LocalDate;
public class Announcement{
    protected String aname;
    protected int aid;
    LocalDate myDate = LocalDate.now();
    protected String text;
    
    public Announcement(){
        aid=aid++;
    }
    public void setAname(String name){
        aname=name;
    }

    public void setText(String txt){
        text=txt;
    }

    public String getName(){
        return String.format(aname);
    }

    public int getId(){
        return aid;
    }

    public String getText(){
        return String.format(text);
    }
        
    

}





















