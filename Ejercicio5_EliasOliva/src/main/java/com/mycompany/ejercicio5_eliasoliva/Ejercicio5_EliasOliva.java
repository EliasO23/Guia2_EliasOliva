/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5_eliasoliva;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio5_EliasOliva {

    public static void main(String[] args) {
        String radio;
        
        System.out.println("Calculadora de Area y Volumen de una Circunferencia\n");
        
        radio = JOptionPane.showInputDialog("Ingrese el radio en cm de la circunferencia: ");
        final double pi = 3.141592653;
        
        double r, area, volumen;
        
        r = Double.parseDouble(radio);
        
        System.out.println("Area de una circunferencia de radio: " + r);
        area = pi * (r*r);
        System.out.println("El Area es: " + area + " cm");
        
        System.out.println("\nVolumen de una circunferencia de radio: " + r);
        volumen = (4.0/3.0)* pi * (r*r*r);
        System.out.println("El Volumen es: " + volumen + " cm");
        
        
    }
}
