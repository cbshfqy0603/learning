package String;
//String replace(旧值， 新值) 替换
//注意点：只有返回值才是替换之后的结果
public class StringDemo11 {
    public static void main(String[] args) {
        //需求：敏感词替换
        String talk = "NMLGB,NTM会不会玩啊，SB，EH，CNM";
        //定义一个敏感词库
        String[] arr = {"NMLGB", "CNM", "SB", "NTM", "EH"};
        //利用循环来把敏感词替换为"***"
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
            //如果有则替换，没有就不替换
        }
        //打印替换后的结果：
        System.out.println(talk);
    }
}
