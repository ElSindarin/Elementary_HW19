public class MilkDecorator extends TeaDecorator {
    public MilkDecorator(TeaService teaService) {
        super(teaService);
    }

    @Override
    public void serveTea() {
        teaService.addComponent("молоком", 0.75);
        super.serveTea();
    }
}
