public class CinnamonDecorator extends TeaDecorator {
    public CinnamonDecorator(TeaService teaService) {
        super(teaService);
    }

    @Override
    public void serveTea() {
        teaService.addComponent("корицей", 0.40);
        super.serveTea();
    }
}
