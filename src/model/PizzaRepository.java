package model;

import java.util.*;
import java.util.stream.Collectors;

public class PizzaRepository {

    private static final Set<Pizza> pizzaSet = new HashSet<>();
    private static final Set<Ingredients> ingr = new HashSet<>();

    static {
        pizzaSet.add(new Pizza(1, "Margherita", 16, PizzaSize.SMALL, SauceType.TOMATO, PieType.STANDARD)
                .addIngredients(new Ingredients("Cheese & Tomato", IngredientType.CHEESETOMATO))
        );
        pizzaSet.add(new Pizza(2, "Green & Fresh", 18, PizzaSize.SMALL, SauceType.TOMATO, PieType.STANDARD)
                .addIngredients(new Ingredients("Vegetables", IngredientType.VEGETABLE))
        );
        pizzaSet.add(new Pizza(3, "Red Neck", 20, PizzaSize.SMALL, SauceType.TOMATO, PieType.STANDARD)
                .addIngredients(new Ingredients("Ham", IngredientType.MEAT))
        );

        pizzaSet.add(new Pizza(4, "All in One", 16, PizzaSize.SMALL, SauceType.GARLIC, PieType.THICK)
                .addIngredients(new Ingredients("Ham", IngredientType.MEAT))
                .addIngredients(new Ingredients("Chicken", IngredientType.MEAT))
                .addIngredients(new Ingredients("Mush", IngredientType.MUSHROOMS))
                .addIngredients(new Ingredients("Double Cheese", IngredientType.DOUBLECHEESE))
                .addIngredients(new Ingredients("aaa", IngredientType.MEAT))

        );
        pizzaSet.add(new Pizza(5, "Fire", 20, PizzaSize.LARGE, SauceType.HOT, PieType.STANDARD)
                .addIngredients(new Ingredients("Salami", IngredientType.MEAT))
                .addIngredients(new Ingredients("Chicken", IngredientType.MEAT))
        );

        pizzaSet.add(new Pizza(6, "Red Neck", 20, PizzaSize.SMALL, SauceType.TOMATO, PieType.STANDARD)
                .addIngredients(new Ingredients("Cheese", IngredientType.DOUBLECHEESE))
        );
        pizzaSet.add(new Pizza(7, "Red Neck", 20, PizzaSize.MEDIUM, SauceType.TOMATO, PieType.STANDARD)
                .addIngredients(new Ingredients("Cheese", IngredientType.DOUBLECHEESE))
        );


    }


    public void addPizza(Pizza pizza) {
        pizzaSet.add(pizza);
    }

    public static void printPizzaList() {
        for (Pizza pizza : pizzaSet) {
            System.out.println(pizza);
        }
    }

    public Pizza findPizzaById(int id) {
        List<Pizza> pizza = pizzaSet.stream()
                .filter(p -> p.getId() == id)
                .collect(Collectors.toList());
        return pizza.get(0);
    }


    public Set<Ingredients> findPizzaByIngredient(String ingredient) {
        System.out.println("Szukanie po skladniku");
        Set<Ingredients> pizzaFindedSet = pizzaSet.stream()
                .map(x -> x.getIngredients())
                .flatMap(Collection::stream)
                .filter(p -> p.getIngedientType().name().contains(ingredient.toUpperCase()))
                .collect(Collectors.toSet());

        return pizzaFindedSet;

    }

    public Set<Pizza> findPizzaByIngredient2(String ingredient) {
        //System.out.println(ingredients.getIngedientType().name());
        System.out.println("Szukanie po skladniku " + ingredient);
        Set<Pizza> pizzaFindedSet2 = pizzaSet.stream()
                .filter(x -> x.getIngredients().stream()
                        .anyMatch(y -> y.getIngedientType().name().contains(ingredient.toUpperCase())))

                .collect(Collectors.toSet());
        return pizzaFindedSet2;
    }

    public Set<Pizza> findPizzaBySize(PizzaSize size) {
        System.out.println(size.name());
        System.out.println("Szukanie po rozmiarze " + size);
        Set<Pizza> pizzaFindedSet3 = pizzaSet.stream()
                .filter(x -> x.getPizzaSize().name().contains(size.name()))
                .collect(Collectors.toSet());

        //pizzaFindedSet3.forEach(x -> System.out.println(x));
        return pizzaFindedSet3;
    }

    public Optional<Pizza> findPizzaByPrice(Double maxPrice) {
        System.out.println("Szukanie po cenie " + maxPrice);
        Optional<Pizza> pizzaFindedSet4 = pizzaSet.stream()
                .filter(x -> x.getPrice() < maxPrice)
                .sorted(Comparator
                        .comparing(Pizza::getPrice)
                        .reversed())
                .findFirst();

        return pizzaFindedSet4;
    }


    public static Set<Pizza> getAllPizza() {
        return pizzaSet.stream().collect(Collectors.toSet());

    }

    public static void findPizzaBy(String ingredient) {
        System.out.println(ingredient);
        List<Ingredients> pizzaFinded = getAllPizza().stream()
                .map(Pizza::getIngredients)
                .flatMap(Collection::stream)

                .filter(p -> p.getIngedientType().name().contains(ingredient.toUpperCase()))
                .collect(Collectors.toList());

        pizzaFinded.forEach(System.out::println);

    }


}
