package model;

import java.util.ArrayList;

/**
 *
 * @author Andres Felipe Torres Padilla
 * @author Valeria Benitez Cardenas
 * @author Juan Pablo Mutis Torres
 * 
 */

public class Biblioteca {
    private ArrayList<Categoria> categorias;
    private ArrayList<Autor> autores    ;
    private ArrayList<Prestamo> Prestamos;

    public Biblioteca(ArrayList<Categoria> categorias, ArrayList<Autor> autores, ArrayList<Prestamo> Prestamos) {
        this.categorias = categorias;
        this.autores = autores;
        this.Prestamos = Prestamos;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return Prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> Prestamos) {
        this.Prestamos = Prestamos;
    }
    
    
}
