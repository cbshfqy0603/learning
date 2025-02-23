package ProcessControl;

public class IfDemo {
    public static void main(String[] args) {
        //流程控制有三种结构：顺序结构 分支结构 循环结构 顺序结构不多赘述 直接从分支结构开始
        //if语句有三种格式：(1)单分支(2)双分支(3)多分支
        //单分支
        //(1)大括号可以另外起一行进行书写，但是建议就写在第一行后面
        //(2)如果要执行的只有一个语句，可以不用打大括号
        //(3)如果对一个布尔类型的变量进行计算，不要用"=="
//        int num = 1;
//        if (num == 1) {
//            System.out.println("num的值为" + num);
//        }
        //双分支
//        int num = 5;
//        if (num == 1) {
//            System.out.println("num的值为" + num);
//        } else {
//            System.out.println("num的值不是" + num);
//        }
        //多分支
        int num = 10;
        if (num == 5) {
            System.out.println("num的值为" + num);
        } else if (num == 10) {
            System.out.println("num的值为" + num);
        } else {
            System.out.println("num的值为" + num);
        }

    }
}
