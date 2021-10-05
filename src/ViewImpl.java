public class ViewImpl implements View{
    private Model model;

    public ViewImpl(Model model) {
        this.model = model;
    }

    @Override
    public void giveDataForUser() {
        model.getCollection();

    }
}
