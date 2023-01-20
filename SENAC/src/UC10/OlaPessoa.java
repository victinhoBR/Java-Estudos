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
public class OlaPessoa {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
       System.out.println("Digite o seu nome: ");
               String nome = input.nextLine();
               
        System.out.println("Digite o seu segundo nome: ");
         String nome2 = input.nextLine();
        
        System.out.println("Digite sua idade: ");
         int idade = input.nextInt();
        
        System.out.println("Olá" +nome+ "de" +nome2+ ", de" +idade+ "anos");
}
}
