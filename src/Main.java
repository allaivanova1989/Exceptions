public class Main {
    public static void main(String[] args) {
        Model model = new ModelImpl();
        Service service = new ServiceImpl(model);
        View view = new ViewImpl(model);
        try {
            service.getDataFromUser();
        } catch (InvalidMemoryException e) {
            System.out.println(e.getMessage());
            System.out.println(model.getCollection());

        }
        try {
            model.getElementFromColl();
        } catch (EmptyMemoryException e) {
            System.out.println(e.getMessage());
                   }
//
//        Model model1 = new ModelImpl2();
//        Service service = new ServiceImpl(model1);
//        View view = new ViewImpl(model1);
//        try {
//            service.getDataFromUser();
//        } catch (InvalidMemoryException e) {
//            System.out.println(e.getMessage());
//        } catch (InvalidWordRuntimeExcept e) {
//            System.out.println(e.getMessage());
//        }

    }
}
