package vector;

import java.util.Vector;

public class ListaVector {
    public static void main(String[] args) {
        Vector<String> pila = new Vector<>();

        //Implementa Collection
        pila.add("H");
        pila.add("O");
        pila.add("L");
        pila.add("A");
        pila.add(" ");
        pila.add("M");
        pila.add("U");
        pila.add("N");
        pila.add("D");
        pila.add("O");

        System.out.println("Lista: " + pila);

        //Tiene metodos propios de Vector

        Vector<String> listaVector = new Vector<>();

        //Capacidad inicial de 10 por defecto

        System.out.println("Capacity: " + listaVector.capacity());

        listaVector.addElement("Hola");

        listaVector.addElement("Mundo");

        System.out.println("Lista unida: " + listaVector);

        System.out.println("Primer elemento: " + listaVector.firstElement());

        System.out.println("Ultimo elemento: " + listaVector.lastElement());

        //añadir 20 elementos

        for (int i = 0; i < 20; i++) {
            listaVector.addElement("Elemento " + i);
        }

        //La capacidad se duplica automaticamente, un ArrayList se incrementa en 50%

        System.out.println("Capacity: " + listaVector.capacity());

        System.out.println("ElementAt: " + listaVector.elementAt(0));
    }
}
