package test3;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girl1 = new GirlFriend();
        //'name' has private access in 'test3.GirlFriend'
        //girl1.name = "三三";
        //'age' has private access in 'test3.GirlFriend'
        //girl1.age = 18;
        //'gender' has private access in 'test3.GirlFriend'
        //girl1.gender = "女";
        //解决方法：在javabean类中对成员属性进行赋值 在javabean类中定义函数来使得成员属性能在测试类中使用
        girl1.setName("三三");
        girl1.setAge(18);
        girl1.setGender("女");
        System.out.println(girl1.getName());
        System.out.println(girl1.getAge());
        System.out.println(girl1.getGender());


        //可以正常调用方法
        girl1.eat();
        girl1.sleep();
    }
}
