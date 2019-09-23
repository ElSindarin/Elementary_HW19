public class BergamotDecorator extends TeaDecorator {
    public BergamotDecorator(TeaService teaService) {
        super(teaService);
    }

    @Override
    public void serveTea() {
        teaService.addComponent("бергамотом", 0.50);
        super.serveTea();
    }

}
