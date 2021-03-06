/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

    }

    public static int readJavaScript(String path) {
        String line = "";
        int index = 0;
        int missingSemicolon = 0;

        try {
            Scanner sc = new Scanner(new File(path));
            while (sc.hasNextLine()) {
                index++;
                line = sc.nextLine();
                if(!line.endsWith(";") && !line.endsWith("{") && !line.endsWith("}") && !line.contains("if")
                        && !line.contains("else") && !line.isEmpty() ) {
                    System.out.println("line " + index +" is missing semicolon");
                    missingSemicolon++;
                }
            }
        }

        catch(FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e);
        }
        return missingSemicolon;
    }
}
