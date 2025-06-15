package ProcessControl;

/*
for循环和while循环对比：
相同点：for循环和while循环的运行规则一样
不同点：
(1)for循环:知道循环的次数和范围
(2)while循环:不知到循环的次数和范围，只知道循环结束的条件
 */
public class WhileDemo {
    public static void main(String[] args) {
        /*
        世界最高峰是珠穆朗玛峰(8844.43米 = 884443毫米)
        现在我有一张足够大，且厚度为0.1毫米的纸
        试问，我折叠多少次之后，纸张的高度会超过珠穆朗玛峰
         */
        //珠穆拉玛峰的高度
        double height = 8844430;
        //纸张目前的高度
        double paper = 0.1;
        //用于统计次数的变量
        int count = 0;
        while (paper < height) {
            paper = paper * 2;
            count++;
        }
        System.out.println("折叠" + count + "次之后，纸张的高度会超过珠穆朗玛峰");
    }
}
