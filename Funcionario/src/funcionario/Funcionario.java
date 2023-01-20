/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionario;

import javax.swing.JOptionPane;

public class Funcionario {
    
    public static void main(String[] args) {
        String nome;
        StringBuilder mensagem = new StringBuilder();
        
        nome = JOptionPane.showInputDialog("digite o nome do funcionario: ");
        mensagem.append("Bem-vindo" +nome+ "!");
        // ou .append(nome).append("!");
        JOptionPane.showMessageDialog(null, mensagem);;
        
  }
}
    

    
