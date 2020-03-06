package model;

public class Ingredients {

    private String name;
    private IngredientType ingedientType;


    public Ingredients(String name, IngredientType ingedientType) {
        this.name = name;

        this.ingedientType = ingedientType;
    }

    public String getName() {
        return name;
    }



    public IngredientType getIngedientType() {
        return ingedientType;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "name='" + name + '\'' +
                ", ingedientType=" + ingedientType +
                '}';
    }
}
