/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UC10;

import java.util.Scanner;

/**
 *
 * @author e
 */
public class Calcularora {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int x = input.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int y = input.nextInt();
        
   
        int calc = x + y;
        int calc2 = x - y;
        int calc3 = x * y;
        int calc4 = x / y;
        System.out.println("O resultado da soma e: "+calc);
        System.out.println("O resultado da subtracao e: "+calc2);
        System.out.println("O valor da multiplicacao e: "+calc3);
        System.out.println("O resultado da divisao e: "+calc4);
        
    }
}
