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
        return size == 0;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return top.getObject();

    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object object = top.getObject();
        top = top.above;
        size--;
        return object;
    }
    @Override
    public boolean push(Object object) {
        
        StackNode nuevo = new StackNode(object);
        nuevo.above = top;
        top = nuevo;
        size++;
        return true;
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