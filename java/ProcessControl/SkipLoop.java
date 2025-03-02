package ProcessControl;

public class SkipLoop {
    public static void main(String[] args) {
        /*
        跳转控制语句：continue break
        continue:跳过本次循环，去执行下一次循环
        braek:直接结束整个循环->continue
         */
        //小老虎吃包子(5个包子)，第三个包子里面有虫子不吃
//        for (int i = 1; i <= 5; i++) {
//            if (i == 3) {
//                continue;
//            }
//            System.out.println("小老虎吃第" + i + "个包子");
//        }
        //小老虎吃包子(5个包子)，只能吃3个包子->break
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎吃第" + i + "个包子");
            if (i == 3) {
                break;
            }
        }
    }
}
