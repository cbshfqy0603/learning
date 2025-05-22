package StringBuilderDemo;

public class StringBuilderDemo5 {
    public static void main(String[] args) {
        //需求：定义一个方法，把int类型数组中的数据按照指定的格式拼接成一个字符串返回
        //调用该方法，并在控制台输出结果
        //例如：数组为int[] arr = [1, 2, 3];
        //执行方法后的输出结果为：[1, 2, 3]
        //定义一个int类型的数组
        int[] arr = {1, 2, 3};
        //调用方法将数组按照指定的格式拼接成一个字符串
        String result = arrToString(arr);
        //打印结果
        System.out.println(result);
    }
    //我要干什么 --- 我要把数组按照指定格式拼接成字符串后返回
    //我需要什么 --- 我需要字符串
    //方法调用处是否需要返回中 --- 必须需要(返回String类型)
    public static String arrToString(int[] arr) {
        //定义一个StringBuilder对象
        StringBuilder sb  = new StringBuilder();
        //拼接左括号
        sb.append("[");
        //利用循环来拼接数组元素
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        //拼接右括号
        sb.append("]");
        return sb.toString();
    }
}
