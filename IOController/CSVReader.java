package IOController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private String rutaArchivo;
    private String separador;

    public CSVReader(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        this.separador = ","; // separador por defecto
    }

    public CSVReader(String rutaArchivo, String separador) {
        this.rutaArchivo = rutaArchivo;
        this.separador = separador;
    }

    public List<String[]> leer() {
        List<String[]> filas = new ArrayList<>();
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            while ((linea = br.readLine()) != null) {
                String[] columnas = linea.split(separador);
                filas.add(columnas);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return filas;
    }

    public List<String[]> leerSinEncabezado() {
        List<String[]> filas = leer();
        if (!filas.isEmpty()) {
            filas.remove(0); // elimina la primera fila (encabezado)
        }
        return filas;
    }

    public String[] obtenerEncabezados() {
        List<String[]> filas = leer();
        if (!filas.isEmpty()) {
            return filas.get(0);
        }
        return new String[]{};
    }
}