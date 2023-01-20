/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UC10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author e
 */
public class AreaQuadrado {
     public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
       System.out.println("Digite o numero da base: ");
               double area1 = input.nextDouble();
               
        System.out.println("Digite o numero da Altura: ");
        double area2 = input.nextDouble();
        
        double x = area1*area2;
        
        System.out.println("Resultado e: "+x);
       
   }
}


