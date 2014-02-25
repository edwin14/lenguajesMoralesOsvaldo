
package Herencia;

public  class Validacion {
    
    public static void validarSaldo(float saldo) throws SinFondosException{ 
        if((saldo<0)saldo=-saldo) throw new SinFondosException(); 
    }
    
}
