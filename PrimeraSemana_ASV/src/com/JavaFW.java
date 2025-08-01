package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {
    public static void main(String[] args) {
        //Uso de las clases File y File Writer para
        //poder escribir o almacenar informacion en un
        //archivo de texto

        //Necesitamos un String con informacion que
        //queremos escribir en nuestro archivo

        String linea = "\nHoy es 1 de agosto de 2025";

        try {
            //Nececitamos la ruta del archivo que vamos a escribir
            //En caso de que el archivo no exista, este se crea
            File archivo = new File("C:\\Users\\Andres\\Desktop\\Fichero.txt");
            //Ahora necesitamos a laclase File writer para poder crear el archivo
            //en caso de que no exista, o sobreescribirlo en caso de que exista y
            //necesitamos
            //añadir informacion
            FileWriter writer = new FileWriter(archivo, true); //Si escribieramos un archivo
            //existente, dejamos el valor booleano true para respertar el contenido del
            //archivo y solo agregar la info respectiva, si no, el archivo se borra y escribe lo nuevo

            //Escribimos la info en nuestro archivo
            writer.write(linea);

            //Para guardar la info en el archivo, escribimos lo siguiente
            writer.close();
            System.out.println("Archivo escrito correctamente");

        } catch (Exception e) {
            System.out.println("No pudo crearse o encontrarse el archivo");


        }finally {
            System.out.println("Fin del programa");

        }

        //Algun codigo nuevo
    }
}
