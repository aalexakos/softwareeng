import java.util.ArrayList;
public class professor_a extends Announcements {
    protected ArrayList<professor_a> ann = new ArrayList<professor_a>();
    private Announcements p_a = null;   //sindesi me Announcements
    

    Announcements an1 = new Announcements("Dilwsi eksetasis mathimatos", 54, d);
    Announcements an2 = new Announcements("Paratasi 3 imerwn gia tin paradosi eksaminieas ergasias", 58, d);
    Announcements an3 = new Announcements("Anakinwsi vathmologias sto psifiako alma", 12, d);


    public void creAnn(Announcements a){
        ann.add(a);
    }
    
    public void delAnn(Announcements a){
        ann.remove(a);
    }
    
    //global anakinwsi apo ton professora
    public void printInfo(List ann){
        System.out.println(ann);        
    }




























    
}