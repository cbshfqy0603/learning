package LteratorPattern;

public class ProductList extends AbstractObjectList {
    public ProductList() {
        super();
    }

    public void addProduct(String productName) {
        addObject(productName);
    }

    public void displayProducts() {
        System.out.println("产品列表：");
        currentIndex = 0;
        while (!isLast()) {
            System.out.println(next());
        }
        System.out.println(objects.get(currentIndex));
    }
}