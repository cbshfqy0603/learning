package a02mystatic;

//被static修饰的成员方法，叫做静态方法
//特点：
//(1)多用在测试类和工具类中
//(2)JavaBean类中很少会用
//调用方式（同一个类中直接调用即可）：（1）类名调用（推荐） （2）对象名调用
//回顾学习过的三种类：
//JavaBean类；用来描述一类事物的类。比如：Student, Teacher, Dog, Cat等
//测试类；用来检查其他类是否书写正确的，带有main方法的类，是程序的入口
//工具类：不是用来描述一类事物的，而是帮我们做一些事情的类
//工具类特点；（1）类名见名知意 （2）私有化构造方法（工具类创建对象没有意义）（3）方法定义为静态（为了方便调用）
public class ArrayUtil {
    //私有化构造方法
    private ArrayUtil() {
    }

    //提供一个工具类方法printArr，用于返回整数数组内容
    //返回字符串格如：[10, 20, 34, 100](只考虑整数数组，且只考虑一维数组)
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }
}
