/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * @author Andres Felipe Torres Padilla
 * @author Valeria Benitez Cardenas
 * @author Juan Pablo Mutis Torres
 */
public abstract class Libro { // Se transformó en clase abstracta
    private final String isbn;
    private final String titulo;
    private Autor autor; 

    public Libro(String isbn, String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    // Método abstracto obligatorio para las clases hijas
    public abstract String obtenerTipoFormato();

    public void doCategoria(Categoria categoria){
        System.out.println("Libro: " + titulo + "\tCategoria: " + categoria.getNombre());
    }
}
