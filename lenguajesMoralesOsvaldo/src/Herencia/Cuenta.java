
//Super Clase (clase padre)

package Herencia;


public abstract class Cuenta {
    
    public Cuenta(String nombre, float saldo) throws SinFondosException{
       Validacion.validarSaldo(saldo);
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    
    //Aqui se encuentran todos los metodos
    private int id;
    private String nombre;
    private float saldo;

  
    
    public String toString(){
        return "Usuario: " +nombre+ " Cuenta con Saldo: " +saldo;
        
    }
    
    
    
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo)throws SinFondosException {
        Validacion.validarSaldo(saldo);
        this.saldo = saldo;
    }
    
   
    
    
    public abstract void CrearCuenta();
}
