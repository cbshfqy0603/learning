package test10;

public class GirlFriendTest {
    public static void main(String[] args) {
        //定义数组用于存储对象
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("小红", 18, "女", "吃零食");
        GirlFriend gf2 = new GirlFriend("小蓝", 19, "女", "打游戏");
        GirlFriend gf3 = new GirlFriend("小黄", 20, "女", "打游戏");
        GirlFriend gf4 = new GirlFriend("小紫", 21, "女", "弹琴,读书");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum = sum + gf.getAge();
        }
        //快速补全快捷键:ctrl + alt + v
        int avg = sum / arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " +
                         gf.getGender()  + ", " + gf.getHobby());
            }
        }
        System.out.println("小于平均年龄的一共有" + count + "位");
    }
}
