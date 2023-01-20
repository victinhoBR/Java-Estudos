package br.com.controle;
/**
 *
 * @author e
 */
public class Calculos {
 //criar atributos - inserir e puxar dados da memoria
    private double valor1;
    private double valor2;
    
    //criar objeto - cópia da classe

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    //criar metódos para as regras de negocio
    public double somar(){
        return this.valor1+this.valor2;
        
        
        
        }
    
}
