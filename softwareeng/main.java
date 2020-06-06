package softwareeng;
import java.util.Scanner;

public class main {
    public static void display_menu_professor(){
        System.out.println ( "1) New quiz\n2) View quizes \n3) Upload note \n4) Delete note \n5) View notes \n6) download note \n7)Rate a note \n8)Exit" );
        System.out.print ( "Selection: " );
    }

    public static void display_menu_student(){
        System.out.println ( "1) Take quiz\n2) View quizes \n3) Upload note \n4) Delete my own note \n5) View notes \n7)download note \n8) Exit" );
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
            while (true){
                User prof = new Professor ();
                prof.findUser(myObj.getUsername());
                Scanner in = new Scanner ( System.in );
        
                display_menu_student();
                switch ( in.nextInt() ) {
                    case 1:
                        
                        //take quiz
                        break;
                    case 2:
                        ContactP cp1 = new ContactP();
                        cp1.viewQuiz();
                        break;
                    case 3:
                        notesP np = new notesP();
                        np.uploadNote();
                        break;
                    case 4:
                        notesS ns = new notesS();
                        System.out.println("ID of the note that you want to delete: ");
                        int in1 = scan.nextInt();
                        ns.removeSNote(in1);
                        break;
                    case 5:
                        notesS ns1 = new notesS();
                        ns1.viewNotes();
                        break;
                    case 6:
                        notesS np2 = new notesS();
                        System.out.println("ID of the note that you want to download: ");
                        int in2 = scan.nextInt();
                        np2.downloadNotes(in2);
                        break;
                    case 7:
                        notesS ns3 = new notesS();
                        ns3.rateNotes();
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    default:
                        System.err.println ( "Unrecognized option" );
                        break;
                }
            }
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
                        notesP np = new notesP();
                        np.uploadNote();
                        break;
                    case 4:
                        notesP np1 = new notesP();
                        System.out.println("path of the note that you want to delete: ");
                        String in1 = scan.nextLine();
                        np1.deleteNote(in1);
                        break;
                    case 5:
                        notesP np2 = new notesP();
                        np2.viewNotes();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.err.println ( "Unrecognized option" );
                        break;
                 }
            }
        }   
      }
}