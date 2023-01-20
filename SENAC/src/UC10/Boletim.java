package UC10;

import java.util.Scanner;

/*
Faça um programa que dê o conceito do aluno conforme sua nota média.
*
* Entrada: 3 notas
* Saída: média das notas e o conceito
*
* caso 0 <= média < 4 -> Nota E
* caso 4 <= média < 5 -> Nota D
* caso 5 <= média < 7 -> Nota C
* caso 7 <= média < 8 -> Nota B
* caso 8 <= média <= 10 -> Nota A


 */
public class Boletim {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, media;
        int i,contAluno = 0;
        for(i=0; i<3; i++){
            contAluno++;
            
            //recebe a primeira nota
  
        System.out.println( "Aluno "+contAluno+ " Digite sua primeira nota. ");
        n1=entrada.nextDouble();
        
        //recebe a segunda nota
        
        System.out.println( "Aluno "+contAluno+ " Digite sua segunda nota. ");
                n2=entrada.nextDouble();
      
                // recebe a terceira nota
                
                System.out.println( "Aluno "+contAluno+ " Digite sua terceira nota. ");
                n3=entrada.nextDouble();
                
                // calcular a média
                
                media = (n1 + n2 + n3) / 3;
                System.out.println( "A media do aluno "+contAluno+ " e. "+media);
                
                //mostrar média
                
                if((media>=0)&&(media<4)){
                    System.out.println( "nota E \n\n");}
                else if(media<5){
                    System.out.println( "nota d \n\n");} 
                else if(media<7){
                    System.out.println( "nota c \n\n");}
                else if(media<8){
                    System.out.println( "nota b \n\n");} 
                else if(media<=10){
                    System.out.println( "nota a \n\n");} 
                }
        }
    }

