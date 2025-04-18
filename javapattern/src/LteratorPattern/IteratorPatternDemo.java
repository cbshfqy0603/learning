package LteratorPattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct("笔记本电脑");
        productList.addProduct("智能手机");
        productList.addProduct("平板电脑");


        System.out.println("正向遍历产品列表：");
        productList.displayProducts();

        System.out.println("\n反向遍历产品列表：");
        productList.currentIndex = productList.getObjects().size() - 1;
        while (!productList.isFirst()) {
            System.out.println(productList.previous());
        }
        System.out.println(productList.getObjects().get(productList.currentIndex)); // 输出第一个元素

        CustomerList customerList = new CustomerList();
        customerList.addCustomer("张三");
        customerList.addCustomer("李四");
        customerList.addCustomer("王五");

        System.out.println("\n正向遍历客户列表：");
        customerList.displayCustomers();
    }
}