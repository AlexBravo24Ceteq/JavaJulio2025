package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {
    public static void  main(String[] args) {
        //Uso de clases File y FileWriter para poder escribir o
        // almacenar info en un archivo de texto

        //Añadimos un String con información que queremos en el archivo

        String linea = "\n Hoy es 01 de Agosto de 2025";

        try {
            //Necesitamos la ruta del archivo que vamos a escribir
            //En caso de que el archivo no exista, este se crea
            File archivo = new File("C:\\Users\\pc\\Desktop\\FELI UWU\\Programación\\docs\\fichero.txt");
            //Ahora requerimos la clase FileWriter para crear el archivo en caso que no exista
            //o sobreescribirlo en caso que exista y necesitemos añadir información
            FileWriter writer = new FileWriter(archivo, true);
            //Esto sobreescribira lo que haya dentro del escrito, por tanto añadimos un
            // booleano "true", para respetar el contenido

            //Escribimos la info en el archivo
            writer.write(linea);
            //Pero no se guardará a menos que añadamos el .close
            writer.close();
            System.out.println("Archivo escrito y guardado correctamente.");
        } catch (Exception e){
            System.out.println("No pudo encontrarse o crear el archivo");
        }finally {
            System.out.println("FIN DEL PROGRAMA");
        }

    }
}
