package Capitulo_6_Collections;

import java.util.*;
public class Pregunta {
    private int id;
    private String titulo;
    private ArrayList<Opcion>opciones;

    public Pregunta(int id, String titulo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }
    
}
