public class Stu_cal extends Calendar {
    public Stu_cal(){}
    
    Calendar event10 = new Calendar();
    Calendar event20 = new Calendar();
    Calendar event30 = new Calendar();
    Calendar event40 = new Calendar();
    event1.setDay(21);
    event1.setMonth(3);
    event1.set.Year(2020);

    public void printInfo(){
        System.out.println(event1.getDay() + "-" + event1.getMonth() + "-" + event1.getYear());
    }

    public void delEvent(Calendar e){
        e = null;
    }
    
    
    
}