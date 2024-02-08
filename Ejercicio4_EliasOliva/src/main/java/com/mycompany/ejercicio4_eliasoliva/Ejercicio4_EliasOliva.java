/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4_eliasoliva;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio4_EliasOliva {

    public static void main(String[] args) {
        String largo, ancho;
        
        System.out.println("Calculadora de Area y Perimetro de un Rectangulo\n");
        
        largo = JOptionPane.showInputDialog("Ingrese el largo en cm del rectangulo: ");
        ancho = JOptionPane.showInputDialog("Ingrese el ancho en cm del rectangulo: ");
        
        float L, W, area, perimetro;
        
        L = Float.parseFloat(largo);
        W = Float.parseFloat(ancho);
        
        System.out.println("Area de un Rectangulo " + L + " * " + W);
        area = L * W;
        System.out.println("El Area es: " + area + " cm");
        
        System.out.println("\nPerimetro de un Rectangulo " + L + " * " + W);
        perimetro = (2*L) + (2*W);
        System.out.println("El Perimetro es: " + perimetro + " cm");
        
        
    }
}
