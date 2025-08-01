package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {

    public static void main(String[] args) {
        //Uso de las clases File y FileWriter para poder escribir o almacenar
        //informacion en un archivo de texto

        //Necesitamos un String con informacion que queremos escribir en
        //nuestro archivo

        String linea = "\nHoy es 01 de Agosto de 2025";

        try {
            //Necesitamos la ruta del archivo que vamos a escribir
            //En caso de que el archivo no exista, este se crea, pero solo con el uso de FileWriter
            File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\fichero.txt");
            //Ahora necesitamos a la clase FileWriter para poder crear el archivo en caso
            //de que no exista o sobreescribirlo en caso de que exista y necesitemos
            //añadir informacion
            FileWriter writer = new FileWriter(archivo, true); //si escribieramos un archivo
            //existente, dejamos el valor booleano true para respetar el contenido del archivo
            //y solo agregar la info respectiva. Si no, el archivo se borra y escribe lo nuevo

            //Escribimos la info en nuestro archivo
            writer.write(linea);
            //Para guardar la info en el archivo, escribimos lo siguiente
            writer.close();

            System.out.println("Archivo escrito correctamente");
        } catch (Exception e) {
            System.out.println("No pudo crearse o encontrarse el archivo");
        }finally{
            System.out.println("FIN DEL PROGRAMA");
        }
//Algun codigo nuevo


    }

}
