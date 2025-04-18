package ProxyPattern;

public class Logger {
    public void log(String userId, String action) {
        System.out.println("日志记录: 用户 " + userId + " 进行了 " + action + " 操作, 时间: " + new java.util.Date());
    }
}
