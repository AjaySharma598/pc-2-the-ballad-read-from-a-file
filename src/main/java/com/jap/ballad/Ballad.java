package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            int line=0;
            while ((line=fileInputStream.read())!=-1){
                char data=(char) line;
                System.out.println("data = " + data);
            }
        }catch (IOException exception){
            System.out.println("exception = " + exception);
        }
        return "";
    }


}
