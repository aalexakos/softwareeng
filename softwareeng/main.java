package softwareeng;
import java.util.Scanner;

public class main {

    public static void display_contact_p(){
        System.out.println ( "1) Neo quiz\n2) Provoli twn quizes");
        System.out.print ( "Epilogh?: " );
    }
    public static void display_contact_s(){
        System.out.println ( "1) Pare quiz\n2) Provoli quizes");
        System.out.print ( "Epilogh?: " );
    }

    public static void display_notes_s(){
        System.out.println ( "1) Anebase simeiwsh \n2) Diagrafi simeiwshs mou \n3) Provoli simeiwsewn");
        System.out.print ( "Epilogh?: " );
    }

    public static void display_notes_p(){
        System.out.println ( "1) Anevase simeiwsi\n2) Diegrapse simeiwsi\n3) Provoli simeiwsis");
        System.out.print ( "Epilogh?: " );
    }

    public static void display_menu(){
        System.out.println ( "1) Simeiwseis \n2) Epikoinwnia \n3) Anakoinwseis \n4) Pokumesa \n5) Hmerologio \n6) Exit" );
        System.out.print ( "Epilogh?: " );
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
        
                display_menu();
                switch ( in.nextInt() ) {
                    case 1:
                        display_notes_p();
                        break;
                    case 2:
                        display_contact_s();
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:

                        break;
                    case 6:
                
                        break;
                    case 7:

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
        
                display_menu();
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