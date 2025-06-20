package test9;

public class PhoneTest {
    public static void main(String[] args) {
        //利用动态初始化创建数组
        Phone[] arr = new Phone[3];
        Phone p1 = new Phone("iPhone", 8999, "深空灰");
        Phone p2 = new Phone("xiaomi", 5999, "白色");
        Phone p3 = new Phone("HuaWei", 9999, "黑色");
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum = sum + phone.getPrice();
        }
        //自动生成左边 ctrl + alt + v
        int avg = sum / arr.length;
        //目前想要结果变为小数只能利用以下两种方法：
        //double avg1= (double)(sum / arr.length);->只是在int的结果后面加了个0而已
        //double avg1 = sum * 1.0 / arr.length;->比上面的都要更加精确
        System.out.println("这" + arr.length + "部手机的均价为：" + avg);
    }
}
