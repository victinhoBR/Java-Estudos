/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controle;

/**
 *
 * @author e
 */
public class controle {

    public static void main(String[] args) {
        TV televisao = new TV();

        System.out.println("Esta televisao e da marca " + televisao.fabricante
                + ". A televisao esta" + (televisao.ligado == true ? " Ligada" : " Desligada")
                + " O volume e" + televisao.volume);

        televisao.ligar();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
    }
}
