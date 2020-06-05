import java.util.Scanner;

public class P_Calendar extends Calendar {


    Calendar event1 = new Calendar();   //make events
    Calendar event2 = new Calendar();
    Calendar event3 = new Calendar();
    Calendar event4 = new Calendar();
    event1.setDay(21);
    event1.setMonth(3);
    event1.set.Year(2020);

    public void printInfo(Calendar e){
        System.out.println(e.getDay() + "-" + e.getMonth() + "-" + e.getYear());
    }

    public void delEvent(Calendar e){
        e = null;
    }


    public void makeDeadline(Calendar c, int year, int month, int day){

        System.out.println("Parakalw dwse to ID tou imerologiou");
        Scanner ii = new Scanner(System.in);
        int idd = ii.nextLine();
        System.out.println("Tin imerominia tou deadline");
        Scanner yearr = new Scanner(System.in);
        var ye = yearr.nextLine();
        Scanner monthh = new Scanner(System.in);
        var mo = monthh.nextLine();
        Scanner dayy = new Scanner(System.in);
        var da = dayy.nextLine();
        y = Integer.parseInt(ye);
        m = Integer.parseInt(mo);  
        d = Integer.parseInt(da);
        y = year;
        m = month;
        d = day;
        System.out.println("To deadline sas oristike epitixws");
    }







    
}