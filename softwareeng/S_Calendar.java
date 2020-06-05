package softwareeng;

import java.util.ArrayList;

public class S_Calendar extends Calendar {

    private ArrayList<Calendar> ca = new ArrayList<Calendar>();

    public void newEvent(){
        Calendar event10 = new Calendar();
        event10.setMonth(3);
        event10.setYear(2020);
        ca.add(event10);
    }
   
    public void printInfo(Calendar c){
        System.out.println(c.getId()+c.getDay()+c.getMonth()+c.getYear());
    }

    public void delEvent(Calendar e){
        e = null;
    }
    
    
    
}