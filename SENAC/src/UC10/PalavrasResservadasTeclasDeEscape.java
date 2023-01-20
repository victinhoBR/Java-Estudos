/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UC10;

//PALAVRAS RESERVADAS E  TECLAS DE ESCAPE

import java.util.Scanner;

public class PalavrasResservadasTeclasDeEscape {
     public static void main(String[]args){
         int x=777;
         Scanner entrada = new Scanner(System.in);
         System.out.println("eu tenho \n" +x+ "\ncachorro grande");
         //pula uma linha (\n)
          System.out.println("eu tenho \t" +x+ "\tcachorro grande");
          //funciona como se fosse um tab (\t)
          System.out.println("eu tenho " +x+ "cachorro \r grande");
          //omite oque vem antes (\r)
          System.out.println("eu \"tenho\" " +x+ "cachorro grande");
          // imprime oque não poderia ser imprimido (\\)
          
         
     }
}
