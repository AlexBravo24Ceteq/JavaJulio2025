package com;

import java.io.File;
import java.io.FileWriter;

public class JavaFW {
    public static void main(String[] args) {

        //uso de las clases File o file writer para poder escribir
        //o almacenar en un archivo de texto
        //Necesitmas un string para la informacion que se escribira

        String linea = "\nHoy es 1 de agosto de 20205"; // con\n da un espacio de linea
        //Se abre estructura try and catch
        try {
            //necesitamos la ruta de nuestro archivo
            //en esta parte si no exite cre uno nuevo con otro nombre \\prueba. txt
            //solo con la clase File
            File archivo = new File("C:\\Users\\Monse\\Desktop\\fichero.txt");
            //necesitamos abrir el archivo en modo lectrura se necesita la clase FileReader
            FileWriter writer = new FileWriter(archivo,true);
            //sii escribimos en un archivo qu eya tiene informacion dejamos el valor de tur para respetar el contenido
            //ya existente, y se agregara lo nuevo y no lo borra
            //respta la info ya exitente y agrega el nuevo texto

            //ESCRIBIMOS LA INFO EN EL ARCHIVO
            writer.write(linea);// aqui ya se escribe la info pero todabia no se guarda
            //Para guardarla se necesita esto
            writer.close();
            //Esto en caso de que todo se escirbio y guardo correctame si no entra el catch
            System.out.println("Archivo escrito correctamente ");

        } catch (Exception e) {
            System.out.println("No pudo crearse o encontrar el archivo");

        }finally {
            System.out.println("FIN DEL PROGRAMA");

        }



    }
}
