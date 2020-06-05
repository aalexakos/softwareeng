package softwareeng;

import java.util.ArrayList;
public class P_Announcements extends Announcement {
    protected ArrayList<Announcement> ann = new ArrayList<Announcement>();


    public void creAnn(String name,String txt){
        Announcement an1 = new Announcement();
        an1.setAname("Dilwsi eksetasis mathimatos");
        an1.setText("parakalw dilwste oti epithymeite na eeksetastite se ayto to mathima kanontas reply ayto to mhnyma ");
        Announcement an2 = new Announcement();
        an2.setAname(name);
        an2.setText(txt);
        ann.add(an2);
    }
    
    public void delAnn(Announcement a){
        ann.remove(a);
    }
    
    //global anakinwsi apo ton professor
    public void printInfo(Announcement ann){
        System.out.println(ann);        
    }



}