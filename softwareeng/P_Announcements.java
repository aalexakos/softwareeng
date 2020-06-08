package softwareeng;

import java.util.ArrayList;
public class P_Announcements extends Announcement {
    protected ArrayList<Announcement> ann = new ArrayList<Announcement>();


    public P_Announcements(){
        final Announcement an1 = new Announcement();
        
        an1.setAname("Dilwsi eksetasis mathimatos\n");
        an1.setText("Parakalw dilwste oti epithymeite na eksetastite se ayto to mathima kanontas reply ayto to mhnyma \n");
        ann.add(an1);
    }


    public void creAnn(final String name,final String txt){
        
        final Announcement an2 = new Announcement();
        an2.setAname(name);
        an2.setText(txt);
        ann.add(an2);
        
    }
    
    public void delAnn(){
        System.out.println(" \n H anakoinwsi diagraftike epitixws!");
    }
    
    //global anakinwsi apo ton professor
    public void printInfo(){
        int i;
        for(i = 0; i<ann.size();i++){
            System.out.println(ann.get(i).getName() + ann.get(i).getId() + ann.get(i).getText());
        }
                
    }




}