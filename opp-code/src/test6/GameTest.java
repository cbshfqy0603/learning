package test6;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("鸠摩智", 100, '男');
        //显示角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();
//        while (true) {
//            r1.attack(r2);
//            if (r2.getBlood() == 0) {
//                System.out.println(r1.getName() + "KO了" + r2.getName());
//                break;
//            }
//            r2.attack(r1);
//            if (r1.getBlood() == 0) {
//                System.out.println(r2.getName() + "KO了" + r1.getName());
//                break;
//            }
//        }

    }
}
