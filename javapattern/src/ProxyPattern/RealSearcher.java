package ProxyPattern;

public class RealSearcher implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        // 模拟真实的搜索逻辑
        System.out.println("真实搜索器正在执行搜索: 用户 " + userId + " 搜索关键词: " + keyword);
        return "搜索结果: 找到了与 '" + keyword + "' 相关的内容";
    }
}
