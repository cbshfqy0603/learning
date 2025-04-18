package FacadePattern;

public class FileReader {
    public String read(String fileName) {
        System.out.println("读取文件: " + fileName);
        //模拟读取文件内容
        return "这是一个待加密的测试文件内容";
    }
}
