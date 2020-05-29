package softwareeng;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class User{
    protected String name;
    protected String lastName;
    protected String email;
    protected int age;

    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public String getEmail() {
        return email;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public int  getAge() {
        return age;
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
                    System.out.println( "name: "+name+"\nlast name: "+lastName+"\nemail: "+email+"\nage: "+age);
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