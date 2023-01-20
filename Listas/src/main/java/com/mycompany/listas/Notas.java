/*
 LISTA DE NOTAS USANDO DO MÉTODO LIST (COLLECTIONS)
 */
package com.mycompany.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author w
 */
public class Notas {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicine sete notas");
        notas.add(6.5);
        notas.add(5.3);
        notas.add(3.9);
        notas.add(10.0);
        notas.add(5.0);
        notas.add(6.2);
        notas.add(2.2);
        System.out.println(notas);

        System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione o numero 8.0 na 4º posição");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota '5.0' pela nota '6.0': ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota '5.0' esta na lista: " + notas.contains(5d));
        System.out.println(notas);

        System.out.println("Terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("A menor nota: " + Collections.min(notas));
        System.out.println(notas);

        System.out.println("A maior nota: " + Collections.max(notas));
        System.out.println(notas);

        System.out.println("A soma das notas: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("A media das notas : " + (soma / notas.size()));

        System.out.println("Remova a nota '0' : " + notas.remove(0d));

        System.out.println("Remova a nota na posicao '0' : " + notas.remove(0));

        System.out.println("Remova as notas maiores que '7' e exiba na lista : ");
        Iterator<Double> iterator1=notas.iterator();
        while (iterator1.hasNext()) {            
            Double next=iterator1.next();
            if (next<7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);
    }
}
