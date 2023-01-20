/*
 ANALISAR DIFERENTES RESULTADOS
 */
package UC10;

import java.util.Scanner;

/**
 *
 * @author e
 */
public class EscolhaDeNumero {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
      
        
        System.out.println("Escolha um numero de 1 a 5: ");
        int n= entrada.nextInt();
        switch (n){
        case 1:
            System.out.println("Escolheu 1.");
            break;
        
            case 2:
            System.out.println("Escolheu 2.");
            break;
            
            case 3:
            System.out.println("Escolheu s.");
            break;
            
            case 4:
            System.out.println("Escolheu 4.");
            break;
            
            case 5:
            System.out.println("Escolheu 5.");
            break;
            
            default:
            System.out.println("error");
        }
    }
}   

