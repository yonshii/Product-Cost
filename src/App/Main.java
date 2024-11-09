package App;

public class Main {
    public static void main(String[] args) {
        String[] data = getData();
        Product product = new Product(data[0],
                Integer.parseInt(data[1]),
                Double.parseDouble(data[2]));

        CalcCostBase costBase = new CalcCostBase();
        double baseCost = costBase.calcCost(product);

        CalcCostDelivery costDelivery = new CalcCostDelivery(5);
        double deliveryCost = costDelivery.calcCost(product);
        String baseOutput = product + "\nCost is " +
                baseCost + " " + Constants.CURRENCY + ".";
        String deliveryOutput = product + "\nCost is " +
                deliveryCost + " " + Constants.CURRENCY + ".";

        getOutput(deliveryOutput);
        getOutput(baseOutput);
    }

    public static String[] getData() {
        return new String[]{"Perfume", "2", "97"};
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
