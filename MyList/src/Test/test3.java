package Test;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        //定义一个集合，添加字符，并进行遍历
        //遍历格式参考：[元素1, 元素2, 元素3]
        //定义一个ArrayList集合
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            char c = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(c);
            } else {
                System.out.print(c + ", ");
            }
        }
        System.out.print("]");
    }
}
