package ProcessControl;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //default的位置和省略
        //位置：default不一定要写在最下面，可以写在任意位置，只不过习惯写在最下面
        //省略：default可以省略，在语法上不会发生任何问题，只不过不建议省略
        int num = 100;
        switch (num) {
            default:
                System.out.println("结果既不是10,也不是20，也不是40");
                break;
            case 10:
                System.out.println("结果是：" + num);
                break;
            case 20:
                System.out.println("结果是：" + num);
                break;
            case 40:
                System.out.println("结果是：" + num);
                break;
//            default:
//                System.out.println("结果既不是10,也不是20，也不是40");
//                break;
        }
    }
}
