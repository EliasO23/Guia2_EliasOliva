/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3_eliasoliva;

import javax.swing.JOptionPane;

/**
 *
 * @author MINEDUCYT
 */
public class Ejercicio3_EliasOliva {

    public static void main(String[] args) {
        
        String number1, number2, number3;
        
        System.out.println("Conoce el numero mayor ingresado de 3 numeros\n");
        
        number1 = JOptionPane.showInputDialog("Ingrese el primer numero: ");
        number2 = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
        number3 = JOptionPane.showInputDialog("Ingrese el tercer numero: ");
        
        float num1, num2, num3;
        
        num1 = Float.parseFloat(number1);
        num2 = Float.parseFloat(number2);
        num3 = Float.parseFloat(number3);
        
        float numMax = num1;
        if (num2 > numMax)
            numMax = num2;
        
        if (num3 > numMax)
            numMax = num3;
        
        System.out.println("El numero mayor es el numero: " + numMax);
        
                
                
        
    }
}
