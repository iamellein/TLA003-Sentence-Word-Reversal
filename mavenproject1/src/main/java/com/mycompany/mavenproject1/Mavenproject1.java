/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author ellei
 */
public class Mavenproject1 {

  
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        
        sentence = sentence.trim();
        Stack<String> stack = new Stack<>();
        
        Scanner wordScanner = new Scanner (sentence);
       while (wordScanner.hasNext()) {
            stack.push (wordScanner.next());
           
        }
        System.out.print("Reverse word Order: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        scanner.close();
    }
}
