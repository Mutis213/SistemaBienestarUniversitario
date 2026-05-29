/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package view;

import java.time.LocalDate;
import java.util.ArrayList;
import model.*;

/**
 * @author Andres Felipe Torres Padilla
 * @author Valeria Benitez Cardenas
 * @author Juan Pablo Mutis Torres
 * 
 * commit
 */
public class SistemaDeGestionBibliotecario {

    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN BIBLIOTECARIO ===");

        // 1. Instanciación de Objetos Básicos [cite: 14, 42]
        Autor autor1 = new Autor(1, "Gabriel García Márquez", "Colombia", 1927);
        Libro libro1 = new Libro("978-3-16-148410-0", "Cien años de soledad", autor1);
        
        Categoria catFiccion = new Categoria(101, "Ficción");
        catFiccion.agregarLibro(libro1);

        // 2. Demostración de Herencia y Polimorfismo (Diferentes niveles) [cite: 21, 23, 42]
        Usuario u1 = new MiembroBiblioteca("M001", "Carlos Pérez", "carlos@mail.com");
        Usuario u2 = new Estudiante("E001", "Ana Gómez", "ana@universidad.edu", "Ingeniería de Sistemas");
        Usuario u3 = new Profesor("P001", "Dr. Torres", "torres@universidad.edu", "Ciencias Computacionales");

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(u1);
        listaUsuarios.add(u2);
        listaUsuarios.add(u3);

        System.out.println("\n--- Demostración de Polimorfismo (Límites de Libros por Rol) ---");
        for (Usuario user : listaUsuarios) {
            // Se llama al mismo método, pero se comporta diferente según la clase del objeto [cite: 23]
            System.out.println("Usuario: " + user.getNombre() + " -> Límite de libros permitidos: " + user.obtenerLimiteLibros());
        }

        // 3. Creación de Préstamos usando Sobrecarga de Constructores (Overload) [cite: 22, 42]
        // Caso A: Usando el constructor parametrizado completo
        Prestamo prestamo1 = new Prestamo(1, libro1, u2, LocalDate.now(), LocalDate.now().plusDays(10));
        
        // Caso B: Usando el constructor sobrecargado (asigna fechas automáticas) 
        Prestamo prestamo2 = new Prestamo(2, libro1, u3);

        System.out.println("\n--- Préstamos Registrados con Éxito ---");
        System.out.println("Préstamo 1 (Estudiante) - Vence el: " + prestamo1.getFechaDevolucion());
        System.out.println("Préstamo 2 (Profesor - Sobrecargado) - Vence el: " + prestamo2.getFechaDevolucion());
    }
}
