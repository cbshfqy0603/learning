package a02mystatic;

public class TestDemo {
    public static void main(String[] args) {
        //定义一个整型数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //调用printArr()方法 工具类中的方法都是静态方法（利用类名直接调用）
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);
        //定义一个浮点型数组
        double[] arr1 = {11.5, 12.3, 56.2, 67.1};
        //调用getAverage()方法
        double average = ArrayUtil.getAverage(arr1);
        System.out.println(average);
    }
}
