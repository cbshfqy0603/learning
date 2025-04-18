package ProxyPattern;

public class ProxySearcher implements Searcher {
    private RealSearcher realSearcher; // 真实搜索对象
    private AccessValidator accessValidator; // 身份验证对象
    private Logger logger; // 日志记录对象
    public ProxySearcher() {
        // 初始化所有依赖对象
        this.realSearcher = new RealSearcher();
        this.accessValidator = new AccessValidator();
        this.logger = new Logger();
    }
    @Override
    public String doSearch(String userId, String keyword) {
        // 1. 验证用户身份
        if (!accessValidator.validate(userId)) {
            throw new SecurityException("用户 " + userId + " 无权限访问搜索功能！");
        }
        // 2. 调用真实搜索功能
        String result = realSearcher.doSearch(userId, keyword);
        // 3. 记录日志
        logger.log(userId, "搜索");
        // 4. 返回结果
        return result;
    }
}
