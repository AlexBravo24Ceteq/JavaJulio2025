package com;

import java.util.LinkedList;
import java.util.Queue;

public class ColeccionesQueue {
    public static void main(String[] args) {

        Queue<String> cola1 = new LinkedList<String>();
        //Añadimos 3 datos
        cola1.add("juan");
        cola1.add("ana");
        cola1.add("luis");
        System.out.println(cola1.size()); //Cantidad de elementos en la cola:
        System.out.println(cola1.poll()); //Extraemos un elemento de la cola
        System.out.println(cola1.size()); //Cantidad de elementos en la cola
        System.out.println(cola1.peek()); //Consultamos el primer elemento de la cola sin extraerlo
        System.out.println(cola1.size()); //Cantidad de elementos en la cola

        //Extraemos uno a un cada elemento de la cola mientras no este vacía
        while (!cola1.isEmpty())
            System.out.print(cola1.poll() + "-");
        System.out.println();
    }
}
