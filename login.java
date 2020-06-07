package softwareeng;

import java.io.BufferedReader;
import java.io.FileReader;

public class login{
     public static String username;
     private String password;

    
    public login (String usr,  String pasw){
    
        username = usr;
        password = pasw;  
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
            return password;
    }
    
public boolean connect(){
    boolean isLoginSuccess = false;
    try {
        FileReader fr = new FileReader("kappa.txt");
        BufferedReader br = new BufferedReader(fr);
        String line,user,pass;
        while ((line = br.readLine()) != null) {
            user = line.split(" ")[0].toLowerCase();
            pass = line.split(" ")[1].toLowerCase();
            if (user.equals(username) && pass.equals(password)) {
                isLoginSuccess = true;
                System.out.println( "USERNAME/PASSWORD correct");
                break;
            } 
        }
        if (!isLoginSuccess) {
            System.out.println( "USERNAME/PASSWORD WRONG");
            System.exit(0);
        }
        fr.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
    return isLoginSuccess;
        
    }

    public boolean isStudent(){
        String faculty = "faculty",email;
        boolean returnedValue=false;
        try{
            FileReader fr = new FileReader("kappa.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if(line.split(" ")[0].toLowerCase().equals(getUsername())){
                    email = line.split(" ")[4].toLowerCase();
                    if (email.contains(faculty)){
                        returnedValue= false;
                        break;
                    }
                    else    
                        returnedValue= true;
                        break;
                }
            }
            fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return returnedValue;
    
    }

}

