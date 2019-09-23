import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Tea implements TeaService{
    private Map<String, Double> teaCollection = new HashMap<>();

    public Double calculatePrice () {
        Double totalPrice = 1.0;
        for (String teaElement: teaCollection.keySet()) {
            totalPrice += teaCollection.get(teaElement);
        }
        return totalPrice;
    }

    @Override
    public void serveTea() {
        if (Objects.isNull(teaCollection) || teaCollection.isEmpty()) {
            System.out.println("В чае нет добавок. Базовая цена - $1");
            System.exit(0);
        }
        System.out.print("Подан чай с ");
        String components = "";
        for (String teaElement: teaCollection.keySet()) {
            components += teaElement + ", ";
        }
        components = components.substring(0,components.length() - 2);
        if (components.contains(",")) {
            components = components.substring(0,components.lastIndexOf(",")).concat(" и" + components.substring(components.lastIndexOf("," ) +1));
        }
        System.out.println(components);
        System.out.println("К оплате $" + calculatePrice());
    }

    @Override
    public void addComponent(String name, Double price) {
        teaCollection.put(name, price);
    }
}
