import java.util.Scanner;

public class ServiceImpl implements Service {
    private Model model;

    public ServiceImpl(Model model) {
        this.model = model;
    }

    @Override
    public void getDataFromUser() throws InvalidMemoryException, InvalidWordRuntimeExcept {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a name");

        for (int i = 0; i<100; i++){
         String word = scanner.next();
        model.putData(word.toLowerCase());}
    }

//
//        for (int i = 0; i < modelimpl.getName().size(); i++) {

}


