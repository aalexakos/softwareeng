import java.util.ArrayList;
public class P_Announcements extends Announcements {
    protected ArrayList<professor_a> ann = new ArrayList<professor_a>();
    

    Announcements an1 = new Announcements("Dilwsi eksetasis mathimatos", 54, d, "bla bla");
    Announcements an2 = new Announcements("Paratasi 3 imerwn gia tin paradosi eksaminieas ergasias", 58, d, "bla bla");
    Announcements an3 = new Announcements("Anakinwsi vathmologias sto psifiako alma", 12, d,"bla bla");


    public void creAnn(Announcements a){
        ann.add(a);
    }
    
    public void delAnn(Announcements a){
        ann.remove(a);
    }
    
    //global anakinwsi apo ton professor
    public void printInfo(List ann){
        System.out.println(ann);        
    }



}