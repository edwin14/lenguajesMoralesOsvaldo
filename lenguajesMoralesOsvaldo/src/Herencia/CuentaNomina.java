
//Hereda de la super clase

package Herencia;


public class CuentaNomina extends Cuenta {

    public CuentaNomina(String nombre, float saldo) throws SinFondosException {
        super(nombre, saldo);
    }
    
    
    
    public void CrearCuenta(){
    System.out.println("Tu Cuenta de Nomina fue creada con exito");  
    }
}
