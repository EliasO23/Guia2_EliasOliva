/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_eliasoliva;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio1_EliasOliva {

    public static void main(String[] args) {
        
        String palabra, numero;
        int num;
        
        palabra = JOptionPane.showInputDialog("Escriba una palabra: ");
        numero = JOptionPane.showInputDialog("Escriba un numero entero: ");
        
        num = Integer.parseInt(numero);
        
        System.out.println("La palabra " + palabra + " se imprime " + num + " veces: \n");
        for (int i=0; i<num; i++){
            System.out.println("- " + palabra);
        }
    }
}
