package linkedlist;

import java.util.LinkedList;

public class ListaUnida {
    public static void main(String[] args) {
        LinkedList<String> holaMundo = new LinkedList<>();

        //Implementa Collection
        holaMundo.add("H");
        holaMundo.add("O");
        holaMundo.add("L");
        holaMundo.add("A");
        holaMundo.add(" ");
        holaMundo.add("M");
        holaMundo.add("U");
        holaMundo.add("N");
        holaMundo.add("D");
        holaMundo.add("O");

        System.out.println("Lista: " + holaMundo);

        //Tiene metodos propios de LinkedList

        LinkedList<String> listaUnida = new LinkedList<>();

        listaUnida.addFirst("Hola");
        listaUnida.addLast("Mundo");

        System.out.println("Lista unida: " + listaUnida);

        System.out.println("Primer elemento: " + listaUnida.getFirst());
        System.out.println("Ultimo elemento: " + listaUnida.getLast());

        System.out.println("Peek: " + listaUnida.peek());
        System.out.println("PeekLast: " + listaUnida.peekLast());

        System.out.println("Poll: " + listaUnida.poll());
        System.out.println("Lista unida: " + listaUnida);

        listaUnida.get(0); //Se puede acceder a los elementos por indice aunque no es muy eficiente
    }
}
