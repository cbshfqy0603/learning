package test3;

public class GirlFriend {
    /*
    private关键字
    （1）是一个权限修饰符
    （2）可以修饰成员（成员属性和成员方法）
    （3）被修饰的成员只能在本类中访问
     */
    //成员属性
    private String name;
    private int age;
    private String gender;
    //针对每一个私有化的成员属性和成员方法
    //都要提供get()方法和set()方法
    //set():给成员变量赋值
    //get():对外提供成员变量的值
    //name:
    public void setName(String name) {
        //等号右边：局部变量表示调用方法传递过来的数据（满足就近原则:谁近我就用谁）
        //等号左边：表示成员位置的name
        //就近原则：this的作用：区分成员变量和全局变量
//        System.out.println(name);这个没有this关键字 先找局部变量 再找成员变量
//        System.out.println(this.name);有this关键字 直接找成员变量
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //age:
    public void setAge(int age) {
        if (age >= 18 && age <= 30) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }
    public int getAge() {
        return age;
    }
    //gender:
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    //成员方法
    public void sleep() {
        System.out.println("三三在睡觉😊");
    }
    public void eat() {
        System.out.println("三三在吃东西😊");
    }

}
