/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4q1 {
   public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Enter first integer:");
       int num1 = input.nextInt();
       System.out.print("Enter second integer:");
       int num2 = input.nextInt();
       
       int square1= num1*num1;
       int square2 = num2*num2;
       int sumSquare = square1 + square2;
       int diffSquare =square1 - square2;
       
       System.out.println("The square of the first integer is " + square1);
       System.out.println("The square of the second integer is " + square2);
       System.out.println("The sum of both square is " + sumSquare);
       System.out.println("The difference between both square is " + diffSquare);
    } 
}
