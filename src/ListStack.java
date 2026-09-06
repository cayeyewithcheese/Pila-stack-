public class ListStack implements StackInterface {

//     NOTA: Si vas a implementar la pila con la opcion1: array (ArrayStack) puedes borrar este archivo.

    StackNode top;
    int size = 0;

    @Override
    public void clear() {
        top = null;
        size = 0;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean push(Object object) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean search(Object object) {
        return false;
    }
    @Override
    public String toString() {
        String resultado = "";
        StackNode actual = top;

        while (actual != null) {
            resultado += actual.getObject() + " ";
            actual = actual.above;
        }

        return resultado;
    }
}