package model;

import java.time.LocalDate;

/**
 *
 * @author Andres Felipe Torres Padilla
 * @author Valeria Benitez Cardenas
 * @author Juan Pablo Mutis Torres
 * 
 */

public class Autor {
    private static int id;
    public final String nombre;
    private String pais;
    private int fechaNacimiento;

    public Autor(int id, String nombre, String pais, int fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }
    
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public static void setId(int id1) {
        id = id1;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", fecha_nacimiento=" + fechaNacimiento + '}';
    }
        
}
