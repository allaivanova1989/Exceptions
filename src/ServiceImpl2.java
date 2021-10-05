import java.util.Queue;
import java.util.Scanner;

public class ServiceImpl2 implements Service {
    private Model model;

    public ServiceImpl2(Model model) {
        this.model = model;
    }

    @Override
    public void getDataFromUser() throws InvalidMemoryException, InvalidWordRuntimeExcept {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word");

        for (int i = 0; i < 100; i++) {
            String word = scanner.next();
            model.putData(word.toLowerCase());
        }
    }
}



