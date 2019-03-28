package com.javacore.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    static final String APP_NAME = "Steve";
    static String author = "Telegin Dmitrii";
    static  String version = "0.0.0";
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String command = reader.readLine();
            if (!command.isEmpty()) {
                if (command.equals("version")) {
                    System.out.println("My version name is " + version);
                }
                if (command.equals("author") || command.equals("creator") || command.equals("father")) {
                    System.out.println("My author's name is " + author);
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
