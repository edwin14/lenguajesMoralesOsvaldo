
//Hereda de la super clase 

package Herencia;


public class CuentaAhorro extends Cuenta{

   
    public CuentaAhorro(String nombre, float saldo) {
        super(nombre, saldo);
    }
    
  
    
    public void CrearCuenta(){
    System.out.println("Tu Cuenta de Ahorro fue creada con exito");  
    }
    
}
