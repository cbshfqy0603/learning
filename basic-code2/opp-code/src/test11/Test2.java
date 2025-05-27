package test11;

public class Test2 {
    public static void main(String[] args) {
         /*
        定义一个长度为3的数组，数组存储1-3名学生对象作为原始数据，学生对象的学号，姓名各不相同
        学生的属性：学号，姓名，年龄
        要求3：通过id删除学生信息
              如果存在，则删除，如果不存在，则提示删除失败
        要求4：删除完毕后，遍历所有学生的信息
         */
        //定义数组用于存储学生对象
        Student[] arr = new Student[3];
        //创建学生对象
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 18);
        Student stu3 = new Student(3, "王五", 19);
        //把已经定义好的学生对象存储在数组之中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        /*要求3：通过id删除学生信息
        如果存在，则删除，如果不存在，则提示删除失败
        要求4：删除完毕后，遍历所有学生的信息*/
        //获取对应id的索引
        int index = getIndex(arr, 2);
        if (index >= 0) {
            //存在则删除
            arr[index] = null;
            //要求4：删除完毕后，遍历所有学生的信息
            printArr(arr);
        } else {
            //不存在，则提示删除失败
            System.out.println("id不存在，删除失败");
        }
    }
    //打印数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("学号为：" + stu.getId() + " " +
                        "姓名为：" + stu.getName() + "年龄为：" + stu.getAge());
            }
        }
    }
    //我要干什么 --- 获取对应id的索引
    //为了干这些事，我需要什么 ---数组 id
    //是否需要返回值 ---当然需要
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
