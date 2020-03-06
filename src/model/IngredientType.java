package model;

public enum IngredientType {
    CHEESETOMATO(0.00),
    MEAT(3.00),
    VEGETABLE(2.00),
    MUSHROOMS(2.50),
    FRUTTIDIMARE(4.00),
    DOUBLECHEESE(2.50);

    private double ingredientPrice;

    IngredientType(double ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }

    public double getIngredientPrice() {
        return ingredientPrice;
    }

    @Override
    public String toString() {
        return "IngredientType{name=" + name() +
                " Price=" + ingredientPrice +
                '}';
    }
}
