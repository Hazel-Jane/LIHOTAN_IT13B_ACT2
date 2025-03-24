/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class simple_calcu {
    
    public static int addNum(int x , int y){
        return x+y;
        
    }
    public static int subNum(int x , int y){
        return x-y;
    }
    
    public static int mulNum(int x , int y){
        return x*y;
    }
      
    public static int divNum(int x , int y){
        return x/y;
    }
    
    public static int percentNum(int x , int y){
        return x%y;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        
        System.out.println();
        int h = 22, j = 27;
        System.out.println("The Addition: " + addNum(h,j));
        System.out.println("The Subtraction: " + subNum(h,j));  
        System.out.println("The Multiplication: " + mulNum(h,j));
         System.out.println("The Division: " + divNum(h,j));
        System.out.println("The Percentage: " + percentNum(h,j));
    }
}
