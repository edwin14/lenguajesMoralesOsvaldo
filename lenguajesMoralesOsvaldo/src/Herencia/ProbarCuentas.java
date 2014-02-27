

package Herencia;


public class ProbarCuentas {

    
    public static void main(String args[])throws Exception{
    
      Cuenta []cuentas=new Cuenta[6];
      cuentas[0]=new CuentaAhorro();
      cuentas[1]=new CuentaDebito();
      cuentas[2]=new CuentaNomina();
      cuentas[3]=new CuentaAhorro();
      cuentas[4]=new CuentaNomina();
      cuentas[5]=new CuentaDebito();

      for(Cuenta c:cuentas){
          c.CrearCuenta();
      }
        
   }

}
