package App;

public class CalcCostDelivery extends CalcCostBase{
    private final double deliveryPrice;

    public CalcCostDelivery(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public double calcCost(Product product) {
        double baseCost = super.calcCost(product);
        return baseCost + deliveryPrice;
    }
}