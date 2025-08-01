package com;

import java.io.*;

public class JavaFW {
    public static void main(String[] args) {
        /*Uso de de las clases File y FileWriter para poder escribir o almacenar
        informacion en un archivo de texto
         */
        //Cadena para escribir en documento
        String linea = "\nHoy es 01 de Agosto de 2025";

        try { //intenta ejecutar bloque de codigo
            //Ruta de archivo
            //Si no existe el documento este se crea pero solo con el uso de FileWriter
            File archivo = new File("C:\\Users\\Marla\\Desktop\\fichero.txt");
            /* Clase FileWriter para crear archivo en caso de no exitir o sobreescribir en
                caso de exista y se necesite agregar información
                -Se coloca un segundo parametro en True si se desea modificar el mismo archivo,
                sino, toma el archivo y lo sobreescribe desde 0
             */
            FileWriter writer = new FileWriter(archivo, true);
            writer.write(linea); //Se escribe la info en nuestro archivo
            writer.close(); //Se cierra para que se guarde

        } catch (Exception e) { //si falla
            System.out.println("No se pudo leer archivo");
        } finally { //finalmente ejecuta esto siempre
            System.out.println("Fin del programa");
        }
    }
}
