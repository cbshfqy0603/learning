package FacadePattern;

public class Client {
    public static void main(String[] args) {
        //创建外观对象
        EncryptFacade facade = new EncryptFacade();
        //调用外观方法进行文件加密
        facade.encryptFile("input.txt", "output.txt");
    }
}
