import java.util.ArrayDeque;
import java.util.Queue;

public class ModelImpl2 implements Model {
    private Queue<String> word = new ArrayDeque<>();

    @Override
    public void putData(String data) throws InvalidMemoryException, InvalidWordRuntimeExcept {
        word.add(data);
        if (word.size() == 5) {
            throw new InvalidMemoryException("Memory is full. The maximum number of elements is 5");
        }
        if (data.equals("get")) {
            word.element();
            System.out.println(word.element());

        } else if (data.equals("stop")) {
            throw new InvalidWordRuntimeExcept("this word  cannot be saved");
        }

    }

    @Override
    public Queue getCollection() {
        return word;
    }

    @Override
    public void getElementFromColl() {
        System.out.println(word.poll());

    }
}
