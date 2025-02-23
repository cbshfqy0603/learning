package ProcessControl;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //兰州拉面，武汉热干面，北京炸酱面，陕西油泼面
//        String noodles = "兰州拉面";
        //switch(表达式)
        //表达式：取值为byte short int char jdk5后可以是枚举 jdk7后可以是String
//        switch (noodles) {
//            //case:后面跟的是要跟表达式相匹配的值
//            case "兰州拉面":
//                System.out.println("兰州拉面");
//                break;
//            case "武汉热干面":
//                System.out.println("武汉热干面");
//                break;
//            case "北京炸酱面":
//                System.out.println("北京炸酱面");
//                break;
//            case "陕西油泼面":
//                System.out.println("陕西油泼面");
//                break;
//            default:
//                System.out.println("去你妈的 滚 爱吃不吃");
//                break;
//    }
        //jdk12 switch新特性
//        int num = 1;
//        switch (num) {
//            case 1 -> {
//                System.out.println("数字一");
//            }
//            case 2 -> {
//                System.out.println("数字二");
//            }
//            case 3 -> {
//                System.out.println("数字三");
//            }
//            default -> {
//                System.out.println("md 都不是");
//            }
//        }
        //若case中的语句体只有一行 {} 可以去掉
        int num = 1;
        switch (num) {
            case 1 -> System.out.println("数字一");
            case 2 -> System.out.println("数字二");
            case 3 -> System.out.println("数字三");
            default -> System.out.println("md 都不是");
        }
    }
}
