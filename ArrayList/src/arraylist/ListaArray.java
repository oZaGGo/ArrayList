package arraylist;

import java.util.ArrayList;

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

    }
}
