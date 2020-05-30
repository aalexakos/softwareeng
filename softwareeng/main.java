package softwareeng;
import java.util.Scanner;

public class main {
    public static void display_menu_professor(){
        System.out.println ( "1) New quiz\n2) View quizes \n3) exit" );
        System.out.print ( "Selection: " );
    }

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
            User stnt = new Student ();
            stnt.findUser(myObj.getUsername());
        }
        else {
            while (true){
                User prof = new Professor ();
                prof.findUser(myObj.getUsername());
                Scanner in = new Scanner ( System.in );
        
                display_menu_professor();
                switch ( in.nextInt() ) {
                case 1:
                    ContactP cp = new ContactP();
                    cp.createQuiz();
                    break;
                case 2:
                ContactP cp1 = new ContactP();
                    cp1.viewQuiz();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println ( "Unrecognized option" );
                    break;
                }
            }
        }   
        scan.close();
        scan1.close();
      }
}