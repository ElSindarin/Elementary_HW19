public class JasmineDecorator extends TeaDecorator {
    public JasmineDecorator(TeaService teaService) {
        super(teaService);
    }

    @Override
    public void serveTea() {
        teaService.addComponent("жасмином", 0.25);
        super.serveTea();
    }
}
