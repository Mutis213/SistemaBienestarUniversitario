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

public class LibroDigital extends Libro {
    private double tamanoArchivoMB;

    public LibroDigital(String isbn, String titulo, Autor autor, double tamanoArchivoMB) {
        super(isbn, titulo, autor);
        this.tamanoArchivoMB = tamanoArchivoMB;
    }

    public double getTamanoArchivoMB() {
        return tamanoArchivoMB;
    }

    // Sobrescritura (Override) del método abstracto
    @Override
    public String obtenerTipoFormato() {
        return "Digital (Formato PDF/EPUB de " + tamanoArchivoMB + "MB)";
    }
}
