import java.util.Queue;

public interface Model {

     void putData (String data) throws InvalidMemoryException;
     Queue getCollection ();

     void getElementFromColl() throws EmptyMemoryException;
}
