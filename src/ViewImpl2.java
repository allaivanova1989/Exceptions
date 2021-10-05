public class ViewImpl2 implements View {
    private Model model;

    public ViewImpl2(Model model) {
        this.model = model;
    }

    @Override
    public void giveDataForUser() {
        model.getCollection();
    }
}
