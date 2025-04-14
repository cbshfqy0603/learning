package Test;

public class Test2Case2 {
    public static void main(String[] args) {
        //需求：给定字符串，A和B
        //A的旋转操作就是将A的最左边字符移动到最右边
        //例如：若A = "abcde,在移动一次之后的结果为就是"bcdea"
        //如果在若干次调正操作后，A能变成B，那么返回true 否则返回flase
        //定义两个字符串
        String strA = "abcde";
        String strB = "eabcd";
        //调用方法
        boolean result = check(strA, strB);
        //打印结果
        System.out.println(result);

    }
    //定义一个方法用于多次旋转操作并进行判断
    public static boolean check(String strA, String strB) {
        //旋转并判断
        //"abcde" -> "bcdea" 第一次
        //"bcdea" -> "cdeab" 第二次
        //"cdeab" -> "deabc" 第三次
        //"deabc" -> "eabcd" 第四次
        //"eabcd" -> "abcde" 第五次
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }
    //定义一个方法用于字符串的旋转操作
    public static String rotate(String str) {
        //套路：
        //如果我们看到要修改字符串的内容
        //可以有两个方法：
        //1.用substring进行截取，把左边的字符串截取出来拼接到右边去
        //2.可以把字符串先变成一个字符数组，然后调整字符数组里面的数据，最后再把字符数组变成字符串
        //Case2利用思路二：首先把字符串先变成字符数组，然后调整字符数组里面的数据，最后再把字符数组变成字符串
        //首先利用toCharArray()方法将字符串转换为字符数组
        char[] arr = str.toCharArray();
        //取出字符数组第一个元素、
        char first = arr[0];
        //调整字符数组里面元素的顺序
        //[A, B, C, D] -> [B, C, D, D]
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        //把第一个元素放到最后
        arr[arr.length - 1] = first;
        //利用new String(char[] arr)构造方法，把字符数组弄成字符串
        String result = new String(arr);
        return result;
    }
}
