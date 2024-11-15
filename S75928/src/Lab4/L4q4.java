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
public class L4q4 {
     public static void main(String[] args) {
      String input = JOptionPane.showInputDialog("Please enter your statement:");
      
      String l = input.toUpperCase();
      String u = input.toLowerCase();
      
      String message = String.format("\nUPPERCASE :%s", l) + String.format("\nLOWERCASE :%s", u);
      
      JOptionPane.showMessageDialog(null, message);
    }
}
