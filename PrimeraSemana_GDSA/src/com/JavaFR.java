package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class JavaFR {
    public static void main(String[] args) {
        /*
        cclases file reader y bufferreader para leer archivos
            de nuestro equipo
         */
        String linea;
        try { //intenta ejecutar codigo
            File archivo =new File("C:\\Users\\Gerardo Solis\\Desktop\\File.txt");
            FileReader lector= new FileReader(archivo);
            BufferedReader buffer=new BufferedReader(lector);
            /*linea = buffer.readLine();
            System.out.println(linea);*/

            //para leeer todas las lineas hay que usar un ciclo
            while((linea= buffer.readLine())!= null){
                System.out.println(linea);
            }

        }catch (Exception e){// falla cae aqui
            System.out.println("no pudo leerse intenta denuevo");
        }finally{
            //ejecuta esto siempre
            System.out.println("/////////Fin del Programa////////////");
        }
    }
}
