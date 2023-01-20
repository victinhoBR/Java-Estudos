package NascimentoData;

import java.util.Scanner;


public class idade {
     public static void main(String[] args) {
                Scanner idade = new Scanner (System.in);
                int x;
                int y;
                int num;
                int anos;
                int idade_atual;
                boolean juvenil=false;
                System.out.println("Digite o ano atual: ");
                anos=idade.nextInt();
                
                System.out.println("Digite seu dia de nascimento: ");
                y=idade.nextInt();
                
                System.out.println("Digite seu mes de nascimento: ");
                x=idade.nextInt();
                
                System.out.println("Digite seu ano de nascimento: ");
                num=idade.nextInt();
                
                idade_atual= anos-num;
                System.out.println("A sua idade em "+anos+" e "+idade_atual);
     
     }}
