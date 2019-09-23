public class BerriesDecorator extends TeaDecorator {
    public BerriesDecorator(TeaService teaService) {
        super(teaService);
    }

    @Override
    public void serveTea() {
        teaService.addComponent("ягодами", 0.60);
        super.serveTea();
    }
}
