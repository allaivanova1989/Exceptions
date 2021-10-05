public class Main {
    public static void main(String[] args) {
//        Model model = new ModelImpl();
//        Service service = new ServiceImpl(model);
//        View view = new ViewImpl(model);
//        try {
//            service.getDataFromUser();
//        } catch (InvalidMemoryException e) {
//            System.out.println(e.getMessage());
//            System.out.println(model.getCollection());
//
//        }
//        try {
//            model.getElementFromColl();
//        } catch (EmptyMemoryException e) {
//            System.out.println(e.getMessage());
//                   }

        Model model1 = new ModelImpl2();
        Service service1 = new ServiceImpl2(model1);
        View view1 = new ViewImpl2(model1);
        try {
            service1.getDataFromUser();
        } catch (InvalidMemoryException e) {
            System.out.println(e.getMessage());
        } catch (InvalidWordRuntimeExcept e) {
            System.out.println(e.getMessage());
        }

    }
}
