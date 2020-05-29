package softwareeng;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        System.out.println("insert username: ");
        String name = scan.nextLine();
        System.out.println("insert password: ");
        String pwd = scan.nextLine();
        login myObj = new login(name,pwd);
        //System.out.println(myObj.getUsername()+" "+myObj.getPassword());
        myObj.connect();
        if(myObj.isStudent()){
            User usr = new Student ();
            usr.findUser(myObj.getUsername());
        }
        scan.close();
        scan1.close();

      }
}