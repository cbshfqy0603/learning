package FacadePattern;

public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("执行加密操作");
        //模拟加密过程，并将每个字符替换为 '*'
        String encryptedText = plainText.replaceAll(".", "*");
        return encryptedText;
    }
}
