package SalarioMinimo;

import java.util.Scanner;

public class salario_minimo {
    public static void main(String[] args) {
        Scanner salario = new Scanner (System.in);
        double sal;
        double sal2;
        double sal_total;
        System.out.println("Digite o salario do funcionario: ");
        sal=salario.nextDouble();
        System.out.println("Digite o salario minimo: ");
        sal2=salario.nextDouble();
        sal_total=sal/sal2;
        System.out.println("O funcionario recebe "+sal_total+" salarios minimos.");
    }}
