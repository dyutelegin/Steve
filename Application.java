package com.javacore.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    static final String APP_NAME = "Steve";
    static String author = "Telegin Dmitrii";
    static  String version = "0.0.0";
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String command = reader.readLine();
            if (!command.isEmpty()) {
                if (command.equals(args[0])) {
                    System.out.println("My version name is " + version);
                }
                if (command.equals(args[1]) || command.equals(args[2]) || command.equals(args[3])) {
                    System.out.println("My author's name is " + author);
                }
                // if (command.equals(args[4]))
                if (command.equals(args[5])){
                    SimpleDateFormat simpleDate = new SimpleDateFormat("kk:mm:ss a");
                    System.out.println(simpleDate.format(new Date()).toString());
                }
                if (command.matches("[A-Z?]")){
                    System.out.println("I don't understand you, sorry");
                }
            }
            else break;
        }
        reader.close();
    }
}
