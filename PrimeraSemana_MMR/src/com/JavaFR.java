package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {
    public static void main(String[] args) {
        /* Uso de las clases File, FileReader y BufferedReader para poder
        leer archivos de nuestro equipo
         */

        /*Declara un String vacio para guardar
        la informacion que necesite nuestro archivo
         */
        String linea = "";
        /* try & catch - intenta ejecutar un bloque de codigo, pero si algo llegase
        a ser propenso de fallos, esa excepcion se atrapa en una variable u objeto y se
        permite ejecutar otra accion o bloque de codigo
         */
        try { //intenta ejecutar bloque de codigo
            /* Necesitamos guardar la ruta de acceso a nuestro archivo.
            Utilizamos la clase file
             */
            File archivo = new File("C:\\Users\\Marla\\Desktop\\fichero.txt");
            //Necesitamos abrir el archivo en modo lectura. Para ello necesitamos la clase FileReader
            FileReader lector = new FileReader(archivo); //Abre archivo modo lectura
            //Necesitamos poder leer el contenido del archivo y lo hacemos con la clase BufferedReader
            BufferedReader buffer = new BufferedReader(lector);

            //Se procede a leer archivo y se guarda en variable
          //  linea = buffer.readLine();
          //  System.out.println(linea);

            //Para leer todas las lineas del documento, se puede usar un ciclo que reemplace el string con la info disponible
            while ((linea = buffer.readLine()) != null){
                System.out.println(linea); //Se imprime
            }
        } catch (Exception e) { //si falla
            System.out.println("No se pudo leer archivo");
        } finally { //finalmente ejecuta esto siempre
            System.out.println("Fin del programa");
        }
    }
}
