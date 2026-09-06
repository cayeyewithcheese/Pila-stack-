public class Main {
    public static void main(String[] args) {
        ListStack pila = new ListStack();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Pila: " + pila);
        System.out.println("Tamaño: " + pila.size());

        System.out.println("Tope: " + pila.peek());

        System.out.println("Sacando: " + pila.pop());

        System.out.println("Pila después: " + pila);
        System.out.println("Tamaño: " + pila.size());

        System.out.println("¿Está el 10?: " + pila.search(10));
        System.out.println("¿Está el 50?: " + pila.search(50));
    }
}


