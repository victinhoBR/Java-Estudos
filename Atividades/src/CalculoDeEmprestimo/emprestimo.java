package CalculoDeEmprestimo;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        Scanner emprestimo = new Scanner (System.in);
        double salB,desc,salL,emp,lib;
        
        System.out.println("Digite seu salario bruto: ");
        salB=emprestimo.nextInt();
        
        System.out.println("Digite o total de descontos em seu salario bruto: ");
        desc=emprestimo.nextInt();
        
        System.out.println("Digite o valor do emprestimo desejado: ");
        emp=emprestimo.nextInt();
        
        salL= salB-desc;
        lib=salL*0.3;
        
        if(emp<lib){
            System.out.println("Emprestimo liberado");
        } if(emp>lib){
            System.out.println("Emprestimo negado");
        }}}
