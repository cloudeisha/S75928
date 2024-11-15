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
public class L4q6 {
   public static void main(String[] args) {
       Scanner get = new Scanner (System.in);
       System.out.print("Enter x1 :");
       double x1 = get.nextDouble();
       System.out.print("Enter x2 :");
       double x2 = get.nextDouble();
       System.out.print("Enter x3 :");
       double x3 = get.nextDouble();
       
       double mean = (x1+x2+x3)/3;
       double variance =( Math.pow ((x1-mean),2) + Math.pow((x2-mean),2) + Math.pow((x3-mean),2)) /3;
       double standardDeviation = Math.sqrt(variance);
       
       System.out.printf("mean : %.2f\n " , mean);
       System.out.printf("Variance :%.2f\n " , variance);
       System.out.printf("Standard Deviation %.2f\n: " ,standardDeviation);
    } 
}
