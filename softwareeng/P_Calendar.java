package softwareeng;

import java.util.Scanner;
import java.util.ArrayList;

public class P_Calendar extends Calendar {

    


    private ArrayList<Calendar> cp = new ArrayList<Calendar>();

    public void printEvent(){
        for (int i=0; i<cp.size(); i++){
           System.out.println(cp.get(i).getId() + "-" + cp.get(i).getDay()+ "-" + cp.get(i).getMonth() + "-" + cp.get(i).getYear());
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
        cp.add(ca1);
    }
    
    public void delEvent(int id){
        for (int i=0; i<cp.size(); i++){
            if (cp.get(i).getId()==id){
                cp.remove(i);
            }
        }
    }

    public void makeDeadline(){

        System.out.println("Tin imerominia tou deadline");
        Scanner yearr = new Scanner(System.in);
        int ye = yearr.nextInt();
        Scanner monthh = new Scanner(System.in);
        int mo = monthh.nextInt();
        Scanner dayy = new Scanner(System.in);
        int da = dayy.nextInt();
        dayy.close();
        yearr.close();
        monthh.close();
        Calendar ca = new Calendar();
        ca.setDay(day);
        ca.setMonth(month);
        ca.setYear(year);
        cp.add(ca);
        System.out.println("To deadline sas oristike epitixws");
    }

}