package softwareeng;

import java.util.ArrayList;
import java.util.Scanner;

public class S_Calendar extends Calendar {

    public S_Calendar(){
        Calendar event2 = new Calendar();
        event2.setMonth(3);
        event2.setYear(2020);
        ca.add(event2);
    }

    private ArrayList<Calendar> ca = new ArrayList<Calendar>();

    public void printEvent(){
        for (int i=0; i<ca.size(); i++){
           System.out.println(ca.get(i).getId() + "-" + ca.get(i).getDay()+ "-" + ca.get(i).getMonth() + "-" + ca.get(i).getYear());
        }
    }

    public void createEvent(){
        System.out.println("Dwse hmera tou event: ");
        Scanner an = new Scanner(System.in);
        int day = an.nextInt(); 
        System.out.println("Dwse mhna tou event: ");
        Scanner an1 = new Scanner(System.in);
        int month = an.nextInt(); 
        System.out.println("Dwse xrono tou event: ");
        Scanner an2 = new Scanner(System.in);
        int year = an.nextInt(); 
        Calendar ca1 = new Calendar();
        ca1.setDay(day);
        ca1.setMonth(month);
        ca1.setYear(year);
        ca.add(ca1);
    }
    
    public void delEvent(int id){
        for (int i=0; i<ca.size(); i++){
            if (ca.get(i).getId()==id){
                ca.remove(i);
            }
        }
    }
        
    
    
}