package pila;

import java.util.Stack;

public class Pila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        //Añadiendo elementos por orden

        pila.push("Primero");
        pila.push("Segundo");
        pila.push("Tercero");
        pila.push("Cuarto");

        //Buscar elemento (1 es la cima de la pila)

        System.out.println("Pila de \"Cuarto\" :" + pila.search("Cuarto"));

        //devuelven valores distintos
        System.out.println("indice de \"Cuarto\" :" + pila.indexOf("Cuarto"));

        //Stack sigue el principio LIFO

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }



    }
}
