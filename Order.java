import java.util.Scanner;

public class Order {
    long order_id;
    String order_item;
    double order_amount;
    char order_type;

    // Constructor
    Order(long order_id,
            String order_item,
            double order_amount,
            char order_type) {
        this.order_id = order_id;
        this.order_item = order_item;
        this.order_amount = order_amount;
        this.order_type = order_type;
    }

    // Getters:
    public long get_id() {
        return order_id;
    }

    public String get_item() {
        return order_item;
    }

    public double get_amount() {
        return order_amount;
    }

    public char get_type() {
        return order_type;
    }

    // Setters:
    public void set_id(long order_id) {
        this.order_id = order_id;
    }

    public void set_item(String order_item) {
        this.order_item = order_item;
    }

    public void set_amount(double order_amount) {
        this.order_amount = order_amount;
    }

    public void set_type(char order_type) {
        this.order_type = order_type;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long id = sc.nextLong();
        String item = sc.next();
        double amount = sc.nextDouble();
        char type = sc.next().charAt(0);

        Order o = new Order(id, item, amount, type);
        
        System.out.println(o.get_id());
        System.out.println(o.get_item());
        System.out.println(o.get_amount());
        System.out.println(o.get_type());

        sc.close();
    }
}
