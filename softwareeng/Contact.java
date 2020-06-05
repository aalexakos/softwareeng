package softwareeng;

import java.awt.Desktop;  
import java.io.*;  
import java.io.BufferedReader;
import java.io.FileReader;

public abstract class Contact {
    private int contactId;

    public int getContactId(){
        return contactId;
    }

    public void viewQuiz(){

        try  
        {  
        //constructor of file class having file as argument  
        File file = new File("quiz.txt");   
        if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not  
        {  
        System.out.println("not supported");  
        return;  
        }  
        Desktop desktop = Desktop.getDesktop();  
        if(file.exists())         //checks file exists or not  
        desktop.open(file);              //opens the specified file  
        System.out.println ("hi");
        }  
        catch(Exception e)  
        {  
        e.printStackTrace();  
        }
    }  
}   