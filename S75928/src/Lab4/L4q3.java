/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class L4q3 {
   public static void main(String[] args) {
        int currentYear = 2024;
        String input = JOptionPane.showInputDialog("Enter IC number:");
        String yearPart = input.substring(0, 2); //dia akan baca 0 dgn 1 je.
        String monthPart = input.substring(2, 4);
        String dayPart = input.substring(4, 6);
        int birthYear = Integer.parseInt(yearPart);
        int month = Integer.parseInt(monthPart);
        int day = Integer.parseInt(dayPart);
        birthYear = birthYear + 2000;
        int age = currentYear - birthYear;
        String message = String.format("Birth date is %d-%d-%d",day,month,birthYear)+
                         String.format("\n Age is %d ",age);
        JOptionPane.showMessageDialog(null, message);
    }  
}