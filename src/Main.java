import model.PieType;
import model.PizzaRepository;
import model.PizzaSize;
import model.SauceType;
import service.OrderService;


class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        //PizzaRepository.printPizzaList();

        //orderService.orderPizza(7, PizzaSize.LARGE, SauceType.GARLIC, PieType.THICK, "MUSHROOMS MEAT MEAT MEAT DOUBLECHEESE");

        //orderService.giveMePizzaWith("tomato"); // cheese // meat

        //orderService.giveMePizzaSize("largee");

        //orderService.findTheBestPizzaByPrice(13.99);

    }
}
