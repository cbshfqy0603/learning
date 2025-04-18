package LteratorPattern;

public class CustomerList extends AbstractObjectList {
    public CustomerList() {
        super();
    }

    public void addCustomer(String customerName) {
        addObject(customerName);
    }

    public void displayCustomers() {
        System.out.println("客户列表：");
        currentIndex = 0;
        while (!isLast()) {
            System.out.println(next());
        }
        System.out.println(objects.get(currentIndex));
    }
}