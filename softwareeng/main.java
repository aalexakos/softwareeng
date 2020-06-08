package softwareeng;
import java.util.Scanner;
import java.lang.*;

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

    public static void display_multimedia_s(){
        System.out.println ( "1) Apantisi se psifoforia \n2) Epilogi video \n" );
        System.out.print ( "Epilogh?: \n" );
    }

    public static void display_calendar_s(){
        System.out.println ( "1) Provoli events \n2) Diagrafi event \n3) Dimiourgia event\n" );
        System.out.print ( "Epilogh?: \n" );
    }

    public static void display_calendar_p(){
        System.out.println ( "1) Provoli events \n2) Diagrafi event \n3) Dimiourgia event\n4) Dimiourgia deadline\n" );
        System.out.print ( "Epilogh?: \n" );
    }

    public static void display_notes_p(){
        System.out.println ( "1) Anevase simeiwsi\n2) Diegrapse simeiwsi\n3) Provoli simeiwsis\n");
        System.out.print ( "Epilogh?: " );
    }

    public static void display_announcement_p(){
        System.out.println ( "1) Emfanisi anakoinwsewn \n2) Dimiourgia \n3) Diagrafi\n" );
        System.out.print ( "Epilogh?: " );
    }

    public static void display_multimedia_p(){
        System.out.println ( "1) Sindesi \n2) Dimiourgia psifoforias \n3) Provoli apotelesmatwn \n4) Anevasma videodialeksis\n " );
        System.out.print ( "Epilogh?: \n" );
    }

    public static void display_menu(){
        System.out.println ( "1) Simeiwseis \n2) Epikoinwnia \n3) Anakoinwseis \n4) Polumesa \n5) Hmerologio \n6) Exit\n" );
        System.out.print ( "Epilogh?: \n" );
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
                        P_Announcements p4 = new P_Announcements();
                        p4.printInfo();
                        break;
                    case 4:
                        display_multimedia_s();
                        S_Multimedia sm1 = new S_Multimedia();
                        switch ( in.nextInt() ) {
                            case 1: 
                                sm1.ansVote();
                                System.out.println("\nH apantisi sas, anevike me epituxia!\n");
                                break;
                            case 2:
                                sm1.chooseVid();
                                break;
                        }
                    case 5:
                        display_calendar_s();
                        switch ( in.nextInt() ) {
                            case 1:     
                                S_Calendar sc = new S_Calendar();
                                sc.printEvent();
                                break;
                            case 2:
                                S_Calendar sc1 = new S_Calendar();
                                Scanner cal = new Scanner(System.in);
                                System.out.println("eisagete to id tou event pou thelete na diagrapsete: ");
                                int cal1 = scan.nextInt();
                                sc1.delEvent(cal1);
                                break;
                            case 3:
                                S_Calendar sc2 = new S_Calendar();
                                sc2.createEvent();
                                break;
                        }
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
                Professor prof = new Professor();
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
                    display_announcement_p();
                    switch ( in.nextInt() ) {
                        case 1: 
                            P_Announcements p1 = new P_Announcements();
                            p1.printInfo();
                            break;
                        case 2:
                            P_Announcements p2 = new P_Announcements();
                            System.out.println("Eisagwsi titloun\n");
                            Scanner titlos = new Scanner(System.in);
                            String t =titlos.nextLine();
                            System.out.println("---\n");
                            System.out.println("Eisagwsi keimenou\n");
                            Scanner keimeno = new Scanner(System.in);
                            String k =keimeno.nextLine();
                            p2.creAnn(t, k);
                            System.out.println("Oi anakinwsi sas, anevike me epituxia!");
                            break;   
                        case 3:
                            P_Announcements p3 = new P_Announcements();
                            System.out.println("Poia anakoinwsi thelete na diagrapsete?\n");
                            p3.delAnn();
                            break;
                    }
                    case 4:
                        display_multimedia_p();
                        switch ( in.nextInt() ) {                       
                            case 1: 
                                P_Multimedia m2 = new P_Multimedia();
                                m2.creatPlatforms();
                                System.out.println("Poia platforma thelete na xrisimopoiisete?\n");
                                Scanner platforma = new Scanner(System.in);
                                String plat =platforma.nextLine();
                                System.out.println("I platforma" + " " + plat + " " + "ksekinaei amesws!");
                                break;
                            case 2:
                                P_Multimedia m3 = new P_Multimedia();
                                m3.createVote();
                                break;   
                            case 3:
                                P_Multimedia m4 = new P_Multimedia();
                                m4.checkResults();
                                break;
                            case 4:
                                P_Multimedia m5 = new P_Multimedia();
                                m5.offline();                       
                            break;
                        
                    }                
                    case 5:
                        display_calendar_p();
                        switch ( in.nextInt() ) {
                            case 1:     
                                P_Calendar pc = new P_Calendar();
                                pc.printEvent();
                                break;
                            case 2:
                                P_Calendar pc1 = new P_Calendar();
                                Scanner cal = new Scanner(System.in);
                                System.out.println("eisagete to id tou event pou thelete na diagrapsete: ");
                                int cal1 = scan.nextInt();
                                pc1.delEvent(cal1);
                                break;
                            case 3:
                                P_Calendar pc2 = new P_Calendar();
                                pc2.createEvent();
                                break;
                            case 4:
                                P_Calendar pc3 = new P_Calendar();
                                pc3.makeDeadline();
                        }
                    
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