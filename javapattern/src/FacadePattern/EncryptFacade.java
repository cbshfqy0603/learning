package FacadePattern;

public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    //构造方法初始化
    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipher = new CipherMachine();
        this.writer = new FileWriter();
    }

    //封装文件加密流程
    public void encryptFile(String inputFile, String outputFile) {
        //读取文件内容
        String plainText = reader.read(inputFile);
        //加密内容
        String encryptedText = cipher.encrypt(plainText);
        //写入加密内容到目标文件
        writer.write(encryptedText, outputFile);
        System.out.println("文件加密完成");
    }
}
