package Test;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //定义一个集合，添加字符串，并进行遍历
        //遍历格式参考：[元素1, 元素2, 元素3]
        //定义一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        //添加字符串
        list.add("时崎狂三");
        list.add("夜刀神十香");
        list.add("镜野七罪");
        list.add("五和琴里");
        list.add("鸢一折纸");
        list.add("八舞夕俱矢");
        list.add("八舞夕弦");
        list.add("本条二亚");
        list.add("四系乃");
        list.add("星空六喰");
        list.add("诱宵美九");
        list.add("崇宫澪");
        //输出结果
        //System.out.println(list);直接打印list也能展示出题意结果 只不过题目要求遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(str);
            } else {
                System.out.print(str + ", ");
            }
        }
        System.out.print("]");

    }
}
