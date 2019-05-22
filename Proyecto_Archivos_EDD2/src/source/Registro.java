package source;

import java.util.ArrayList;

public class Registro {
    String nombre_registro;
    ArrayList<String> lista_datos = new ArrayList<String>();

    public Registro() {
    }

    public Registro(String nombre_registro) {
        this.nombre_registro = nombre_registro;
    }

    public String getNombre_registro() {
        return nombre_registro;
    }

    public void setNombre_registro(String nombre_registro) {
        this.nombre_registro = nombre_registro;
    }

    public ArrayList<String> getLista_datos() {
        return lista_datos;
    }

    public void setLista_datos(ArrayList<String> lista_datos) {
        this.lista_datos = lista_datos;
    }

    @Override
    public String toString() {
        return nombre_registro;
    }
    
    
    
}
