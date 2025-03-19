package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListaArray {
    public static void main(String[] args) {
        ArrayList<String> listaArray = new ArrayList<>();

        //Añadir elementos con la interfaz Collection

        listaArray.add("Hola");
        listaArray.add("mundo");

        //Obtener valores por los indices

        System.out.println(listaArray.get(0) + " " + listaArray.get(1));

        //Devolver el indice de un elemento

        System.out.println("Indice de \"hola\" :" + listaArray.indexOf("hola"));

        //Eliminar elemento

        listaArray.remove("hola");

        //Se puede tambien borrar el primero o ultimo

        //Reemplazar un elemento por indice

        listaArray.set(0, "Hola mundo!");

        //Imprimir usando un for-each

        for (String elemento : listaArray) {
            System.out.println(elemento);
        }

        //Ver su tamaño

        System.out.println("Tamaño del ArrayList: " + listaArray.size());

        //Podemos usarlo para iterar el ArrayList

        for (int i = 0; i < listaArray.size(); i++) {
            System.out.println(listaArray.get(i));
        }

        //Podemos ver si contiene un elemento X

        System.out.println("Contiene \"mundo\"? " + listaArray.contains("mundo"));

        //Como hacer sublistas

        ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));

        ArrayList<String> sublista = new ArrayList<>(lista1.subList(0,2));

        System.out.println();
        System.out.println("ArrayList completo: ");
        for (String e: lista1){
            System.out.println(e);
        }
        System.out.println("Subarray: ");
        for (String e:sublista){
            System.out.println(e);
        }

        //Diferencia entre indexOf y binarySearch

        ArrayList<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1,3,4,6,8,3,6,9,7));

        //Buscamos la pos de 3

        System.out.println("indexOf: " + listaEnteros.indexOf(3));

        System.out.println("binarySearch: " + Collections.binarySearch(listaEnteros,3));

    }
}
