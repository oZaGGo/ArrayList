import arraylist.Cola;

public class EjercicioComplejo {
    public static void main() {
        Cola cola = new Cola();

        cola.add("Hola");
        cola.add("Mundo");

        System.out.println("Poll: " + cola.poll());
        System.out.println("Peek: " + cola.peek());
        System.out.println("Empty: " + cola.empty());
        System.out.println("Poll 2: " + cola.poll());
        System.out.println("Empty 2: " + cola.empty());
    }
}
