package Test;

import java.util.Random;

public class Test6Plus {
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
        //利用静态初始化的来定义奖池数组
        int[] arr = {2, 88, 888, 1000, 10000};
        //利用打乱数组的方式来实现打印结果
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元奖金被抽出");
        }

    }

}
