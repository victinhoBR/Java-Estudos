/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UC10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author e
 */
public class JogoNumero {
    public static void main(String[] args){
 
 Scanner input = new Scanner(System.in);
 Random random = new Random();
 
 boolean acertou = false;
 int tentativas = 10;
 int numeroSecreto = random.nextInt();
 long chute = 0;
 
 
 while(tentativas > 0 && acertou == false){
 System.out.println("Qual seu chute?");
 chute = input.nextLong();
 
 if(numeroSecreto == chute){
 System.out.println("Você acertou!!");
 acertou = true;} 
 else if(chute < numeroSecreto){
 --tentativas;
 System.out.println("Numero muito pequeno!" + tentativas + " tentativas restantes.");} 
 else{
 --tentativas;
 System.out.println("Numero muito grande!" + tentativas + " tentativas restantes.");}
 
 }
 
 }
}

