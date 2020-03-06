package model;

public enum PizzaSize {

    LARGE(40, 10),
    MEDIUM(30, 7),
    SMALL(20, 0);

    private int size;
    private double sizePrice;

    PizzaSize(int size, double sizePrice) {
        this.size = size;
        this.sizePrice = sizePrice;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSizePrice() {
        return sizePrice;
    }
}
