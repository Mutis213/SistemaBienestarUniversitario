package model;

import java.util.ArrayList;

/**
 * @author Andres Felipe Torres Padilla
 * @author Valeria Benitez Cardenas
 * @author Juan Pablo Mutis Torres
 */
public class Categoria {
    private final int id;
    private final String nombre;
    private ArrayList<Libro> libros;

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return "Categoria{" + "id=" + id + ", nombre=" + nombre + ", libros=" + libros + '}';
    }
}
