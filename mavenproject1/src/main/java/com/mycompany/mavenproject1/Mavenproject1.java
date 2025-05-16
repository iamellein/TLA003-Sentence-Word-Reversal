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

    public static void main(String[] args ) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        
        String[] words = sentence.trim().split("\\s+");
        Stack<String> stack = new Stack<>();
        
        for (String word: words){
            stack.push (word);
           
        }
        System.out.print("Reverse word Order: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        scan.close();
    }
}
