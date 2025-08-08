package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {
    public static void main(String[] args) {
        //Uso de las clases FileReades y BufferReader para
        //poder leer archivos de nuestro equipo

        //Declaramos un String vacio para poder
        //Guardar la informacion que necesitemos
        //leer de nuestro archivo

        String linea;

        //Try & Catch - Intenta ejecutar un bloque de codigo, pero
        //si algo llegase a ser propenso de fallos, esa excepcion
        //se atrapa en una variable u objeto y se permite ejecutar
        // otra accion o bloque de codigo

        try { //Intenta ejecutar el siguiente codigo
            //Necesitamos Guardar la ruta de acceso a
            //nuestro archivo, Para eso utilizamos la clase File

            File archivo = new File("C:\\Users\\Andres\\Desktop\\Fichero.txt");

            //Necesitamos abrir el archivo en modo lectura
            //Para eso necesitamos a la clase FileReader
            FileReader lector = new FileReader(archivo); //El objeto lector abrira el archivo en modo lectura
            //Necesitamos poder Leer el contenido del archivo y lo hacemos con
            //la clase Bufferreader
            BufferedReader buffer = new BufferedReader(lector);

            //Ya que tenemos todo procedemos a leer nel archivo
            //de texto y la guardamos en nuestro String

            //linea = buffer.readLine(); //Leemos el contenido y lo guardamos en un String

            //System.out.println(linea); //La mandamos a imprimir a consola

            //Si queremos leer todas las lineas del documento, podemos
            //que reemplace nuestro String con la info
            //disponible en el bloc de notas y la mande
            // a imprimir
            while ((linea = buffer.readLine()) != null){ //Mientras haya lineas por asignar y no esten vacias
                //Las mandamos a imprimir en consola
                System.out.println(linea);
            }

        } catch (Exception e) { //y si algo falla se atrapa aqui
            System.out.println("No se encontro el archivo o no pudo leerse");

        }
        finally { //finalmente ejecuta esto siempre
            System.out.println("Fin del Programa");

        }

    }
}
