package com.javacore.epam;

import com.javacore.epam.command.ACommand;
import com.javacore.epam.command.CommandRegistry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    static public final String APP_NAME = "Steve";
    static public final String AUTHOR = "Telegin Dmitrii";
    static public final String VERSION = "0.0.0";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String commandName = reader.readLine();
            if (!commandName.isEmpty()) {
                if(commandName.equals(args[0])){
                    ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
                    command.execute();
                }
                if (commandName.equals(args[1]) || commandName.equals(args[2]) || commandName.equals(args[3])) {
                    ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
                    command.execute();
                }
                if (commandName.equals(args[5])) {
                    ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
                    command.execute();
                }
            }
            else break;
        }
    }
}
