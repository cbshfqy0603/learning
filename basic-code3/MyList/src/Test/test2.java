package Test;

import java.util.ArrayList;

//补充知识点：基本数据类型对应的包装类(重点注意int char)
//byte -> Byte
//short -> Short
//int -> Integer
//long -> Long
//float -> Float
//double -> Double
//char -> character
//boolean -> Boolean
public class test2 {
    public static void main(String[] args) {
        //定义一个集合，添加数字，并进行遍历
        //遍历格式：[元素1, 元素2, 元素3]
        //创建一个ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();
        //添加数据 在JDK1.5后 int integer可以互相转换
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //打印结果
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(number);
            } else {
                System.out.print(number + ", ");
            }
        }
        System.out.print("]");
    }
}
