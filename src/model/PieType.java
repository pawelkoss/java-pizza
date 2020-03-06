package model;

public enum PieType {
    STANDARD(0.00), THIN(3.00), THICK(2.00);

    private double piePrice;

    PieType(double piePrice) {
        this.piePrice = piePrice;
    }

    public double getPiePrice() {
        return piePrice;
    }
}

