/*
 IMPORTAR CLASSSE E ENTRAR COM DADOS DO USUARIO 
 */
package UC10;

/**
 *
 * @author e
 */
import java.util.Scanner;
public class RecebendoNomeEIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite o seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("digite sua idade: ");
        int idade = input.nextInt();
    }
}
