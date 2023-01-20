/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variaveis;

/**
 *
 * @author e
 */
public class principal {
    public static void main(String[] args) {
        variavel ex1 = new variavel();
        System.out.println(ex1.x);
        System.out.println(ex1.y);
        
        variavel ex2 = new variavel();
        System.out.println(ex2.x); //como o x pertence ao ex1 ele valera em ex2 o mesmo em q vale em ex1
        System.out.println(ex2.y); //como o y esta em static ele é incrementado em qlqr outra classe
        
    }
}
