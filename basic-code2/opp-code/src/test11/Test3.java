package test11;

public class Test3 {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1-3名学生对象作为原始数据，学生对象的学号，姓名各不相同
        学生的属性：学号，姓名，年龄
        要求5：查询数组id为2的学生，如果存在，则将他的年龄+1岁
         */
        //定义一个数组用来存储学生信息
        Student[] arr = new Student[3];
        //定义三个学生对象
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 18);
        Student stu3 = new Student(3, "王五", 19);
        //把学生对象存入数组之中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //要求5：查询数组id为2的学生，如果存在，则将他的年龄+1岁
        //获取id为2对应的索引
        int index = getIndex(arr, 2);
        if (index >= 0) {
            //存在
            Student stu = arr[index];
            //把需要修改的数据取出来
            int newAge = stu.getAge() + 1;
            //修改完成后再把他塞回去
            stu.setAge(newAge);
            //遍历所有学生信息
            printArr(arr);
        } else {
            //不存在，提示无法修改数据
            System.out.println("id不存在，无法进行修改");
        }

    }
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("学号为：" + stu.getId() + " " + "姓名为：" +
                        stu.getName() + " " + "年龄为：" + stu.getAge());
            }
        }
    }
    public static int getIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return i;
                }
            }
        }
        return -1;
    }
}
