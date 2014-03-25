package Capitulo_5_Concurrencia.internas_anonimas;


public class Reloj{
   public static void main(String[] args) {
        
       
       Thread t1=new Thread(new Runnable(){
           public void run(){
               System.out.println("Yo soy el Primer Thread");
           }
       });
       
       Thread t2=new Thread(new Runnable(){
           public void run(){
             System.out.println("Estoy seguro que este es el Thread t2");   
           }
       });
       
       t1.start();
       t2.start();
    }
}