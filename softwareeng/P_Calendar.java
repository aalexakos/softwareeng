package softwareeng;

import java.util.Scanner;

public class P_Calendar extends Calendar {


   
    public void printInfo(Calendar e){
        System.out.println(e.getDay() + "-" + e.getMonth() + "-" + e.getYear());
    }

    public void delEvent(Calendar e){
        e = null;
    }

    public void newEvent(){
        Calendar event1 = new Calendar();   //make events
        event1.setMonth(month);
        event1.setYear(year);
        event1.setDay(day);
    
    }

    public void makeDeadline(Calendar c, int year, int month, int day){

        System.out.println("Parakalw dwse to ID tou imerologiou");
        Scanner ii = new Scanner(System.in);
        int idd = ii.nextInt();
        System.out.println("Tin imerominia tou deadline");
        Scanner yearr = new Scanner(System.in);
        var ye = yearr.nextLine();
        Scanner monthh = new Scanner(System.in);
        var mo = monthh.nextLine();
        Scanner dayy = new Scanner(System.in);
        var da = dayy.nextLine();
        year = Integer.parseInt(ye);
        month = Integer.parseInt(mo);  
        day = Integer.parseInt(da);
        dayy.close();
        yearr.close();
        ii.close();
        monthh.close();
        System.out.println("To deadline sas oristike epitixws");
    }







    
}