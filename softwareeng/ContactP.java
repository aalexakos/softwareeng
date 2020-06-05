package softwareeng;

import java.awt.Desktop;  
import java.io.*;  
import java.io.BufferedReader;
import java.io.FileReader;

public class ContactP extends Contact {

    public void createQuiz(){
        try  
        {  
        //constructor of file class having file as argument  
            File file = new File("quiz.html");   
            if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
            {  
                System.out.println("not supported");  
                    return;  
            }  
            Desktop desktop = Desktop.getDesktop();  
            if(file.exists())         //checks file exists or not  
                desktop.open(file);              //opens the specified file  
            }  
            catch(Exception e)  
            {  
                e.printStackTrace();  
            }
    }

}
