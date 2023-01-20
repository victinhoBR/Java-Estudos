/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controle;

/**
 *
 * @author e
 */
public class TV {
    String fabricante= "LG";
    int polegada=32;
    int volume=0;
    int canal=1;
    boolean ligado=false;
    
    public void aumentarVolume(){
        if (volume>=10){
            return;
        }
        volume++;
    }       
    
    public void diminuirVolume(){
        if (volume<=0){
            return;
        }
        volume--;
        }
                public void ligar(){
        ligado=true; }
                
         
                    public void desligar(){
        ligado=false; 
    
                    }
}

