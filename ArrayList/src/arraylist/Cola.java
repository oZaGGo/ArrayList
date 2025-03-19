package arraylist;

import java.util.ArrayList;

public class Cola implements Lista {
    private ArrayList<String> cola;

    public Cola() {
        this.cola = new ArrayList<String>();
    }

    public Cola(int size){
        this.cola = new ArrayList<String>(size);
    }

    public boolean empty() {
        return cola.isEmpty();
    }

    public int size() {
        return cola.size();
    }

    public void add(String element) {
        cola.add(element);
    }

    public String peek() {
        return cola.get(0);
    }

    public String poll() {
        String element = cola.get(0);
        cola.remove(0);
        return element;
    }
}
