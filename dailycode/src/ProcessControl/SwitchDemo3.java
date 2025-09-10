package ProcessControl;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*
        case穿透：就是case语句中没有break导致的
        执行流程：
        首先还是会拿着表达式中的值与下方case中的值进行匹配
        如果匹配上了就会执行对应case中的语句体，如果此时发现了break，则直接结束整个switch语句
        反之没有发现break就会执行下一个case语句中的语句体，直到遇到break或者右大括号为止
         */
        int num = 10;
        switch (num) {
            case 10:
                System.out.println("结果是：" + num);
                //break;
            case 20:
                System.out.println("结果是：" + num);
                break;
            case 40:
                System.out.println("结果是：" + num);
                break;
            default:
                System.out.println("结果既不是10,也不是20，也不是40");
                break;

        }
    }
}