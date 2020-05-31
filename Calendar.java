public abstract class Calendar {

    protected int day;
    protected int month;
    protected int year;
    protected String name;
    
    public Calendar(){
        
    }

    public void setDay(final int dayy) {
        if (dayy < 1 || dayy > 31) {
            throw new IllegalArgumentException();
        }
        this.day = dayy;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(final int mon) {
        if ( mon < 1 || mon > 12){
            throw new IllegalArgumentException();
        }
        this.month = mon;

    }

    public int getMonth(){
        return month;

    }

    public void setYear(int ye){
        if ( ye < 1){
            throw new IllegalArgumentException();
        }
        this.year = ye;
        
    }

    public int getYear(){
        return year;
    }

    public void setDay(final String na) {
        this.name = na;
    }

    public int getYear(){
        return name;
    }



}

