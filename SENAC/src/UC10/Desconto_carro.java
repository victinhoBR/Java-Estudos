/*
 Faça um programa em Java que calcule e exiba o valor do desconto e o valor a ser 
pago pelo cliente de vários carros. O desconto deverá ser calculado de acordo com
o ano do veículo. Até 2000 desconto de 12% e acima de 2000 desconto de 7%. 
O sistema deverá perguntar se deseja continuar calculando novos descontos até que
a resposta seja: "( N ) Não )". Informar o total de carros com ano até 2000 
e o total de carros no geral.
 */
package UC10;

import java.util.Scanner;
import java.lang.String;
/**
 *
 * @author e
 */
public class Desconto_carro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("menu\n | X-Bacon -Preço: R$ 20\n | X-Salada -Preço: R$ 15 \n | X-Picanha -Preço: R$ 22 \n | X-Tudo -Preço: R$ 30" );
        
       double  vFinal1, vFinal2, desconto1, desconto2;
       double vcarro;
       int ano;
       int dnv;
       int s= 1;
       int n= 2;
       System.out.println("digite o valor do seu carro. ");
       vcarro=entrada.nextDouble(); 
       
       desconto1=vcarro*0.12;
       desconto2=vcarro*0.07;
       vFinal1=vcarro-desconto1;
       vFinal2=vcarro-desconto2;{
       
     System.out.println("digite o ano do seu carro. ");
     ano=entrada.nextInt();
     
       
     
     if((ano<=2000)){
                    System.out.println("seu carro do ano "+ano+" de valor "+vcarro+" receu o desconto de "+desconto1+" sendo o valor final de "+vFinal1);}
     else if ((ano>2000)){
        System.out.println("seu carro do ano "+ano+" de valor"+vcarro+" receu o desconto de "+desconto2+" sendo o valor final de "+vFinal2);}
     System.out.println("calcular outro? ");
            dnv = entrada.nextInt();
          switch(dnv){
              case 1:
                  System.out.println("digite o valor do seu carro. ");
       vcarro=entrada.nextDouble();
       
       System.out.println("digite o ano do seu carro. ");
     ano=entrada.nextInt();
               if((ano<=2000)){
                    System.out.println("seu carro do ano "+ano+" de valor "+vcarro+" receu o desconto de "+desconto1+" sendo o valor final de"+vFinal1);}
     else if ((ano>=2000)){
        System.out.println("seu carro do ano "+ano+" de valor"+vcarro+" receu o desconto de "+desconto2+" sendo o valor final de"+vFinal2);}
     System.out.println("calcular outro? ");
     dnv = entrada.nextInt();
     
     
     
     
              case 2:
                  System.out.println("ate a proxima :) ");
                  
                  
          } 
            
                
        
    } 
    }     
    }
    

/*
if(!(dnv=s)) {  
            } else {System.out.println("seu carro do ano "+ano+" de valor "+vcarro+" receu o desconto de "+desconto1+" sendo o valor final de"+vFinal1);}
     if ((ano>=2000)){
        System.out.println("seu carro do ano "+ano+" de valor"+vcarro+" receu o desconto de "+desconto2+" sendo o valor final de"+vFinal2);}
     System.out.println("calcular outro? ");
            }  
*/