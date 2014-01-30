package Circulo;


import Circulo.Circulo;



/* @author Edwin Osvaldo Morales Gomez*/
public class TestCirculo {

    
    public static void main(String[] args) {
     //Creamos un Circulo
        Circulo c=new Circulo();
        c.setRadio(20);
        //Imprimiendo el valor del radio probaremos que IMPIDIÓ meter valores negativos
        System.out.println(c.getRadio());
        
    }
    
}
