public abstract class Multimedia{


    protected String platform; 
    protected String type;  // online or offline
    public Multimedia(final String plat, final String typ ){
        this.platform = palt;
        this.type = type;

    }

    Scanner ob = new Scanner(System.in);
    System.out.println("Parakalw eisagete tin taxitita sas (se mbp/s)");
    int speed = ob.nextLine();

    public boolean checkconnection(speed){
        if ( speed < 5){
            System.out.println("I taxitita sas den eparkei gia tin online sindesi");
            return false;
        }else{
            System.out.println("Epitixis sindesi");
            return true;
        }
    

    }



}