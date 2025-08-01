package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {
    public static void main(String[] args) {
        //File y FileWriter para poder escribor o almacenar
        //informacion en un archivo de texto

        //nesesitamos un String con informacion que queremos Escribir en nuestro Archivo}

        String linea ="\nHoy es 01 de Agosto de 2025";
        try {
            //necesitamos la ruta del archivo que vmaos a escribir
            File archivo = new File("C:\\Users\\Gerardo Solis\\Desktop\\File2.txt");
            //ahora necesitamos la clase file writer para crear el archivo en caso de que no exista o sobre escribirlo
            FileWriter writer = new FileWriter(archivo,true); // si escribieramos un archivo existente se
            //deja el balor booleano true para respetar el contenido del archivo y solo agregar la info respetiva
            //y si no el archivo se borra y escribe de nuevo
            //escribimos la info
            writer.write(linea);
            //para guardar el archivo
            writer.close();
            System.out.println("El archivo se guardo correctamente");

        }catch (Exception e){
            System.out.println("no pudo crearce o encontrarse el archivo");
        }finally {
            System.out.println("Fin del Programa");
        }
    }
}
