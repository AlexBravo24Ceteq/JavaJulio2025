package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR_ALF {
    public static void main(String[] args) {

        //uso de las clases File, FileRider
        //y BufferRIDER PARA LLEER ARCHIVOS DE NUESTRO EQUIPO
        //declaramos string vacio para poder guardar la informacion
        //necesitamos leer nuestro archivo
        //try & catch - intenta ejecutar un bloque de codigo
        //pero si falla  su exception atrapa una variable o un objeto
        //y permite ejecutar otro bloque de codigo
        String linea;
        try {//intenta ejecutar el sigueinte codigo
            //guardamos la ruta de acceso a nuestro archivo para ello tulizamos File
            File archivo = new File("C:\\Users\\Monse\\Desktop\\fichero.txt");
            //necesitamos abrir el archivo en modo lectrura se necesita la clase FileReader
            FileReader lector = new FileReader(archivo);
            //necesitamos poder leer el archivo y se ara con la clase BufferReader
            BufferedReader buffer = new BufferedReader(lector);
            //ya tenemos procedemos a leer la linea de texto y lo guardamos en un string
            //para leer todas las lineas del documento se recurre a un ciclo que reemplase
            //el string con la informacion del documento
            //linea = buffer.readLine();
           // System.out.println(linea);
            while ((linea = buffer.readLine()) != null){
                System.out.println(linea);
            }

        } catch (Exception e) { //si algo falla se atrapa aqui
            System.out.println("No se encontro el archivo o no pudo lerse ):");
        }finally {//finalmente ejecuta esto siempre
            System.out.println("FIN DEL SISTEMA");
        }
    }
}
