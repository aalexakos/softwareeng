package softwareeng;

import java.io.BufferedReader;
import java.io.FileReader;

public class Student extends User{
    private int am;
    

    public int getAm(){
        return am;
    }

    public boolean findUser(String user){
        boolean isLoginSuccess = false;
        try {
            FileReader fr = new FileReader("kappa.txt");
            BufferedReader br = new BufferedReader(fr);
            String line,username;
            int age;
            while ((line = br.readLine()) != null) {
                username = line.split(" ")[0].toLowerCase();
                if (user.equals(username)) {
                    isLoginSuccess = true;
                    name = line.split(" ")[2].toLowerCase();
                    lastName = line.split(" ")[3].toLowerCase();
                    email = line.split(" ")[4].toLowerCase();
                    age = Integer.valueOf(line.split(" ")[5]);
                    am = Integer.valueOf(line.split(" ")[6]);
                    System.out.println( "this is a student \nname: "+name+"\nlast name: "+lastName+"\nemail: "+email+"\nage: "+age+"\nam: "+am) ;
                    break;
                } 
            }
            if (!isLoginSuccess) {
                System.out.println( "USERNAME/PASSWORD WRONG");
            }
            fr.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isLoginSuccess;
            
        }
}