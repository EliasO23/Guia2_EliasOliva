/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_eliasoliva;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio2_EliasOliva {

    public static void main(String[] args) {
        String first, second;
        float suma, resta, multiplicacion, division;
        
        first = JOptionPane.showInputDialog("Escriba el primer numero: ");
        second = JOptionPane.showInputDialog("Escriba el segundo numero");
        
        float num1 = Float.parseFloat(first);
        float num2 = Float.parseFloat(second);
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1/num2;
        
        JOptionPane.showMessageDialog (null, "Los numeros se agregaron correctamente \n - Vea el resultado en consola ", "Operaciones basicas", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Operaciones Matematicas Basicas: \n");
        System.out.println("La suma de: " + num1 + " + " + num2 + "\n  Es: " + suma);
        System.out.println("\nLa resta de: " + num1 + " - " + num2 + "\n  Es: " + resta);
        System.out.println("\nLa multiplicación de: " + num1 + " * " + num2 + "\n  Es: " + multiplicacion);
        System.out.println("\nLa division de: " + num1 + " / " + num2 + "\n  Es: " + division);
        
        System.exit (0);
        
    }
}
