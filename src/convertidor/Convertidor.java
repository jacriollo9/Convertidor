/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Convertidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        
        // Declaración y inicilización de variables
        
        double Metros, Centimetros, Kilometros, Pie, Pulgada;
        
        Metros = 0; Centimetros = 0; Kilometros = 0; Pie = 0; Pulgada = 0;
        
        //Ingresa valor en metros
        
        Metros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor en metros: "));
        
        //Salida de datos
        
        // Calcula la cantidad de metros a centimetroa
        Centimetros = Metros * 100;
        
        // Calcula la cantidad de metros a Kilometros
        Kilometros = Metros / 1000;
        
        // Calcula la cantidad de metros a Pie
        Pie = Metros * 3.28;
        
        // Calcula la cantidad de metros a Pulgadas
        Pulgada = Metros * 39.37;
        
        System.out.println("El valor de metros a centimetros es: " +Centimetros);
        System.out.println("El valor de metros a Kilometros es: "+Kilometros);
        System.out.println("El valor de metros a Pies es: "+Pie);
        System.out.println("El valor de metros a Pulgadas es: "+Pulgada);
    }  
}

