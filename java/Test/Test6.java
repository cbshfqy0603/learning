package Test;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        /*
        需求:一个大v直播抽奖，奖品为现金红包，奖池为{2, 88, 588, 888, 1000, 10000}
        请使用代码模拟抽奖，打印出每个奖项，奖项出现的顺序要随机且奖项不能出现重复
        打印结果如下:
        2元奖金被抽出
        88元奖金被抽出
        588元奖金被抽出
        888元奖金被抽出
        1000元奖金被抽出
        10000元奖金被抽出
         */
        //定义一个数组用于存储奖池信息
        int[] arr = {2, 88, 588, 888, 1000, 10000};
        //定义一个新数组用来存储中奖信息
        int[] newArr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            //生成0-(arr.length-1)的随机数(索引)
            int randomIndex = r.nextInt(arr.length);
            int price = arr[randomIndex];
            boolean flag = contains(newArr, price);
            if (!flag) {
                newArr[i] = price;
                //注意这里的思想:只有抽奖人抽到的奖品不存在于数组newArr数组之中奖金才能被抽取
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i] + "元奖金被抽取");
        }

    }

    //我要干什么 判断抽奖人所抽到的奖金否有效
    //我需要什么 需要数组和奖金
    //是否需要返回值 需要
    public static boolean contains(int[] newArr, int price) {
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == price) {
                return true;
            }
        }
        return false;
    }
}
