package ProxyPattern;

public class AccessValidator {
    public boolean validate(String userId) {
        // 模拟身份验证逻辑，仅允许 "admin" 用户通过
        System.out.println("正在验证用户: " + userId);
        return "admin".equals(userId);
    }
}
