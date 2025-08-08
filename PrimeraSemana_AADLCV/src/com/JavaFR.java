package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {

    public static void main(String[] args) {

        // Uso de las clases File, FileReader, y BufferedReader para poder
        // leer archivos de nuestro equipo

        // Declaramos un String vacio para poder guardar la información que
        // necesitamos leer de nuestro archivo
        String linea;

        // try & catch - Intenta ejecutar un bloque de código, pero si algo llegase
        // a ser propenso de fallos, esa excepción se atrapa en una variable u onjeto
        // y se permite ejecutar otra acción o bloque de código

        try{ //Intenta ejecutar el siguiente código
            // Necesitamos guardar la ruta de acceso a nuestro archivo. Para ello
            // utilizamos la clase File
            File archivo = new File("C:\\Users\\adria\\OneDrive\\Escritorio\\fichero.txt");
            // Necesitamos abrir el archivo en modo lectura. Para ello necesitamos FileReader
            FileReader lector = new FileReader(archivo); // El objeto lector abrirá el archivo en modo lectura
            // Necesitamos poder leer el contenido del archivo y lo hacemos con la clase BufferedReader
            BufferedReader buffer = new BufferedReader(lector);

            // Ya que tenemos todo procedemos a leer el archivo de texto y lo guardamos en nuestro String

            // linea = buffer.readLine(); // Leemos el contenido y lo guardamos en un String

            //System.out.println(linea); // La mandamos a imprimir en consola

            // Si queremos leer todas las lineas del documentos, podemos recurrri a un ciclo que
            // reemplace nuestro String con la info disponible en el bloc de notas y lo mande a imprimir
            while ((linea = buffer.readLine()) != null){ // Mientras haya lineas por asignar y no estén vacías
                // las mandamos a imprimir en consola
                System.out.println(linea);
            }
        } catch (Exception e) { // Si algo falla se atrapa aquí
            System.out.println("No se encontró el archivo o no pudo leerse");
        } finally { // Finalmenete ejecuta esto siempre
            System.out.println("FIN DEL PROGRAMA");

        }

    }
}
