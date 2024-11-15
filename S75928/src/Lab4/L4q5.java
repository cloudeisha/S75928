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
public class L4q5 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter distance in meter :");
        double distance = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter time in hour :");
        double hour = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter time in minutes :");
        double minutes = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter time in seconds :");
        double seconds = Double.parseDouble(input);
        
        double sec = (hour*3600)+ (minutes*60)+ seconds;
        double h= hour + (minutes/60) + (seconds/60);
        
        double metersPerSecond = distance / sec;
        double kmPerHour = (distance/1000)/h;
        double milesPerHour = (distance/1609)/h;
        
        String m =String.format("SPEED :") + String.format("\nMeters per second : %.2f", metersPerSecond)+
                  String.format("\nKM per hour :%.2f", kmPerHour) + String.format("\nMiles per hour :%.2f", milesPerHour);
        
        JOptionPane.showMessageDialog(null,m);
    }
}
