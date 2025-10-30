 import java.util.ArrayList;
 public class collection {
   
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> priceList = new ArrayList<>();
        for (double p : prices) {
            priceList.add(p);
        }
        double highest = priceList.get(0);
        double sum = 0;

        for (double price : priceList) { 
            if (price > highest) {
                highest = price;
            }
            sum += price;
        }

        double average = sum / priceList.size();
        System.out.println("Highest price = " + highest);
        System.out.println("Average price = " + average);
    }


    
}
