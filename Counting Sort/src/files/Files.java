package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Files {
    public int contarLineas(String name) {
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        int numLineas = 0;

        try {
            archivo = new File("C:\\Users\\lirau\\OneDrive\\Escritorio\\Universidad\\Cuatrimestre 4\\Estructura de Datos Aplicadas\\Parcial 3\\Archivos\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            while ((bufer.readLine()) != null) {
                numLineas++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al abrir/leer el archivo: " + e.toString());
        }
        return numLineas;
    }

    // Método que lee un archivo de texto plano y almacena cada linea en un arreglo de String
    public String[] archivoAstrings(String name) {
        File archivo; // Apuntar a un archivo en el disco duro
        FileReader reader; // Para abrir el archivo
        BufferedReader bufer; // Para leer la info del archivo
        String linea;
        String[] arreglo = null;
        int t; // Tamaño del archivo, que será el tamaño del arreglo
        int i = 0; // Índice del arreglo

        try {
            // Saber cuantes líneas tiene el archivo
            t = contarLineas(name);
            // Construir el arreglo con el valor de t
            arreglo = new String[t];
            // Crear el apuntador al archivo físico
            archivo = new File("C:\\Users\\lirau\\OneDrive\\Escritorio\\Universidad\\Cuatrimestre 4\\Estructura de Datos Aplicadas\\Parcial 3\\Archivos\\" + name + ".txt");
            // Abrir el archivo para lectura
            reader = new FileReader(archivo);
            // Configurara el bufer
            bufer = new BufferedReader(reader);
            // Lectura de la información del archivo
            while ((linea = bufer.readLine()) != null) {
                arreglo[i] = linea;
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al abrir/leer el archivo: " + e.toString());
        }
        return arreglo;
    }

    // Método que lee un archivo de texto plano y almacena cada linea en un arreglo de int
    public int[] archivoAint(String name) {
        File archivo; // Apuntar a un archivo en el disco duro
        FileReader reader; // Para abrir el archivo
        BufferedReader bufer; // Para leer la info del archivo
        String linea;
        int[] arreglo = null;
        int t; // Tamaño del archivo, que será el tamaño del arreglo
        int i = 0; // Índice del arreglo

        try {
            // Saber cuantes líneas tiene el archivo
            t = contarLineas(name);
            // Construir el arreglo con el valor de t
            arreglo = new int[t];
            // Crear el apuntador al archivo físico
            archivo = new File("C:\\Users\\lirau\\OneDrive\\Escritorio\\Universidad\\Cuatrimestre 4\\Estructura de Datos Aplicadas\\Parcial 3\\Archivos\\" + name + ".txt");
            // Abrir el archivo para lectura
            reader = new FileReader(archivo);
            // Configurara el bufer
            bufer = new BufferedReader(reader);
            // Lectura de la información del archivo
            while ((linea = bufer.readLine()) != null) {
                arreglo[i] = Integer.parseInt(linea);
                i++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error al abrir/leer el archivo: " + e.toString());
        }
        return arreglo;
    }

    // NUEVO MÉTODO que lee un archivo de texto y almacena cada línea en un arreglo solo de tipo int
    public int[] leerEnteros(String name) {
        File archivo;
        FileReader reader;
        BufferedReader bufer;
        String linea;
        int[] arreglo = null;
        int t;
        int i = 0;
        boolean advertenciaMostrada = false;

        try {
            t = contarLineas(name);
            arreglo = new int[t];
            archivo = new File("C:\\Users\\lirau\\OneDrive\\Escritorio\\Universidad\\Cuatrimestre 4\\Estructura de Datos Aplicadas\\Parcial 3\\Archivos\\" + name + ".txt");
            reader = new FileReader(archivo);
            bufer = new BufferedReader(reader);
            while ((linea = bufer.readLine()) != null) {
                try {
                    int numero = Integer.parseInt(linea);
                    if (numero >= 0) {
                        arreglo[i] = numero;
                        i++;
                    } else {
                        if (!advertenciaMostrada) {
                            System.out.println("ADVERTENCIA: Las líneas que no sean de tipo int, se omitiran y se mostraran con valor de 0.");
                            advertenciaMostrada = true;
                        }
                    }
                } catch (NumberFormatException e) {
                    if (!advertenciaMostrada) {
                        System.out.println("ADVERTENCIA: Las líneas que no sean de tipo int, se omitiran y se mostraran con valor de 0.\n");
                        advertenciaMostrada = true;
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
        }
        return arreglo;
    } 

    public void escribirArchivo(String name) {
        // Apuntador a la sección del disco duro donde se crea
        FileWriter archivo;
        // Llave para tener acceso al archivo en modo escritura
        PrintWriter writer;
        // Para leer datos del teclado
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;

        try {
            archivo = new FileWriter("C:\\Users\\lirau\\OneDrive\\Escritorio\\Universidad\\Cuatrimestre 4\\Estructura de Datos Aplicadas\\Parcial 3\\Archivos\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            do {
                System.out.println("Escribe datos para el archivo: ");
                entrada = bufer.readLine();
                writer.println(entrada);
                System.out.println("Escribe x para parar");
                entrada = bufer.readLine();
                respuesta = entrada.charAt(0);
            } while (respuesta != 'x');
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    }

    public void arregloArchivo(String name, int[] array) {
        FileWriter archivo;
        PrintWriter writer;

        try {
            archivo = new FileWriter("C:\\Users\\lirau\\OneDrive\\Escritorio\\Universidad\\Cuatrimestre 4\\Estructura de Datos Aplicadas\\Parcial 3\\Archivos\\" + name + ".txt");
            writer = new PrintWriter(archivo);
            for (int unDato : array) {
                writer.println(unDato);
            }
            archivo.close();
        } catch (Exception e) {
            System.out.println("Error al crear el archivo: " + e.toString());
        }
    }
}