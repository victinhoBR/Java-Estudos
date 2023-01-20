package CardapioFastFood;

import java.util.Scanner;

public class irmao14 {
    public static void main(String[] args) {
                Scanner cardapio = new Scanner (System.in);
                int num;
                             
        System.out.print("--Cardapio--\n\n");
        System.out.print(" Opcao 1 - Precos:X-Bacon - Preco: R$ 20\n Opcao 2 - X-Salada - Preco: R$ 15\n Opcao 3 - X-Picanha - Preco: R$ 22\n Opcao 4 - X-Tudo - Preco: R$ 30\n");
        System.out.print("Digite o numero: ");
         num = cardapio.nextInt();

        switch (num) {
        case 1 :
            System.out.println("\nX-Bacon - Preco: R$ 20");
            break;

        case 2:
            System.out.println("\nX-Salada - Preco: R$ 15\n");
            break;

        case 3:
            System.out.println("\nX-Picanha - Preco: R$ 22 \n");
            break;
            
        case 4:
            System.out.println("\nX-Tudo - Preco: R$ 30 \n"); 
            break;

        default:
            System.out.println("\n Sanduíche nao existe !");
            break;
        }}}