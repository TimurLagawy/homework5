import java.util.List;
public class Base_of_customers {
    private static List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers=customers;
    }
    public  Base_of_customers(List<Customer> customers){
        this.customers=customers;
    }
    public static void printNameById(int id){
        for (int i = 0; i < customers.size(); i++) {
            if (id==customers.get(i).getId()){
                System.out.println(customers.get(i));
            }
        }
    }
}

