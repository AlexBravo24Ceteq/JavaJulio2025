package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;

public class JavaFR {

    public static void main(String[] args) {

        //Uso de las clases File, FileReader y BufferedReader para poder
        //leer archivos de nuestro equipo

        //Declaramos un String vacio para poder guardar la informacion que
        //necesitemos leer de nuestro archivo
        String linea;

        //try & catch - intenta ejecutar un bloque de codigo, pero si algo llegase
        //a ser propenso de fallos, esa excepcion se atrapa en una variable u objeto
        //y se permite ejecutar otra accion o bloque de codigo

        try{ //intenta ejecutar el siguiente codigo
            //Necesitamos guardar la ruta de acceso a nuestro archivo. Para ello
            //utilizamos la clase File
            File archivo = new File("C:\\Users\\jorge\\OneDrive\\Escritorio\\ficher.txt");
            //Necesitamos abrir el archivo en modo lectura. Para ello necesitamos a la clase FileReader
            FileReader lector = new FileReader(archivo); //el objeto lector abrira el archivo en modo lectura
            //Necesitamos poder leer el contenido del archivo y lo hacemos con la clase BufferedReader
            BufferedReader buffer = new BufferedReader(lector);

            //Ya que tenemos todo procedemos a leer el archivo de texto y lo guardamos en nuestro String

           // linea = buffer.readLine(); //leemos el contenido y lo guardamos en un String

            //System.out.println(linea); //la mandamos a imprimir en consola

            //Si queremos leer todas las lineas del documento, podemos recurrir a un ciclo que
            //reemplace nuestro String con la info disponible en el bloc de notas y lo mande a imprimir
            while((linea = buffer.readLine()) != null){ //mientras haya lineas por asignar y no esten vacias
                //Las mandamos a imprimir en consola
                System.out.println(linea);
            }

        } catch (Exception e) { //si algo falla se atrapa aqui
            System.out.println("No se encontro el archivo o no pudo leerse");
        }finally { //finalmente ejecuta esto siempre
            System.out.println("FIN DEL PROGRAMA");
        }


    }

}
