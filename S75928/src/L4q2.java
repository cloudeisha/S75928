
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class L4q2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter radius :");
        float radius = Float.parseFloat(input);
        
        double diameter = 2*radius;
        double circumference = 2*3.14159*radius;
        double area = 3.14159*radius*radius;
        String message = String.format("The diameter is %.2f",diameter)+ //%.2f= 2 floating point.GUNA COMMA,bukan "+"
                String.format("The circumference is %.2f",circumference)+
                String.format("The area is %.2f",area); //utk pilih how many decimal places we want.

        
        JOptionPane.showMessageDialog(null,message);//
        JOptionPane.showMessageDialog(null,message);//
        JOptionPane.showMessageDialog(null,message); // 3 ni JOPtion class yang biasa (display all decimal places
    }
}
