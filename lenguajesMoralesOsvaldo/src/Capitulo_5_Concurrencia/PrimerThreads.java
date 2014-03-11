
package Capitulo_5_Concurrencia;


public class PrimerThreads implements Runnable{

   
    public static void main(String[] args) {
     // 1.- creado
     Runnable r=new PrimerThreads(); //Objeto polimorfico por que aqui se crea 
     Thread tl=new Thread(r);
     // 2.- inicializado
     tl.start(); // inicializa el thread, lo inicializa en la cola de los thread
     
    }
     // 3.- En ejecucion
    public void run() {
        System.out.println("Soy un thread en ejecucion");
        
    }
     // 5.- Tremina la ejecucion
}
