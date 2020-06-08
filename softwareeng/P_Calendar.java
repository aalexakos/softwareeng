package softwareeng;

import java.util.Scanner;

public class P_Calendar extends Calendar {

    public int year;

    public void newEvent(){
        Calendar event1 = new Calendar();   //make events
        event1.setMonth(month);
        event1.setYear(year);
        event1.setDay(day);
    
    }

    public void printInfo(){
        System.out.println(getDay() + "-" + getMonth() + "-" + getYear());
    }

    public void delEvent(Calendar e){
        e = null;
    }
    public void makeDeadline(int ye, int mo, int da){
        setDay(mo);
        setYear(ye);
        setDay(da);
        System.out.println("To dead line dimiourgithike tin imerominia:" + da + "//" + mo +"//"+ "//"+ye );
    }



/*
    public void makeDeadline(int year, int month, int day){

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

*/





    
}