public abstract class TeaDecorator implements TeaService{
    protected TeaService teaService;

    public TeaDecorator(TeaService teaService) {
        this.teaService = teaService;
    }

    @Override
    public void serveTea() {
        teaService.serveTea();
    }

    @Override
    public void addComponent(String name, Double price) {
        teaService.addComponent(name, price);
    }
}
