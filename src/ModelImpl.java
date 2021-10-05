import java.util.ArrayDeque;
import java.util.Queue;

public class ModelImpl implements Model {
    private Queue<String> name = new ArrayDeque<>();

    @Override
    public void putData(String data) throws InvalidMemoryException, InvalidWordRuntimeExcept {
        name.add(data);
        if (name.size() == 5) {
            throw new InvalidMemoryException("Memory is full. The maximum number of elements is 5");
        }

    }
    public Queue getCollection() {
       return name;
    }
    @Override
    public void getElementFromColl() throws EmptyMemoryException {
        if (name.size() == 0) {
            throw new EmptyMemoryException("The collection is empty");
        }
        System.out.println( name.poll());
    }
}

