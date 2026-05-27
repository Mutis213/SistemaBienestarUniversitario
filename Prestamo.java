package model;

import java.time.LocalDate;

/**
 * @author Andres Felipe Torres Padilla
 * @author Valeria Benitez Cardenas
 * @author Juan Pablo Mutis Torres
 */
public class Prestamo {
    private final int id;
    private Libro libro;
    private String usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    // Constructor 1: Parametrizado completo
    public Prestamo(int id, Libro libro, String usuario, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Constructor 2: SOBRECARGADO (Overload) - Asigna fechas automáticas
    public Prestamo(int id, Libro libro, String usuario) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now(); 
        this.fechaDevolucion = LocalDate.now().plusDays(14); // Préstamo por defecto de 14 días
    }

    public int getId() {
        return id;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
