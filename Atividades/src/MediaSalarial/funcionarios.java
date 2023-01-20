package MediaSalarial;

import javax.swing.JOptionPane;

public class funcionarios {
    public static void main(String[] args) {
     String nome;
        double salario;
        double media;
        StringBuilder mensagem = new StringBuilder();
        //empregado1
        nome = JOptionPane.showInputDialog("digite o nome do funcionario: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salario do funcionario: "));
        
        //empregado2
        nome = JOptionPane.showInputDialog("digite o nome do funcionario: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salario do funcionario: "));
        
        //empregado 3
        nome = JOptionPane.showInputDialog("digite o nome do funcionario: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salario do funcionario: "));
        
         //empregado 4
        nome = JOptionPane.showInputDialog("digite o nome do funcionario: ");
        salario = Double.parseDouble(JOptionPane.showInputDialog("digite o salario do funcionario: "));
        
        media= salario/4;
        mensagem.append("a media dos salarios sao: " +media);
        
        JOptionPane.showMessageDialog(null, mensagem);
       System.out.println("media de salario: " +media);
    }}