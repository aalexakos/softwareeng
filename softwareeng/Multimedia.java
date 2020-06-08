package softwareeng;

import java.util.Scanner;

public class Multimedia{

    protected String platform; 
    protected String type;  // online or offline

    public void setPlatform(String plat){
        platform=plat;
    }

    public void setType(String typ){
        type=typ;
    }

    public boolean checkconnection(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Eisagete tin taxythta: ");
        int speed = ob.nextInt();
        if ( speed < 5){
            System.out.println("I taxitita sas den eparkei gia tin online sindesi");
            ob.close();
            return false;
        }else{
            System.out.println("Epitixis sindesi");
            ob.close();
            return true;
        }

    }



}