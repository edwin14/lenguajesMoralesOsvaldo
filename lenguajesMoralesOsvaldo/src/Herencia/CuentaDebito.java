
//Hereda de la super clase 
//Paso 2.- Se le agrega el extends Cuenta(nombre de la super clase)

package Herencia;


public class CuentaDebito extends Cuenta{

    public CuentaDebito(String nombre, float saldo) throws SinFondosException {
        super(nombre, saldo);
    }
   
    
    
    public void CrearCuenta(){
    System.out.println("Tu Cuenta de Debito fue creada con exito");  
    }
}
    


