import java.util.Random;

public class PGM_Experiment_2 {

    static class Customer {
        int cust_id;
        int product_views;
        boolean purchased;

        Customer(int custId, int productViews, boolean purchased) {
            this.cust_id = custId;
            this.product_views = productViews;
            this.purchased = purchased;
        }
    }

    public static void main(String[] args) {

        int totalCustomers = 100;
        Customer[] customers = new Customer[totalCustomers];

        Random random = new Random();
        for (int i = 0; i < totalCustomers; i++) {
            int views = random.nextInt(10) + 1;
            boolean purchased = random.nextBoolean();
            customers[i] = new Customer(i + 1, views, purchased);
        }

        int count_5 = 0;
        int purchased_true = 0;

        for (Customer customer : customers) {
            if (customer.product_views > 5) {
                count_5++;
                if (customer.purchased) {
                    purchased_true++;
                }
            }
        }
        
        double probability = (count_5 == 0) ? 0 : (double) purchased_true / count_5;

        System.out.println("Number of customers with more than 5 views: " + count_5);
        System.out.println("Number of customers who purchased the product: " + purchased_true);
        System.out.println("Probability of purchase given views > 5: " + probability);
    }
}