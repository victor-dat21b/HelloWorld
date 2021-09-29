import javax.annotation.processing.Filer;
import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.Reader;

import java.io.*;
public class CrossWords {


    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\\\Users\\\\vkmic\\\\Desktop\\\\3LetterWord_Unicode.txt");
            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}




/*
public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\vkmic\\Desktop\\3LetterWord_Unicode.txt"));
            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        }
        catch (Exception ex){
            return;
 */