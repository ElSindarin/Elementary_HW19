public class MintDecorator extends TeaDecorator {

    public MintDecorator(TeaService teaService) {
        super(teaService);
    }

    @Override
    public void serveTea() {
        teaService.addComponent("мятой", 0.10);
        super.serveTea();
    }
}
