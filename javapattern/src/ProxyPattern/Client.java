package ProxyPattern;

public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        Searcher searcher = new ProxySearcher();

        try {
            // 测试合法用户
            System.out.println("测试合法用户：");
            String result1 = searcher.doSearch("admin", "Java");
            System.out.println(result1);

            System.out.println("-------------------");

            // 测试非法用户
            System.out.println("测试非法用户：");
            String result2 = searcher.doSearch("guest", "Python");
            System.out.println(result2);
        } catch (SecurityException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
}
