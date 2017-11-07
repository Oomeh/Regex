/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author bvance
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean firstMatch = false;
        boolean secondMatch = false;
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
            scanner.close();
        }
        Pattern pattern = Pattern.compile("(\\d{3,4})");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            if(firstMatch == false){
                System.out.print("(" + matcher.group() + ") ");   
                        
                firstMatch = true;
            }
            else{
                
                if(secondMatch == false){
                    System.out.print(matcher.group() + "-");
                    secondMatch = true;
                }
                else{
                    System.out.println(matcher.group());
                }
            }
        }
    }
}