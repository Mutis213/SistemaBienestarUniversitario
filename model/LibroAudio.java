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

public class LibroAudio extends LibroDigital {
    private String narrador;

    public LibroAudio(String isbn, String titulo, Autor autor, double tamanoArchivoMB, String narrador) {
        super(isbn, titulo, autor, tamanoArchivoMB);
        this.narrador = narrador;
    }

    public String getNarrador() {
        return narrador;
    }

    // Sobrescritura (Override) aplicando Polimorfismo en el segundo nivel
    @Override
    public String obtenerTipoFormato() {
        return "AudioLibro (Narrado por: " + narrador + ", Tamaño: " + getTamanoArchivoMB() + "MB)";
    }
}
