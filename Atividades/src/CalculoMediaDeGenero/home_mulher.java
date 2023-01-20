package CalculoMediaDeGenero;

import java.util.Scanner;

public class home_mulher {
    public static void main(String[] args) {
        Scanner sexo = new Scanner (System.in);
        int m_t, f_t, m, f;
        
        System.out.println("Digite quantos machos ha na faculdade: ");
        m=sexo.nextInt();
        
        System.out.println("Digite quantas femeas ha na faculdade: ");
        f=sexo.nextInt();
        
        f_t=f/100;
        m_t=m/100;
                
        System.out.println("Exitem "+m_t+"% de machos na faculdade");
        System.out.println("Exitem "+f_t+"% de femeas na faculdade");
    }}