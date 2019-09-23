public class Main {

    public static void main(String[] args) {
        TeaDecorator bergamotMilkAndJasmineTea = new BergamotDecorator(new MilkDecorator(new JasmineDecorator(new Tea())));
        bergamotMilkAndJasmineTea.serveTea();
        System.out.println("================");
        TeaDecorator bergamotTea = new BergamotDecorator(new Tea());
        bergamotTea.serveTea();
        System.out.println("================");
        TeaDecorator jasmineTea = new JasmineDecorator(new Tea());
        jasmineTea.serveTea();
        System.out.println("================");
        TeaDecorator milkTea = new MilkDecorator(new Tea());
        milkTea.serveTea();
        System.out.println("================");
        TeaDecorator berriesTea = new BerriesDecorator(new Tea());
        berriesTea.serveTea();
        System.out.println("================");
        TeaDecorator jasmineAndMintTea = new JasmineDecorator(new MintDecorator(new Tea()));
        jasmineAndMintTea.serveTea();
        System.out.println("================");
        TeaDecorator cinnamonMilkAndBerriesTea = new CinnamonDecorator(new MilkDecorator(new BerriesDecorator(new Tea())));
        cinnamonMilkAndBerriesTea.serveTea();
        System.out.println("================");
        TeaDecorator superTea = new BerriesDecorator(new MintDecorator(new CinnamonDecorator(new JasmineDecorator(new BergamotDecorator(new MilkDecorator(new Tea()))))));
        superTea.serveTea();
    }
}
