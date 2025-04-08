/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;




//public class File_handling {
//    public static void main (String[] args) throws IOException {
//        int key = 6;
//        String message = "I Love you,\nGwapa ko,\nBoutan si maam";
//        String encrypted = encryptmessage(message, key);
//     
//        System.out.println("Original message: " + message);
//        System.out.println("Encrypted message: " + encrypted);
//    }
//    
//    try {
//    FileWriter myName = new FileWriter("C:\\Users\\DH-PC\\Desktop\\HJLihotan.txt.");
//    myName.write("\nI Love you,\nGwapa ko,\nBoutan si maam");
//    System.out.println("Encrypted message has been saved");
//}   catch (IOException e) static {
//    System.out.println("An error occurred while saving the message.");
//    
//}
//   
//    private static String encryptmessage(String message, int key) {
//           char[] chars = message.toCharArray();
//           
//           for (int i = 0; i < chars.length; i++){
//               chars[i] += key;
//           }
//    
//    return new String(chars);
//    }
//}

//import java.io.FileWriter;
//import java.io.IOException;
//
//public class File_handling {
//    public static void main(String[] args) {
//        int key = 6;
//        String message1 = "I Love you!";
//        String message2 = "Gwapa ko!";
//        String message3 = "Boutan si maam";
//        
//
//        System.out.println("Original message: \nI Love you!, \nGwapa ko!, \nBoutan si maam");
//        System.out.println("Encrypted message:");
//        System.out.println(encryptMessage(message1, key));
//        System.out.println (encryptMessage(message2, key));
//        System.out.println (encryptMessage(message3, key));
//
//      
//        try {
//            FileWriter myName = new FileWriter("C:\\Users\\DH-PC\\Desktop\\HJLihotan.txt");
//            myName.write(encrypted);
//            myName.close();
//            System.out.println("Encrypted message has been saved.");
//        } catch (IOException e) {
//            System.out.println("An error occurred while saving the message.");
//            e.printStackTrace(); 
//        }
//    }
//
//    private static String encryptMessage(String message, int key) {
//        char[] chars = message.toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            chars[i] += key;
//        }
//
//        return new String(chars);
//    }
//}
//
import java.io.FileWriter;
import java.io.IOException;

public class File_handling {
    public static void main(String[] args) {
        int key = 6;
        String message1 = "I Love you!";
        String message2 = "Gwapa ko!";
        String message3 = "Boutan si maam";

        System.out.println("Original message: \nI Love you!, \nGwapa ko!, \nBoutan si maam");
        System.out.println("Encrypted message:");

        String encrypted1 = encryptMessage(message1, key);
        String encrypted2 = encryptMessage(message2, key);
        String encrypted3 = encryptMessage(message3, key);

        System.out.println(encrypted1);
        System.out.println(encrypted2);
        System.out.println(encrypted3);

        String encrypted = encrypted1 + "\n" + encrypted2 + "\n" + encrypted3;

        try {
            FileWriter myName = new FileWriter("C:\\Users\\DH-PC\\Desktop\\HJLihotan.txt");
            myName.write(encrypted);
            myName.close();
            System.out.println("Encrypted message has been saved.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the message.");
            e.printStackTrace(); 
        }
    }

    private static String encryptMessage(String message, int key) {
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;
        }

        return new String(chars);
    }
}

        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
      

  
                
      