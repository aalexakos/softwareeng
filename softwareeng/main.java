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
        System.out.println ( "1) Simeiwseis \n2) Epikoinwnia \n3) Anakoinwseis \n4) Polumesa \n5) Hmerologio \n6) Exit" );
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
        
        myObj.connect();
         //this is the menu for the STUDENT
        if(myObj.isStudent()){
            while (true){
                Student st = new Student();
                st.findUser(myObj.getUsername());
                Scanner in = new Scanner ( System.in );
        
                display_menu();
                switch ( in.nextInt() ) {
                    case 1:
                        display_notes_s();
                        switch ( in.nextInt() ) {
                            case 1: 
                                notesS ns =new notesS();
                                ns.uploadNote();
                                break;
                            case 2:
                                notesS ns1 =new notesS();
                                ns1.removeSNote();
                                break;   
                            case 3:
                                notesS ns3 =new notesS();
                                ns3.viewNotes();
                                break; 
                        }
                        break;
                    case 2:
                        display_contact_s();
                        switch ( in.nextInt() ) {
                            case 1: 
                                ContactS cs =new ContactS();
                                cs.takeQuiz();
                                break;
                            case 2:
                                ContactS cs1 =new ContactS();
                                cs1.viewQuiz();
                                break;   
                        }
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:

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
        //this is the menu for the PROFESSOR
        else {
            while (true){
                User prof = new Student();
                prof.findUser(myObj.getUsername());
                Scanner in = new Scanner ( System.in );
        
                display_menu();
                switch ( in.nextInt() ) {
                    case 1:
                        display_notes_p();
                        switch ( in.nextInt() ) {
                            case 1:
                                notesP np = new notesP();
                                np.uploadNote();
                                break;
                            case 2: 
                                notesP np1 = new notesP();
                                np1.deleteNote();
                                break;
                            case 3:
                                notesP np3 = new notesP();
                                np3.viewNotes();
                                break;
                        }
                    case 2:
                        display_contact_p();
                        switch ( in.nextInt() ) {
                            case 1: 
                                ContactP cp = new ContactP();
                                cp.createQuiz();
                                break;
                            case 2:
                                ContactP cp1 = new ContactP();
                                cp1.viewQuiz();
                                break;
                        }
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

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