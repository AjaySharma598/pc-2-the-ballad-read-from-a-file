package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        FileInputStream fileInputStream=null;
        String str="";
        try {
            fileInputStream = new FileInputStream(fileName);
            int line=0;
            while ((line=fileInputStream.read())!=-1){
                char data=(char) line;
                str=str+String.valueOf(data);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return str;
    }


}
